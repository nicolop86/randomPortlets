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

import it.ariadne.prova.registration.model.PRRegistration;
import it.ariadne.prova.registration.service.base.PRRegistrationLocalServiceBaseImpl;

import java.util.List;

/**
 * The implementation of the p r registration local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link it.ariadne.prova.registration.service.PRRegistrationLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Politi
 * @see it.ariadne.prova.registration.service.base.PRRegistrationLocalServiceBaseImpl
 * @see it.ariadne.prova.registration.service.PRRegistrationLocalServiceUtil
 */
public class PRRegistrationLocalServiceImpl
extends PRRegistrationLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link it.ariadne.prova.registration.service.PRRegistrationLocalServiceUtil} to access the p r registration local service.
	 */

	public PRRegistration addRegistration(PRRegistration reg) throws SystemException, PortalException {

		PRRegistration registration = prRegistrationPersistence.create(counterLocalService.increment(PRRegistration.class.getName()));

		registration.setCompanyId(reg.getCompanyId());
		registration.setDatePurchased(reg.getDatePurchased());
		registration.setGroupId(reg.getGroupId());
		registration.setHowHear(reg.getHowHear());
		registration.setProductId(reg.getProductId());
		registration.setPrUserId(reg.getPrUserId());
		registration.setSerialNumber(reg.getSerialNumber());
		registration.setWherePurchased(reg.getWherePurchased());

		resourceLocalService.addResources(registration.getCompanyId(), registration.getGroupId(),
				PRRegistration.class.getName(), false);

		return prRegistrationPersistence.update(registration);
	}

	public List<PRRegistration> getAllRegistrations(long groupId) throws SystemException {

		List<PRRegistration> registrations = prRegistrationPersistence.findByGroupId(groupId);
		return registrations;
	}
	
	public List<PRRegistration> getUserRegistations(long groupId, long prUserId) throws SystemException{
		
		List<PRRegistration> registrations = prRegistrationPersistence.findByG_RU(groupId, prUserId);
		return registrations;
	}
}