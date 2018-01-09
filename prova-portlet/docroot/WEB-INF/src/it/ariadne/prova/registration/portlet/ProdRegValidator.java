package it.ariadne.prova.registration.portlet;

import com.liferay.portal.kernel.util.Validator;

import it.ariadne.prova.registration.model.PRProduct;
import it.ariadne.prova.registration.model.PRRegistration;
import it.ariadne.prova.registration.model.PRUser;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class ProdRegValidator {

	public static boolean validateProduct(PRProduct product, List<String> errors) {

		boolean valid = true;

		if (Validator.isNull(product.getProductName())) {
			errors.add("product-name-required");
			valid = false;
		}

		if (Validator.isNull(product.getSerialNumber())) {
			errors.add("serial-number-prefix-required");
			valid = false;
		}

		if (Validator.isNull(product.getCompanyId())) {
			errors.add("missing-company-id");
			valid = false;
		}

		if (Validator.isNull(product.getGroupId())) {
			errors.add("missing-group-id");
			valid = false;
		}

		return valid;
	}

	public static boolean validateUser(PRUser user, List<String> errors) {

		boolean valid = true;

		if (Validator.isNull(user.getFirstName())) {
			errors.add("firstname-required");
			valid = false;
		}

		if (Validator.isNull(user.getLastName())) {
			errors.add("lastname-required");
			valid = false;
		}

		if (Validator.isNull(user.getAddress1()) ||
				Validator.isNull(user.getCity()) ||
				Validator.isNull(user.getState()) ||
				Validator.isNull(user.getPostalCode()) ||
				Validator.isNull(user.getCountry())) {

			errors.add("address-required");
			valid = false;
		}

		if (Validator.isNull(user.getEmail())) {
			errors.add("email-required");
			valid = false;
		}

		if (Validator.isNull(user.getPhoneNumber())) {
			errors.add("phone-number-required");
			valid = false;
		}
		else {

			if (!Validator.isPhoneNumber(user.getPhoneNumber())) {
				errors.add("phone-number-required");
				valid = false;
			}

		}

		if (Validator.isNotNull(user.getBirthDate())) {
			Calendar calendar = new GregorianCalendar();
			calendar.setTime(user.getBirthDate());
			if (!Validator.isDate(
					calendar.get(Calendar.MONTH),
					calendar.get(Calendar.DAY_OF_MONTH),
					calendar.get(Calendar.YEAR))) {
				errors.add("enter-valid-date");
				valid = false;
			}
		}
		else {
			errors.add("birthdate-required");
			valid = false;
		}

		if (Validator.isNull(user.getGender())) {
			errors.add("gender-required");
			valid = false;
		}

		if (Validator.isNull(user.getCompanyId())) {
			errors.add("missing-company-id");
			valid = false;
		}

		if (Validator.isNull(user.getGroupId())) {
			errors.add("missing-group-id");
			valid = false;
		}

		return valid;

	}
	public static boolean validateRegistration(PRRegistration registration, List errors) throws Exception {

	        boolean valid = true;

	        if (Validator.isNull(registration.getCompanyId())) {
	            errors.add("missing-company-id");
	            valid = false;
	        }

	        if (Validator.isNull(registration.getGroupId())) {
	            errors.add("missing-group-id");
	            valid = false;
	        }

	        if (Validator.isNull(registration.getHowHear())) {
	            errors.add("howhear-required");
	            valid = false;
	        }

	        if (Validator.isNull(registration.getProductId())) {
	            errors.add("product-type-required");
	            valid = false;
	        }

	        if (Validator.isNull(registration.getSerialNumber())) {
	            errors.add("serial-number-required");
	            valid = false;
	        }

	        if (Validator.isNotNull(registration.getDatePurchased())) {
	            Calendar calendar = new GregorianCalendar();
	            calendar.setTime(registration.getDatePurchased());
	            if (!Validator.isDate(
	                calendar.get(Calendar.MONTH),
	                calendar.get(Calendar.DAY_OF_MONTH),
	                calendar.get(Calendar.YEAR))) {
	                errors.add("enter-valid-date");
	                valid = false;
	            }
	        }
	        else {
	            errors.add("date-purchased-required");
	            valid = false;
	        }

	        if (Validator.isNull(registration.getWherePurchased())) {
	            errors.add("where-purchased-required");
	            valid = false;
	        }

	        if (registration.getProductId() == -1) {
	            errors.add("product-type-required");
	            valid = false;
	        }

	        return valid;

	    }

}
