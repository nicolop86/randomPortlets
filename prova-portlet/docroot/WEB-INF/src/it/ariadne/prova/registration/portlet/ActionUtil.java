package it.ariadne.prova.registration.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;

import it.ariadne.prova.registration.model.PRProduct;
import it.ariadne.prova.registration.model.PRRegistration;
import it.ariadne.prova.registration.model.PRUser;
import it.ariadne.prova.registration.model.impl.PRProductImpl;
import it.ariadne.prova.registration.model.impl.PRRegistrationImpl;
import it.ariadne.prova.registration.model.impl.PRUserImpl;
import it.ariadne.prova.registration.service.PRProductLocalServiceUtil;
import it.ariadne.prova.registration.service.PRRegistrationLocalServiceUtil;
import it.ariadne.prova.registration.service.PRUserLocalServiceUtil;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.RenderRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ActionUtil {

	private final static Log _log = LogFactory.getLog(ActionUtil.class);

	public static PRProduct productFromRequest (ActionRequest request) {
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		PRProduct product = new PRProductImpl();

		product.setCompanyId(themeDisplay.getCompanyId());
		product.setGroupId(themeDisplay.getScopeGroupId());
		product.setProductName(ParamUtil.getString(request, "productName"));
		product.setSerialNumber(ParamUtil.getString(request, "productSerial"));

		return product;
	}
	
	public static List<PRRegistration> getRegistration(RenderRequest request) throws SystemException{
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		long userId = themeDisplay.getUserId();
		long groupId = themeDisplay.getScopeGroupId();
		PRUser user = PRUserLocalServiceUtil.getPRUser(groupId, userId);
		long prUserId = user.getPrUserId();
		if(_log.isInfoEnabled()){
			_log.info("ActionUtil.getRegistration for userId " + prUserId);
		}
		List<PRRegistration> regList;
		try{
			regList = PRRegistrationLocalServiceUtil.getUserRegistations(groupId, prUserId);
		} catch(SystemException e){
			regList = Collections.emptyList();
		}
		return regList;
	}

	public static List<PRProduct> getProducts (RenderRequest request) {
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		long groupId = themeDisplay.getScopeGroupId();
		List<PRProduct> productList;
		try {
			productList = PRProductLocalServiceUtil.getAllProducts(groupId);
		} catch(SystemException e) {
			productList = Collections.emptyList();
		}
		return productList;
	}

	public static PRRegistration prRegistrationFromRequest(ActionRequest req){
		ThemeDisplay themeDisplay = (ThemeDisplay) req.getAttribute(WebKeys.THEME_DISPLAY);
		PRRegistration registration = new PRRegistrationImpl();

		registration.setCompanyId(themeDisplay.getCompanyId());
		registration.setGroupId(themeDisplay.getScopeGroupId());

		int datePurchasedMonth = ParamUtil.getInteger(req, "datePurchasedMonth");
		int datePurchasedDay = ParamUtil.getInteger(req, "datePurchasedDay");
		int datePurchasedYear = ParamUtil.getInteger(req, "datePurchasedYear");

		try {
			registration.setDatePurchased(PortalUtil.getDate(datePurchasedMonth, datePurchasedDay, datePurchasedYear, (new PortalException()).getClass()));
		} catch (PortalException ex) {
			registration.setDatePurchased(new Date());
		}

		registration.setHowHear(ParamUtil.getString(req, "howHear"));
		registration.setProductId(Long.parseLong(ParamUtil.getString(req, "productType")));
		registration.setPrUserId(ParamUtil.getLong(req, "regUserId"));
		registration.setSerialNumber(ParamUtil.getString(req, "productSerialNumber"));
		registration.setWherePurchased(ParamUtil.getString(req, "wherePurchase"));

		return registration;
	}

	public static PRUser prUserFromRequest(ActionRequest request) {
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		PRUser prUser = new PRUserImpl();

		prUser.setCompanyId(themeDisplay.getCompanyId());
		prUser.setGroupId(themeDisplay.getScopeGroupId());
		prUser.setFirstName(ParamUtil.getString(request, "firstName"));
		prUser.setLastName(ParamUtil.getString(request, "lastName"));
		prUser.setAddress1(ParamUtil.getString(request, "address1"));
		prUser.setAddress2(ParamUtil.getString(request, "address2"));
		prUser.setCity(ParamUtil.getString(request, "city"));
		prUser.setState(ParamUtil.getString(request, "state"));
		prUser.setPostalCode(ParamUtil.getString(request, "postalCode"));
		prUser.setPhoneNumber(ParamUtil.getString(request, "phoneNumber"));
		prUser.setCountry(ParamUtil.getString(request, "country"));
		prUser.setEmail(ParamUtil.getString(request, "emailAddress"));
		String gender = ParamUtil.getString(request, "gender");

		int birthDateMonth = ParamUtil.getInteger(request, "birthDateMonth");
		int birthDateDay = ParamUtil.getInteger(request, "birthDateDay");
		int birthDateYear = ParamUtil.getInteger(request, "birthDateYear");

		try {

			prUser.setBirthDate(PortalUtil.getDate(birthDateMonth, birthDateDay, birthDateYear, (new PortalException()).getClass()));

		} catch (PortalException ex) {
			prUser.setBirthDate(new Date());
		}

		if (!gender.equals("")) {

			if (gender.equalsIgnoreCase("male")) {
				prUser.setMale(true);
				prUser.setGender("male");

			} else {
				prUser.setMale(false);
				prUser.setGender("female");
			}

		} else {
			prUser.setGender(null);
		}

		return prUser;

	}

}
