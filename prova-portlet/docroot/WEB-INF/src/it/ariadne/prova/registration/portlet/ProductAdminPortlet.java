package it.ariadne.prova.registration.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.util.bridges.mvc.MVCPortlet;

import it.ariadne.prova.registration.NoSuchPRProductException;
import it.ariadne.prova.registration.model.PRProduct;
import it.ariadne.prova.registration.service.PRProductLocalServiceUtil;

import java.util.ArrayList;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ProductAdminPortlet extends MVCPortlet{

	public static final Log _log = LogFactory.getLog(ProductAdminPortlet.class);
	protected String editProductJSP;

	public void addProduct(ActionRequest request, ActionResponse response) throws PortalException, SystemException{
		if(_log.isInfoEnabled()){
			_log.info("addProduct method called");
		}
		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		PRProduct product = ActionUtil.productFromRequest(request);
		ArrayList<String> errors = new ArrayList<String>();

		if (ProdRegValidator.validateProduct(product, errors)) {
			if(_log.isInfoEnabled()){
				_log.info("Product " + product.getProductName() + " is going to be added");
			}
			PRProductLocalServiceUtil.addProduct(product,themeDisplay.getUserId());
			SessionMessages.add(request, "product-saved-successfully");
		} else {
			if(_log.isErrorEnabled()){
				_log.error("Error adding product " + product.getProductName());
			}
			SessionErrors.add(request, "fields-required");
		}

	}

	public void deleteProduct(ActionRequest req, ActionResponse resp) throws NoSuchPRProductException, PortalException, SystemException{
		if(_log.isInfoEnabled()){
			_log.info("deleteProduct method called");
		}
		long productId = ParamUtil.getLong(req,"resourcePrimKey");

		if (Validator.isNotNull(productId)) {
			if(_log.isInfoEnabled()){
				_log.info("Deleting product with ID: " + productId);
			}
			PRProductLocalServiceUtil.deleteProduct(productId);
			SessionMessages.add(req, "productDeleted");
		} else {
			if(_log.isErrorEnabled()){
				_log.error("Error deleting product with ID: " + productId);
			}
			SessionErrors.add(req, "error-deleting");
		}

	}

	public void editProduct(ActionRequest request, ActionResponse response) throws Exception {
		if(_log.isInfoEnabled()){
			_log.info("editProduct method called");
		}
		editProductJSP = getInitParameter("edit-product");
		long productKey = ParamUtil.getLong(request, "resourcePrimKey");
		if (Validator.isNotNull(productKey)) {
			if(_log.isInfoEnabled()){
				_log.info("Editing product with ID: " + productKey);
			}
			PRProduct product =	PRProductLocalServiceUtil.getPRProduct(productKey);
			request.setAttribute("product", product);
			response.setRenderParameter("jspPage", editProductJSP);
		}
	}

	public void updateProduct(ActionRequest req, ActionResponse resp) throws PortalException, SystemException{
		if(_log.isInfoEnabled()){
			_log.info("updateProduct method called");
		}
		long productId = ParamUtil.getLong(req, "resourcePrimKey");

		ArrayList<String> errors = new ArrayList();
		if(Validator.isNotNull(productId)){

			PRProduct product = PRProductLocalServiceUtil.getPRProduct(productId);
			PRProduct requestProduct = ActionUtil.productFromRequest(req);

			if (ProdRegValidator.validateProduct(requestProduct, errors)) {
				if(_log.isInfoEnabled()){
					_log.info("Updating product with ID: " + productId);
				}
				product.setProductName(requestProduct.getProductName());
				product.setSerialNumber(requestProduct.getSerialNumber());
				PRProductLocalServiceUtil.updatePRProduct(product);
				SessionMessages.add(req, "productUpdated");

			} else {
				if(_log.isErrorEnabled()){
					_log.error("Error updating product with ID: " + productId);
				}
				for (String error : errors) {
					SessionErrors.add(req, error);

				}

			}

		} else {
			SessionErrors.add(req, "error-updating");
		}
	}

}