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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the PRProduct service. Represents a row in the &quot;prreg_PRProduct&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link it.ariadne.prova.registration.model.impl.PRProductModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link it.ariadne.prova.registration.model.impl.PRProductImpl}.
 * </p>
 *
 * @author Politi
 * @see PRProduct
 * @see it.ariadne.prova.registration.model.impl.PRProductImpl
 * @see it.ariadne.prova.registration.model.impl.PRProductModelImpl
 * @generated
 */
public interface PRProductModel extends BaseModel<PRProduct> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a p r product model instance should use the {@link PRProduct} interface instead.
	 */

	/**
	 * Returns the primary key of this p r product.
	 *
	 * @return the primary key of this p r product
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this p r product.
	 *
	 * @param primaryKey the primary key of this p r product
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the product ID of this p r product.
	 *
	 * @return the product ID of this p r product
	 */
	public long getProductId();

	/**
	 * Sets the product ID of this p r product.
	 *
	 * @param productId the product ID of this p r product
	 */
	public void setProductId(long productId);

	/**
	 * Returns the product name of this p r product.
	 *
	 * @return the product name of this p r product
	 */
	@AutoEscape
	public String getProductName();

	/**
	 * Sets the product name of this p r product.
	 *
	 * @param productName the product name of this p r product
	 */
	public void setProductName(String productName);

	/**
	 * Returns the serial number of this p r product.
	 *
	 * @return the serial number of this p r product
	 */
	@AutoEscape
	public String getSerialNumber();

	/**
	 * Sets the serial number of this p r product.
	 *
	 * @param serialNumber the serial number of this p r product
	 */
	public void setSerialNumber(String serialNumber);

	/**
	 * Returns the company ID of this p r product.
	 *
	 * @return the company ID of this p r product
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this p r product.
	 *
	 * @param companyId the company ID of this p r product
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this p r product.
	 *
	 * @return the group ID of this p r product
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this p r product.
	 *
	 * @param groupId the group ID of this p r product
	 */
	public void setGroupId(long groupId);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(
		it.ariadne.prova.registration.model.PRProduct prProduct);

	@Override
	public int hashCode();

	@Override
	public CacheModel<it.ariadne.prova.registration.model.PRProduct> toCacheModel();

	@Override
	public it.ariadne.prova.registration.model.PRProduct toEscapedModel();

	@Override
	public it.ariadne.prova.registration.model.PRProduct toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}