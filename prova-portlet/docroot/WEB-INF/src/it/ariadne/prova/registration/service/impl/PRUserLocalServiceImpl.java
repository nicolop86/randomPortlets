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

import it.ariadne.prova.registration.model.PRUser;
import it.ariadne.prova.registration.service.base.PRUserLocalServiceBaseImpl;

import java.util.List;

/**
 * The implementation of the p r user local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link it.ariadne.prova.registration.service.PRUserLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Politi
 * @see it.ariadne.prova.registration.service.base.PRUserLocalServiceBaseImpl
 * @see it.ariadne.prova.registration.service.PRUserLocalServiceUtil
 */
public class PRUserLocalServiceImpl extends PRUserLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link it.ariadne.prova.registration.service.PRUserLocalServiceUtil} to access the p r user local service.
	 */

	public PRUser addPRUser(PRUser user, long userId) throws SystemException, PortalException {

		PRUser prUser = prUserPersistence.create(counterLocalService.increment(PRUser.class.getName()));

		prUser.setAddress1(user.getAddress1());
		prUser.setAddress2(user.getAddress2());
		prUser.setBirthDate(user.getBirthDate());
		prUser.setCity(user.getCity());
		prUser.setCompanyId(user.getCompanyId());
		prUser.setCountry(user.getCountry());
		prUser.setEmail(user.getEmail());
		prUser.setFirstName(user.getFirstName());
		prUser.setGroupId(user.getGroupId());
		prUser.setLastName(user.getLastName());
		prUser.setMale(user.getMale());
		prUser.setPhoneNumber(user.getPhoneNumber());
		prUser.setPostalCode(user.getPostalCode());
		prUser.setState(user.getState());
		prUser.setUserId(user.getUserId());

		resourceLocalService.addResources(prUser.getCompanyId(), prUser.getGroupId(),
				PRUser.class.getName(), false);

		return prUserPersistence.update(prUser);
	}

	public PRUser getPRUser(long groupId, long userId)
			throws SystemException {

		List<PRUser> prUserList = prUserPersistence.findByG_U(groupId, userId);

		PRUser prUser = null;

		if (prUserList.size() > 0) {
			prUser = prUserList.get(0);
		}

		return prUser;
	}
}