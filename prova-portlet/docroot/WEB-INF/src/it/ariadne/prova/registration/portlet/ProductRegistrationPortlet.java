package it.ariadne.prova.registration.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.CalendarFactoryUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.Address;
import com.liferay.portal.model.User;
import com.liferay.portal.service.AddressLocalServiceUtil;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;

import it.ariadne.prova.registration.model.PRRegistration;
import it.ariadne.prova.registration.model.PRUser;
import it.ariadne.prova.registration.model.impl.PRRegistrationImpl;
import it.ariadne.prova.registration.model.impl.PRUserImpl;
import it.ariadne.prova.registration.service.PRRegistrationLocalServiceUtil;
import it.ariadne.prova.registration.service.PRUserLocalServiceUtil;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ProductRegistrationPortlet extends MVCPortlet {
	
	public static final Log _log = LogFactory.getLog(ProductRegistrationPortlet.class);
	protected String viewAddRegistrationJSP;
	protected String viewThankYouJSP;

	public void addRegistration(ActionRequest request, ActionResponse response) {
		if(_log.isInfoEnabled()){
			_log.info("addRegistration method called");
		}
		viewAddRegistrationJSP = getInitParameter("view-add-registration");

		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

		PRRegistration registration = new PRRegistrationImpl();
		PRUser prUser = new PRUserImpl();

		if (themeDisplay.isSignedIn()) {
			User user = themeDisplay.getUser();
			if(_log.isInfoEnabled()){
				_log.info("User is signed in with ID: " + user.getUserId());
			}
			// Now that we have a user, let's see if the portal
			// knows anything about him or her that we can use on the form
			List<Address> addresses = Collections.emptyList();
			Address homeAddr = null;

			try {
				addresses = AddressLocalServiceUtil.getAddresses(user.getCompanyId(), User.class.getName(), user.getUserId());
			}
			catch (SystemException ex) {
				// No addresses available; do nothing
			}
			if (addresses.size() > 0) {
				// simple flow; just grab the first one
				homeAddr = addresses.get(0);
			}
			// populate what we can of our registration
			if(_log.isInfoEnabled()){
				_log.info("Populating form with available information: " + user.getFirstName() + ", " + user.getLastName()
						+ ", " + user.getEmailAddress());
			}
			prUser.setFirstName(user.getFirstName());
			prUser.setLastName(user.getLastName());
			prUser.setEmail(user.getEmailAddress());
			try {
				prUser.setBirthDate(user.getBirthday());
				boolean male = user.getMale();
				if (male) {
					prUser.setGender("male");
				}
				else {
					prUser.setGender("female");
				}
				prUser.setMale(male);
			}
			catch (PortalException e) {
				prUser.setBirthDate(new Date());
			}
			catch (SystemException e) {
				prUser.setMale(true);
			}

			if (homeAddr != null) {
				prUser.setAddress1(homeAddr.getStreet1());
				prUser.setAddress2(homeAddr.getStreet2());
				prUser.setCity(homeAddr.getCity());
				prUser.setPostalCode(homeAddr.getZip());
				prUser.setCountry(homeAddr.getCountry().toString());
			}
			// Our regUser might have stuff in it now
			registration.setDatePurchased(new Date());
		} else {
			// user isn't logged in
			if(_log.isInfoEnabled()){
				_log.info("User is not signed in, setting default parameters on form");
			}
			registration.setDatePurchased(new Date());
			Calendar dob = CalendarFactoryUtil.getCalendar();
			dob.set(Calendar.YEAR, 1970);
			prUser.setBirthDate(dob.getTime());
			prUser.setGender("");
		}

		request.setAttribute("regUser", prUser);
		request.setAttribute("registration", registration);
		response.setRenderParameter("jspPage", viewAddRegistrationJSP);
	}

	public void registerProduct(ActionRequest request, ActionResponse response) throws Exception {
		if(_log.isInfoEnabled()){
			_log.info("registerProduct method called");
		}
		viewAddRegistrationJSP = getInitParameter("view-add-registration");
		viewThankYouJSP = getInitParameter("view-thank-you");
		PRUser regUser = ActionUtil.prUserFromRequest(request);
		PRRegistration registration = ActionUtil.prRegistrationFromRequest(request);
		ArrayList<String> errors = new ArrayList<String>();
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		long userId = themeDisplay.getUserId();

		User liferayUser = UserLocalServiceUtil.getUser(userId);

		boolean userValid = ProdRegValidator.validateUser(regUser, errors);
		boolean regValid = ProdRegValidator.validateRegistration(registration, errors);

		if (userValid && regValid) {
			// TODO: Logic needs to change here for multiple registrations and
			// to check for logged-in users
			if(_log.isInfoEnabled()){
				_log.info("User and registration are valid");
			}
			PRUser user = null;

			// check to see if user is a guest
			if (liferayUser.isDefaultUser()) {
				userId = 0;
				user = PRUserLocalServiceUtil.addPRUser(regUser, userId);
				if(_log.isInfoEnabled()){
					_log.info("Guest user (not logged in)");
				}
			} else {
				// Check to see if we have a PR User from the Liferay user ID
				if(_log.isInfoEnabled()){
					_log.info("Signed in user, trying to get user from PRUser pool");
				}
				user =	PRUserLocalServiceUtil.getPRUser(themeDisplay.getScopeGroupId(), userId);

				if (user == null) {
					// Create a new mapping
					if(_log.isInfoEnabled()){
						_log.info("Creating a new mapping for user on PRUser table");
					}
					regUser.setUserId(userId);
					user = PRUserLocalServiceUtil.addPRUser(regUser, userId);
				}
			}

			registration.setPrUserId(user.getPrUserId());
			PRRegistration addedReg = PRRegistrationLocalServiceUtil.addRegistration(registration);
			PRUserLocalServiceUtil.addPRRegistrationPRUser(addedReg.getRegistrationId(), user.getPrUserId());

			if(_log.isInfoEnabled()){
				_log.info("Storing registration and user information; relation table User/Registration is going to be updated");
			}
			
			SessionMessages.add(request, "registration-saved-successfully");
			response.setRenderParameter("jspPage", viewThankYouJSP);
		} else {
			if(_log.isInfoEnabled()){
				_log.info("There are some errors, product will not be registered");
			}
			for (String error : errors) {
				SessionErrors.add(request, error);
			}
			SessionErrors.add(request, "error-saving-registration");
			response.setRenderParameter("jspPage", viewAddRegistrationJSP);
			request.setAttribute("regUser", regUser);
			request.setAttribute("registration", registration);
		}
	}

}