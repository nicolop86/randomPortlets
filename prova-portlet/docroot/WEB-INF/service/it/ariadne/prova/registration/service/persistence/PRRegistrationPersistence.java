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

import com.liferay.portal.service.persistence.BasePersistence;

import it.ariadne.prova.registration.model.PRRegistration;

/**
 * The persistence interface for the p r registration service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Politi
 * @see PRRegistrationPersistenceImpl
 * @see PRRegistrationUtil
 * @generated
 */
public interface PRRegistrationPersistence extends BasePersistence<PRRegistration> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PRRegistrationUtil} to access the p r registration persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the p r registrations where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching p r registrations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.ariadne.prova.registration.model.PRRegistration> findByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the p r registrations where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.ariadne.prova.registration.model.impl.PRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of p r registrations
	* @param end the upper bound of the range of p r registrations (not inclusive)
	* @return the range of matching p r registrations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.ariadne.prova.registration.model.PRRegistration> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the p r registrations where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.ariadne.prova.registration.model.impl.PRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of p r registrations
	* @param end the upper bound of the range of p r registrations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching p r registrations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.ariadne.prova.registration.model.PRRegistration> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first p r registration in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching p r registration
	* @throws it.ariadne.prova.registration.NoSuchPRRegistrationException if a matching p r registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.ariadne.prova.registration.model.PRRegistration findByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.ariadne.prova.registration.NoSuchPRRegistrationException;

	/**
	* Returns the first p r registration in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching p r registration, or <code>null</code> if a matching p r registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.ariadne.prova.registration.model.PRRegistration fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last p r registration in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching p r registration
	* @throws it.ariadne.prova.registration.NoSuchPRRegistrationException if a matching p r registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.ariadne.prova.registration.model.PRRegistration findByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.ariadne.prova.registration.NoSuchPRRegistrationException;

	/**
	* Returns the last p r registration in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching p r registration, or <code>null</code> if a matching p r registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.ariadne.prova.registration.model.PRRegistration fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the p r registrations before and after the current p r registration in the ordered set where groupId = &#63;.
	*
	* @param registrationId the primary key of the current p r registration
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next p r registration
	* @throws it.ariadne.prova.registration.NoSuchPRRegistrationException if a p r registration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.ariadne.prova.registration.model.PRRegistration[] findByGroupId_PrevAndNext(
		long registrationId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.ariadne.prova.registration.NoSuchPRRegistrationException;

	/**
	* Returns all the p r registrations that the user has permission to view where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching p r registrations that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.ariadne.prova.registration.model.PRRegistration> filterFindByGroupId(
		long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the p r registrations that the user has permission to view where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.ariadne.prova.registration.model.impl.PRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of p r registrations
	* @param end the upper bound of the range of p r registrations (not inclusive)
	* @return the range of matching p r registrations that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.ariadne.prova.registration.model.PRRegistration> filterFindByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the p r registrations that the user has permissions to view where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.ariadne.prova.registration.model.impl.PRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of p r registrations
	* @param end the upper bound of the range of p r registrations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching p r registrations that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.ariadne.prova.registration.model.PRRegistration> filterFindByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the p r registrations before and after the current p r registration in the ordered set of p r registrations that the user has permission to view where groupId = &#63;.
	*
	* @param registrationId the primary key of the current p r registration
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next p r registration
	* @throws it.ariadne.prova.registration.NoSuchPRRegistrationException if a p r registration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.ariadne.prova.registration.model.PRRegistration[] filterFindByGroupId_PrevAndNext(
		long registrationId, long groupId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.ariadne.prova.registration.NoSuchPRRegistrationException;

	/**
	* Removes all the p r registrations where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of p r registrations where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching p r registrations
	* @throws SystemException if a system exception occurred
	*/
	public int countByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of p r registrations that the user has permission to view where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching p r registrations that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByGroupId(long groupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the p r registrations where groupId = &#63; and prUserId = &#63;.
	*
	* @param groupId the group ID
	* @param prUserId the pr user ID
	* @return the matching p r registrations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.ariadne.prova.registration.model.PRRegistration> findByG_RU(
		long groupId, long prUserId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the p r registrations where groupId = &#63; and prUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.ariadne.prova.registration.model.impl.PRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param prUserId the pr user ID
	* @param start the lower bound of the range of p r registrations
	* @param end the upper bound of the range of p r registrations (not inclusive)
	* @return the range of matching p r registrations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.ariadne.prova.registration.model.PRRegistration> findByG_RU(
		long groupId, long prUserId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the p r registrations where groupId = &#63; and prUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.ariadne.prova.registration.model.impl.PRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param prUserId the pr user ID
	* @param start the lower bound of the range of p r registrations
	* @param end the upper bound of the range of p r registrations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching p r registrations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.ariadne.prova.registration.model.PRRegistration> findByG_RU(
		long groupId, long prUserId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first p r registration in the ordered set where groupId = &#63; and prUserId = &#63;.
	*
	* @param groupId the group ID
	* @param prUserId the pr user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching p r registration
	* @throws it.ariadne.prova.registration.NoSuchPRRegistrationException if a matching p r registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.ariadne.prova.registration.model.PRRegistration findByG_RU_First(
		long groupId, long prUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.ariadne.prova.registration.NoSuchPRRegistrationException;

	/**
	* Returns the first p r registration in the ordered set where groupId = &#63; and prUserId = &#63;.
	*
	* @param groupId the group ID
	* @param prUserId the pr user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching p r registration, or <code>null</code> if a matching p r registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.ariadne.prova.registration.model.PRRegistration fetchByG_RU_First(
		long groupId, long prUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last p r registration in the ordered set where groupId = &#63; and prUserId = &#63;.
	*
	* @param groupId the group ID
	* @param prUserId the pr user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching p r registration
	* @throws it.ariadne.prova.registration.NoSuchPRRegistrationException if a matching p r registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.ariadne.prova.registration.model.PRRegistration findByG_RU_Last(
		long groupId, long prUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.ariadne.prova.registration.NoSuchPRRegistrationException;

	/**
	* Returns the last p r registration in the ordered set where groupId = &#63; and prUserId = &#63;.
	*
	* @param groupId the group ID
	* @param prUserId the pr user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching p r registration, or <code>null</code> if a matching p r registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.ariadne.prova.registration.model.PRRegistration fetchByG_RU_Last(
		long groupId, long prUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the p r registrations before and after the current p r registration in the ordered set where groupId = &#63; and prUserId = &#63;.
	*
	* @param registrationId the primary key of the current p r registration
	* @param groupId the group ID
	* @param prUserId the pr user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next p r registration
	* @throws it.ariadne.prova.registration.NoSuchPRRegistrationException if a p r registration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.ariadne.prova.registration.model.PRRegistration[] findByG_RU_PrevAndNext(
		long registrationId, long groupId, long prUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.ariadne.prova.registration.NoSuchPRRegistrationException;

	/**
	* Returns all the p r registrations that the user has permission to view where groupId = &#63; and prUserId = &#63;.
	*
	* @param groupId the group ID
	* @param prUserId the pr user ID
	* @return the matching p r registrations that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.ariadne.prova.registration.model.PRRegistration> filterFindByG_RU(
		long groupId, long prUserId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the p r registrations that the user has permission to view where groupId = &#63; and prUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.ariadne.prova.registration.model.impl.PRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param prUserId the pr user ID
	* @param start the lower bound of the range of p r registrations
	* @param end the upper bound of the range of p r registrations (not inclusive)
	* @return the range of matching p r registrations that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.ariadne.prova.registration.model.PRRegistration> filterFindByG_RU(
		long groupId, long prUserId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the p r registrations that the user has permissions to view where groupId = &#63; and prUserId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.ariadne.prova.registration.model.impl.PRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param prUserId the pr user ID
	* @param start the lower bound of the range of p r registrations
	* @param end the upper bound of the range of p r registrations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching p r registrations that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.ariadne.prova.registration.model.PRRegistration> filterFindByG_RU(
		long groupId, long prUserId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the p r registrations before and after the current p r registration in the ordered set of p r registrations that the user has permission to view where groupId = &#63; and prUserId = &#63;.
	*
	* @param registrationId the primary key of the current p r registration
	* @param groupId the group ID
	* @param prUserId the pr user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next p r registration
	* @throws it.ariadne.prova.registration.NoSuchPRRegistrationException if a p r registration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.ariadne.prova.registration.model.PRRegistration[] filterFindByG_RU_PrevAndNext(
		long registrationId, long groupId, long prUserId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.ariadne.prova.registration.NoSuchPRRegistrationException;

	/**
	* Removes all the p r registrations where groupId = &#63; and prUserId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param prUserId the pr user ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_RU(long groupId, long prUserId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of p r registrations where groupId = &#63; and prUserId = &#63;.
	*
	* @param groupId the group ID
	* @param prUserId the pr user ID
	* @return the number of matching p r registrations
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_RU(long groupId, long prUserId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of p r registrations that the user has permission to view where groupId = &#63; and prUserId = &#63;.
	*
	* @param groupId the group ID
	* @param prUserId the pr user ID
	* @return the number of matching p r registrations that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByG_RU(long groupId, long prUserId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the p r registrations where groupId = &#63; and datePurchased = &#63;.
	*
	* @param groupId the group ID
	* @param datePurchased the date purchased
	* @return the matching p r registrations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.ariadne.prova.registration.model.PRRegistration> findByG_DP(
		long groupId, java.util.Date datePurchased)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the p r registrations where groupId = &#63; and datePurchased = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.ariadne.prova.registration.model.impl.PRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param datePurchased the date purchased
	* @param start the lower bound of the range of p r registrations
	* @param end the upper bound of the range of p r registrations (not inclusive)
	* @return the range of matching p r registrations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.ariadne.prova.registration.model.PRRegistration> findByG_DP(
		long groupId, java.util.Date datePurchased, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the p r registrations where groupId = &#63; and datePurchased = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.ariadne.prova.registration.model.impl.PRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param datePurchased the date purchased
	* @param start the lower bound of the range of p r registrations
	* @param end the upper bound of the range of p r registrations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching p r registrations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.ariadne.prova.registration.model.PRRegistration> findByG_DP(
		long groupId, java.util.Date datePurchased, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first p r registration in the ordered set where groupId = &#63; and datePurchased = &#63;.
	*
	* @param groupId the group ID
	* @param datePurchased the date purchased
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching p r registration
	* @throws it.ariadne.prova.registration.NoSuchPRRegistrationException if a matching p r registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.ariadne.prova.registration.model.PRRegistration findByG_DP_First(
		long groupId, java.util.Date datePurchased,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.ariadne.prova.registration.NoSuchPRRegistrationException;

	/**
	* Returns the first p r registration in the ordered set where groupId = &#63; and datePurchased = &#63;.
	*
	* @param groupId the group ID
	* @param datePurchased the date purchased
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching p r registration, or <code>null</code> if a matching p r registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.ariadne.prova.registration.model.PRRegistration fetchByG_DP_First(
		long groupId, java.util.Date datePurchased,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last p r registration in the ordered set where groupId = &#63; and datePurchased = &#63;.
	*
	* @param groupId the group ID
	* @param datePurchased the date purchased
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching p r registration
	* @throws it.ariadne.prova.registration.NoSuchPRRegistrationException if a matching p r registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.ariadne.prova.registration.model.PRRegistration findByG_DP_Last(
		long groupId, java.util.Date datePurchased,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.ariadne.prova.registration.NoSuchPRRegistrationException;

	/**
	* Returns the last p r registration in the ordered set where groupId = &#63; and datePurchased = &#63;.
	*
	* @param groupId the group ID
	* @param datePurchased the date purchased
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching p r registration, or <code>null</code> if a matching p r registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.ariadne.prova.registration.model.PRRegistration fetchByG_DP_Last(
		long groupId, java.util.Date datePurchased,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the p r registrations before and after the current p r registration in the ordered set where groupId = &#63; and datePurchased = &#63;.
	*
	* @param registrationId the primary key of the current p r registration
	* @param groupId the group ID
	* @param datePurchased the date purchased
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next p r registration
	* @throws it.ariadne.prova.registration.NoSuchPRRegistrationException if a p r registration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.ariadne.prova.registration.model.PRRegistration[] findByG_DP_PrevAndNext(
		long registrationId, long groupId, java.util.Date datePurchased,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.ariadne.prova.registration.NoSuchPRRegistrationException;

	/**
	* Returns all the p r registrations that the user has permission to view where groupId = &#63; and datePurchased = &#63;.
	*
	* @param groupId the group ID
	* @param datePurchased the date purchased
	* @return the matching p r registrations that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.ariadne.prova.registration.model.PRRegistration> filterFindByG_DP(
		long groupId, java.util.Date datePurchased)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the p r registrations that the user has permission to view where groupId = &#63; and datePurchased = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.ariadne.prova.registration.model.impl.PRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param datePurchased the date purchased
	* @param start the lower bound of the range of p r registrations
	* @param end the upper bound of the range of p r registrations (not inclusive)
	* @return the range of matching p r registrations that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.ariadne.prova.registration.model.PRRegistration> filterFindByG_DP(
		long groupId, java.util.Date datePurchased, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the p r registrations that the user has permissions to view where groupId = &#63; and datePurchased = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.ariadne.prova.registration.model.impl.PRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param datePurchased the date purchased
	* @param start the lower bound of the range of p r registrations
	* @param end the upper bound of the range of p r registrations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching p r registrations that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.ariadne.prova.registration.model.PRRegistration> filterFindByG_DP(
		long groupId, java.util.Date datePurchased, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the p r registrations before and after the current p r registration in the ordered set of p r registrations that the user has permission to view where groupId = &#63; and datePurchased = &#63;.
	*
	* @param registrationId the primary key of the current p r registration
	* @param groupId the group ID
	* @param datePurchased the date purchased
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next p r registration
	* @throws it.ariadne.prova.registration.NoSuchPRRegistrationException if a p r registration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.ariadne.prova.registration.model.PRRegistration[] filterFindByG_DP_PrevAndNext(
		long registrationId, long groupId, java.util.Date datePurchased,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.ariadne.prova.registration.NoSuchPRRegistrationException;

	/**
	* Removes all the p r registrations where groupId = &#63; and datePurchased = &#63; from the database.
	*
	* @param groupId the group ID
	* @param datePurchased the date purchased
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_DP(long groupId, java.util.Date datePurchased)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of p r registrations where groupId = &#63; and datePurchased = &#63;.
	*
	* @param groupId the group ID
	* @param datePurchased the date purchased
	* @return the number of matching p r registrations
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_DP(long groupId, java.util.Date datePurchased)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of p r registrations that the user has permission to view where groupId = &#63; and datePurchased = &#63;.
	*
	* @param groupId the group ID
	* @param datePurchased the date purchased
	* @return the number of matching p r registrations that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByG_DP(long groupId, java.util.Date datePurchased)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the p r registrations where groupId = &#63; and serialNumber = &#63;.
	*
	* @param groupId the group ID
	* @param serialNumber the serial number
	* @return the matching p r registrations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.ariadne.prova.registration.model.PRRegistration> findByG_SN(
		long groupId, java.lang.String serialNumber)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the p r registrations where groupId = &#63; and serialNumber = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.ariadne.prova.registration.model.impl.PRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param serialNumber the serial number
	* @param start the lower bound of the range of p r registrations
	* @param end the upper bound of the range of p r registrations (not inclusive)
	* @return the range of matching p r registrations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.ariadne.prova.registration.model.PRRegistration> findByG_SN(
		long groupId, java.lang.String serialNumber, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the p r registrations where groupId = &#63; and serialNumber = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.ariadne.prova.registration.model.impl.PRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param serialNumber the serial number
	* @param start the lower bound of the range of p r registrations
	* @param end the upper bound of the range of p r registrations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching p r registrations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.ariadne.prova.registration.model.PRRegistration> findByG_SN(
		long groupId, java.lang.String serialNumber, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first p r registration in the ordered set where groupId = &#63; and serialNumber = &#63;.
	*
	* @param groupId the group ID
	* @param serialNumber the serial number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching p r registration
	* @throws it.ariadne.prova.registration.NoSuchPRRegistrationException if a matching p r registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.ariadne.prova.registration.model.PRRegistration findByG_SN_First(
		long groupId, java.lang.String serialNumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.ariadne.prova.registration.NoSuchPRRegistrationException;

	/**
	* Returns the first p r registration in the ordered set where groupId = &#63; and serialNumber = &#63;.
	*
	* @param groupId the group ID
	* @param serialNumber the serial number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching p r registration, or <code>null</code> if a matching p r registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.ariadne.prova.registration.model.PRRegistration fetchByG_SN_First(
		long groupId, java.lang.String serialNumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last p r registration in the ordered set where groupId = &#63; and serialNumber = &#63;.
	*
	* @param groupId the group ID
	* @param serialNumber the serial number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching p r registration
	* @throws it.ariadne.prova.registration.NoSuchPRRegistrationException if a matching p r registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.ariadne.prova.registration.model.PRRegistration findByG_SN_Last(
		long groupId, java.lang.String serialNumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.ariadne.prova.registration.NoSuchPRRegistrationException;

	/**
	* Returns the last p r registration in the ordered set where groupId = &#63; and serialNumber = &#63;.
	*
	* @param groupId the group ID
	* @param serialNumber the serial number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching p r registration, or <code>null</code> if a matching p r registration could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.ariadne.prova.registration.model.PRRegistration fetchByG_SN_Last(
		long groupId, java.lang.String serialNumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the p r registrations before and after the current p r registration in the ordered set where groupId = &#63; and serialNumber = &#63;.
	*
	* @param registrationId the primary key of the current p r registration
	* @param groupId the group ID
	* @param serialNumber the serial number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next p r registration
	* @throws it.ariadne.prova.registration.NoSuchPRRegistrationException if a p r registration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.ariadne.prova.registration.model.PRRegistration[] findByG_SN_PrevAndNext(
		long registrationId, long groupId, java.lang.String serialNumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.ariadne.prova.registration.NoSuchPRRegistrationException;

	/**
	* Returns all the p r registrations that the user has permission to view where groupId = &#63; and serialNumber = &#63;.
	*
	* @param groupId the group ID
	* @param serialNumber the serial number
	* @return the matching p r registrations that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.ariadne.prova.registration.model.PRRegistration> filterFindByG_SN(
		long groupId, java.lang.String serialNumber)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the p r registrations that the user has permission to view where groupId = &#63; and serialNumber = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.ariadne.prova.registration.model.impl.PRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param serialNumber the serial number
	* @param start the lower bound of the range of p r registrations
	* @param end the upper bound of the range of p r registrations (not inclusive)
	* @return the range of matching p r registrations that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.ariadne.prova.registration.model.PRRegistration> filterFindByG_SN(
		long groupId, java.lang.String serialNumber, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the p r registrations that the user has permissions to view where groupId = &#63; and serialNumber = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.ariadne.prova.registration.model.impl.PRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param serialNumber the serial number
	* @param start the lower bound of the range of p r registrations
	* @param end the upper bound of the range of p r registrations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching p r registrations that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.ariadne.prova.registration.model.PRRegistration> filterFindByG_SN(
		long groupId, java.lang.String serialNumber, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the p r registrations before and after the current p r registration in the ordered set of p r registrations that the user has permission to view where groupId = &#63; and serialNumber = &#63;.
	*
	* @param registrationId the primary key of the current p r registration
	* @param groupId the group ID
	* @param serialNumber the serial number
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next p r registration
	* @throws it.ariadne.prova.registration.NoSuchPRRegistrationException if a p r registration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.ariadne.prova.registration.model.PRRegistration[] filterFindByG_SN_PrevAndNext(
		long registrationId, long groupId, java.lang.String serialNumber,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.ariadne.prova.registration.NoSuchPRRegistrationException;

	/**
	* Removes all the p r registrations where groupId = &#63; and serialNumber = &#63; from the database.
	*
	* @param groupId the group ID
	* @param serialNumber the serial number
	* @throws SystemException if a system exception occurred
	*/
	public void removeByG_SN(long groupId, java.lang.String serialNumber)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of p r registrations where groupId = &#63; and serialNumber = &#63;.
	*
	* @param groupId the group ID
	* @param serialNumber the serial number
	* @return the number of matching p r registrations
	* @throws SystemException if a system exception occurred
	*/
	public int countByG_SN(long groupId, java.lang.String serialNumber)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of p r registrations that the user has permission to view where groupId = &#63; and serialNumber = &#63;.
	*
	* @param groupId the group ID
	* @param serialNumber the serial number
	* @return the number of matching p r registrations that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public int filterCountByG_SN(long groupId, java.lang.String serialNumber)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the p r registration in the entity cache if it is enabled.
	*
	* @param prRegistration the p r registration
	*/
	public void cacheResult(
		it.ariadne.prova.registration.model.PRRegistration prRegistration);

	/**
	* Caches the p r registrations in the entity cache if it is enabled.
	*
	* @param prRegistrations the p r registrations
	*/
	public void cacheResult(
		java.util.List<it.ariadne.prova.registration.model.PRRegistration> prRegistrations);

	/**
	* Creates a new p r registration with the primary key. Does not add the p r registration to the database.
	*
	* @param registrationId the primary key for the new p r registration
	* @return the new p r registration
	*/
	public it.ariadne.prova.registration.model.PRRegistration create(
		long registrationId);

	/**
	* Removes the p r registration with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param registrationId the primary key of the p r registration
	* @return the p r registration that was removed
	* @throws it.ariadne.prova.registration.NoSuchPRRegistrationException if a p r registration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.ariadne.prova.registration.model.PRRegistration remove(
		long registrationId)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.ariadne.prova.registration.NoSuchPRRegistrationException;

	public it.ariadne.prova.registration.model.PRRegistration updateImpl(
		it.ariadne.prova.registration.model.PRRegistration prRegistration)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the p r registration with the primary key or throws a {@link it.ariadne.prova.registration.NoSuchPRRegistrationException} if it could not be found.
	*
	* @param registrationId the primary key of the p r registration
	* @return the p r registration
	* @throws it.ariadne.prova.registration.NoSuchPRRegistrationException if a p r registration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.ariadne.prova.registration.model.PRRegistration findByPrimaryKey(
		long registrationId)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.ariadne.prova.registration.NoSuchPRRegistrationException;

	/**
	* Returns the p r registration with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param registrationId the primary key of the p r registration
	* @return the p r registration, or <code>null</code> if a p r registration with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.ariadne.prova.registration.model.PRRegistration fetchByPrimaryKey(
		long registrationId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the p r registrations.
	*
	* @return the p r registrations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.ariadne.prova.registration.model.PRRegistration> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the p r registrations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.ariadne.prova.registration.model.impl.PRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of p r registrations
	* @param end the upper bound of the range of p r registrations (not inclusive)
	* @return the range of p r registrations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.ariadne.prova.registration.model.PRRegistration> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the p r registrations.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.ariadne.prova.registration.model.impl.PRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of p r registrations
	* @param end the upper bound of the range of p r registrations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of p r registrations
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.ariadne.prova.registration.model.PRRegistration> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the p r registrations from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of p r registrations.
	*
	* @return the number of p r registrations
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the p r users associated with the p r registration.
	*
	* @param pk the primary key of the p r registration
	* @return the p r users associated with the p r registration
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.ariadne.prova.registration.model.PRUser> getPRUsers(
		long pk) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the p r users associated with the p r registration.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.ariadne.prova.registration.model.impl.PRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the p r registration
	* @param start the lower bound of the range of p r registrations
	* @param end the upper bound of the range of p r registrations (not inclusive)
	* @return the range of p r users associated with the p r registration
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.ariadne.prova.registration.model.PRUser> getPRUsers(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the p r users associated with the p r registration.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.ariadne.prova.registration.model.impl.PRRegistrationModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the p r registration
	* @param start the lower bound of the range of p r registrations
	* @param end the upper bound of the range of p r registrations (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of p r users associated with the p r registration
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.ariadne.prova.registration.model.PRUser> getPRUsers(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of p r users associated with the p r registration.
	*
	* @param pk the primary key of the p r registration
	* @return the number of p r users associated with the p r registration
	* @throws SystemException if a system exception occurred
	*/
	public int getPRUsersSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the p r user is associated with the p r registration.
	*
	* @param pk the primary key of the p r registration
	* @param prUserPK the primary key of the p r user
	* @return <code>true</code> if the p r user is associated with the p r registration; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsPRUser(long pk, long prUserPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns <code>true</code> if the p r registration has any p r users associated with it.
	*
	* @param pk the primary key of the p r registration to check for associations with p r users
	* @return <code>true</code> if the p r registration has any p r users associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public boolean containsPRUsers(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the p r registration and the p r user. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the p r registration
	* @param prUserPK the primary key of the p r user
	* @throws SystemException if a system exception occurred
	*/
	public void addPRUser(long pk, long prUserPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the p r registration and the p r user. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the p r registration
	* @param prUser the p r user
	* @throws SystemException if a system exception occurred
	*/
	public void addPRUser(long pk,
		it.ariadne.prova.registration.model.PRUser prUser)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the p r registration and the p r users. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the p r registration
	* @param prUserPKs the primary keys of the p r users
	* @throws SystemException if a system exception occurred
	*/
	public void addPRUsers(long pk, long[] prUserPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Adds an association between the p r registration and the p r users. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the p r registration
	* @param prUsers the p r users
	* @throws SystemException if a system exception occurred
	*/
	public void addPRUsers(long pk,
		java.util.List<it.ariadne.prova.registration.model.PRUser> prUsers)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Clears all associations between the p r registration and its p r users. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the p r registration to clear the associated p r users from
	* @throws SystemException if a system exception occurred
	*/
	public void clearPRUsers(long pk)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the p r registration and the p r user. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the p r registration
	* @param prUserPK the primary key of the p r user
	* @throws SystemException if a system exception occurred
	*/
	public void removePRUser(long pk, long prUserPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the p r registration and the p r user. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the p r registration
	* @param prUser the p r user
	* @throws SystemException if a system exception occurred
	*/
	public void removePRUser(long pk,
		it.ariadne.prova.registration.model.PRUser prUser)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the p r registration and the p r users. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the p r registration
	* @param prUserPKs the primary keys of the p r users
	* @throws SystemException if a system exception occurred
	*/
	public void removePRUsers(long pk, long[] prUserPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the association between the p r registration and the p r users. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the p r registration
	* @param prUsers the p r users
	* @throws SystemException if a system exception occurred
	*/
	public void removePRUsers(long pk,
		java.util.List<it.ariadne.prova.registration.model.PRUser> prUsers)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the p r users associated with the p r registration, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the p r registration
	* @param prUserPKs the primary keys of the p r users to be associated with the p r registration
	* @throws SystemException if a system exception occurred
	*/
	public void setPRUsers(long pk, long[] prUserPKs)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Sets the p r users associated with the p r registration, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the p r registration
	* @param prUsers the p r users to be associated with the p r registration
	* @throws SystemException if a system exception occurred
	*/
	public void setPRUsers(long pk,
		java.util.List<it.ariadne.prova.registration.model.PRUser> prUsers)
		throws com.liferay.portal.kernel.exception.SystemException;
}