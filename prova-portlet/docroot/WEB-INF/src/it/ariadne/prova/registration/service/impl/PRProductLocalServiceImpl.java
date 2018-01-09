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

package it.ariadne.prova.registration.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.ResourceConstants;

import it.ariadne.prova.registration.NoSuchPRProductException;
import it.ariadne.prova.registration.model.PRProduct;
import it.ariadne.prova.registration.service.base.PRProductLocalServiceBaseImpl;

import java.util.List;

/**
 * The implementation of the p r product local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link it.ariadne.prova.registration.service.PRProductLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Politi
 * @see it.ariadne.prova.registration.service.base.PRProductLocalServiceBaseImpl
 * @see it.ariadne.prova.registration.service.PRProductLocalServiceUtil
 */
public class PRProductLocalServiceImpl extends PRProductLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link it.ariadne.prova.registration.service.PRProductLocalServiceUtil} to access the p r product local service.
	 */

	public PRProduct addProduct(PRProduct newProduct, long userId) throws SystemException, PortalException {
		PRProduct product = prProductPersistence.create(counterLocalService.increment(PRProduct.class.getName()));

		resourceLocalService.addResources(newProduct.getCompanyId(),newProduct.getGroupId(), userId,
				PRProduct.class.getName(), product.getPrimaryKey(), false, true, true);

		product.setProductName(newProduct.getProductName());
		product.setSerialNumber(newProduct.getSerialNumber());
		product.setCompanyId(newProduct.getCompanyId());
		product.setGroupId(newProduct.getGroupId());

		return prProductPersistence.update(product);
	}

	public void deleteProduct(long productId) throws NoSuchPRProductException, SystemException, PortalException {
		PRProduct product =	prProductPersistence.findByPrimaryKey(productId);
		deleteProduct(product);
	}

	public void deleteProduct(PRProduct product) throws PortalException, SystemException {
		resourceLocalService.deleteResource(product.getCompanyId(), PRProduct.class.getName(),
				ResourceConstants.SCOPE_INDIVIDUAL, product.getPrimaryKey());
		prProductPersistence.remove(product);
	}

	public List<PRProduct> getAllProducts(long groupId) throws SystemException {
		List<PRProduct> products = prProductPersistence.findByGroupId(groupId);
		return products;
	}
}