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

package it.ariadne.prova.registration.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import it.ariadne.prova.registration.model.PRRegistration;
import it.ariadne.prova.registration.service.PRRegistrationLocalServiceUtil;

/**
 * @author Politi
 * @generated
 */
public abstract class PRRegistrationActionableDynamicQuery
	extends BaseActionableDynamicQuery {
	public PRRegistrationActionableDynamicQuery() throws SystemException {
		setBaseLocalService(PRRegistrationLocalServiceUtil.getService());
		setClass(PRRegistration.class);

		setClassLoader(it.ariadne.prova.registration.service.ClpSerializer.class.getClassLoader());

		setPrimaryKeyPropertyName("registrationId");
	}
}