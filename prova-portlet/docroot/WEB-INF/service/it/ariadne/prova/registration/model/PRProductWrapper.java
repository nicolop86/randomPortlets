/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */

package it.ariadne.prova.registration.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link PRProduct}.
 * </p>
 *
 * @author Politi
 * @see PRProduct
 * @generated
 */
public class PRProductWrapper implements PRProduct, ModelWrapper<PRProduct> {
	public PRProductWrapper(PRProduct prProduct) {
		_prProduct = prProduct;
	}

	@Override
	public Class<?> getModelClass() {
		return PRProduct.class;
	}

	@Override
	public String getModelClassName() {
		return PRProduct.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("productId", getProductId());
		attributes.put("productName", getProductName());
		attributes.put("serialNumber", getSerialNumber());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long productId = (Long)attributes.get("productId");

		if (productId != null) {
			setProductId(productId);
		}

		String productName = (String)attributes.get("productName");

		if (productName != null) {
			setProductName(productName);
		}

		String serialNumber = (String)attributes.get("serialNumber");

		if (serialNumber != null) {
			setSerialNumber(serialNumber);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}
	}

	/**
	* Returns the primary key of this p r product.
	*
	* @return the primary key of this p r product
	*/
	@Override
	public long getPrimaryKey() {
		return _prProduct.getPrimaryKey();
	}

	/**
	* Sets the primary key of this p r product.
	*
	* @param primaryKey the primary key of this p r product
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_prProduct.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the product ID of this p r product.
	*
	* @return the product ID of this p r product
	*/
	@Override
	public long getProductId() {
		return _prProduct.getProductId();
	}

	/**
	* Sets the product ID of this p r product.
	*
	* @param productId the product ID of this p r product
	*/
	@Override
	public void setProductId(long productId) {
		_prProduct.setProductId(productId);
	}

	/**
	* Returns the product name of this p r product.
	*
	* @return the product name of this p r product
	*/
	@Override
	public java.lang.String getProductName() {
		return _prProduct.getProductName();
	}

	/**
	* Sets the product name of this p r product.
	*
	* @param productName the product name of this p r product
	*/
	@Override
	public void setProductName(java.lang.String productName) {
		_prProduct.setProductName(productName);
	}

	/**
	* Returns the serial number of this p r product.
	*
	* @return the serial number of this p r product
	*/
	@Override
	public java.lang.String getSerialNumber() {
		return _prProduct.getSerialNumber();
	}

	/**
	* Sets the serial number of this p r product.
	*
	* @param serialNumber the serial number of this p r product
	*/
	@Override
	public void setSerialNumber(java.lang.String serialNumber) {
		_prProduct.setSerialNumber(serialNumber);
	}

	/**
	* Returns the company ID of this p r product.
	*
	* @return the company ID of this p r product
	*/
	@Override
	public long getCompanyId() {
		return _prProduct.getCompanyId();
	}

	/**
	* Sets the company ID of this p r product.
	*
	* @param companyId the company ID of this p r product
	*/
	@Override
	public void setCompanyId(long companyId) {
		_prProduct.setCompanyId(companyId);
	}

	/**
	* Returns the group ID of this p r product.
	*
	* @return the group ID of this p r product
	*/
	@Override
	public long getGroupId() {
		return _prProduct.getGroupId();
	}

	/**
	* Sets the group ID of this p r product.
	*
	* @param groupId the group ID of this p r product
	*/
	@Override
	public void setGroupId(long groupId) {
		_prProduct.setGroupId(groupId);
	}

	@Override
	public boolean isNew() {
		return _prProduct.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_prProduct.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _prProduct.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_prProduct.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _prProduct.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _prProduct.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_prProduct.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _prProduct.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_prProduct.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_prProduct.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_prProduct.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new PRProductWrapper((PRProduct)_prProduct.clone());
	}

	@Override
	public int compareTo(
		it.ariadne.prova.registration.model.PRProduct prProduct) {
		return _prProduct.compareTo(prProduct);
	}

	@Override
	public int hashCode() {
		return _prProduct.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<it.ariadne.prova.registration.model.PRProduct> toCacheModel() {
		return _prProduct.toCacheModel();
	}

	@Override
	public it.ariadne.prova.registration.model.PRProduct toEscapedModel() {
		return new PRProductWrapper(_prProduct.toEscapedModel());
	}

	@Override
	public it.ariadne.prova.registration.model.PRProduct toUnescapedModel() {
		return new PRProductWrapper(_prProduct.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _prProduct.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _prProduct.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_prProduct.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PRProductWrapper)) {
			return false;
		}

		PRProductWrapper prProductWrapper = (PRProductWrapper)obj;

		if (Validator.equals(_prProduct, prProductWrapper._prProduct)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public PRProduct getWrappedPRProduct() {
		return _prProduct;
	}

	@Override
	public PRProduct getWrappedModel() {
		return _prProduct;
	}

	@Override
	public void resetOriginalValues() {
		_prProduct.resetOriginalValues();
	}

	private PRProduct _prProduct;
}