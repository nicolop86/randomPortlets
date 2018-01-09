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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import it.ariadne.prova.registration.model.PRUser;

import java.util.List;

/**
 * The persistence utility for the p r user service. This utility wraps {@link PRUserPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Politi
 * @see PRUserPersistence
 * @see PRUserPersistenceImpl
 * @generated
 */
public class PRUserUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(PRUser prUser) {
		getPersistence().clearCache(prUser);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<PRUser> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<PRUser> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<PRUser> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static PRUser update(PRUser prUser) throws SystemException {
		return getPersistence().update(prUser);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static PRUser update(PRUser prUser, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(prUser, serviceContext);
	}

	/**
	* Returns all the p r users where groupId = &#63; and lastName = &#63;.
	*
	* @param groupId the group ID
	* @param lastName the last name
	* @return the matching p r users
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<it.ariadne.prova.registration.model.PRUser> findByG_LN(
		long groupId, java.lang.String lastName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_LN(groupId, lastName);
	}

	/**
	* Returns a range of all the p r users where groupId = &#63; and lastName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.ariadne.prova.registration.model.impl.PRUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param lastName the last name
	* @param start the lower bound of the range of p r users
	* @param end the upper bound of the range of p r users (not inclusive)
	* @return the range of matching p r users
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<it.ariadne.prova.registration.model.PRUser> findByG_LN(
		long groupId, java.lang.String lastName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_LN(groupId, lastName, start, end);
	}

	/**
	* Returns an ordered range of all the p r users where groupId = &#63; and lastName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.ariadne.prova.registration.model.impl.PRUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param lastName the last name
	* @param start the lower bound of the range of p r users
	* @param end the upper bound of the range of p r users (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching p r users
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<it.ariadne.prova.registration.model.PRUser> findByG_LN(
		long groupId, java.lang.String lastName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_LN(groupId, lastName, start, end, orderByComparator);
	}

	/**
	* Returns the first p r user in the ordered set where groupId = &#63; and lastName = &#63;.
	*
	* @param groupId the group ID
	* @param lastName the last name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching p r user
	* @throws it.ariadne.prova.registration.NoSuchPRUserException if a matching p r user could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static it.ariadne.prova.registration.model.PRUser findByG_LN_First(
		long groupId, java.lang.String lastName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.ariadne.prova.registration.NoSuchPRUserException {
		return getPersistence()
				   .findByG_LN_First(groupId, lastName, orderByComparator);
	}

	/**
	* Returns the first p r user in the ordered set where groupId = &#63; and lastName = &#63;.
	*
	* @param groupId the group ID
	* @param lastName the last name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching p r user, or <code>null</code> if a matching p r user could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static it.ariadne.prova.registration.model.PRUser fetchByG_LN_First(
		long groupId, java.lang.String lastName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_LN_First(groupId, lastName, orderByComparator);
	}

	/**
	* Returns the last p r user in the ordered set where groupId = &#63; and lastName = &#63;.
	*
	* @param groupId the group ID
	* @param lastName the last name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching p r user
	* @throws it.ariadne.prova.registration.NoSuchPRUserException if a matching p r user could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static it.ariadne.prova.registration.model.PRUser findByG_LN_Last(
		long groupId, java.lang.String lastName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.ariadne.prova.registration.NoSuchPRUserException {
		return getPersistence()
				   .findByG_LN_Last(groupId, lastName, orderByComparator);
	}

	/**
	* Returns the last p r user in the ordered set where groupId = &#63; and lastName = &#63;.
	*
	* @param groupId the group ID
	* @param lastName the last name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching p r user, or <code>null</code> if a matching p r user could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static it.ariadne.prova.registration.model.PRUser fetchByG_LN_Last(
		long groupId, java.lang.String lastName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_LN_Last(groupId, lastName, orderByComparator);
	}

	/**
	* Returns the p r users before and after the current p r user in the ordered set where groupId = &#63; and lastName = &#63;.
	*
	* @param prUserId the primary key of the current p r user
	* @param groupId the group ID
	* @param lastName the last name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next p r user
	* @throws it.ariadne.prova.registration.NoSuchPRUserException if a p r user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static it.ariadne.prova.registration.model.PRUser[] findByG_LN_PrevAndNext(
		long prUserId, long groupId, java.lang.String lastName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.ariadne.prova.registration.NoSuchPRUserException {
		return getPersistence()
				   .findByG_LN_PrevAndNext(prUserId, groupId, lastName,
			orderByComparator);
	}

	/**
	* Returns all the p r users that the user has permission to view where groupId = &#63; and lastName = &#63;.
	*
	* @param groupId the group ID
	* @param lastName the last name
	* @return the matching p r users that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<it.ariadne.prova.registration.model.PRUser> filterFindByG_LN(
		long groupId, java.lang.String lastName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByG_LN(groupId, lastName);
	}

	/**
	* Returns a range of all the p r users that the user has permission to view where groupId = &#63; and lastName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.ariadne.prova.registration.model.impl.PRUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param lastName the last name
	* @param start the lower bound of the range of p r users
	* @param end the upper bound of the range of p r users (not inclusive)
	* @return the range of matching p r users that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<it.ariadne.prova.registration.model.PRUser> filterFindByG_LN(
		long groupId, java.lang.String lastName, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByG_LN(groupId, lastName, start, end);
	}

	/**
	* Returns an ordered range of all the p r users that the user has permissions to view where groupId = &#63; and lastName = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.ariadne.prova.registration.model.impl.PRUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param lastName the last name
	* @param start the lower bound of the range of p r users
	* @param end the upper bound of the range of p r users (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching p r users that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<it.ariadne.prova.registration.model.PRUser> filterFindByG_LN(
		long groupId, java.lang.String lastName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByG_LN(groupId, lastName, start, end,
			orderByComparator);
	}

	/**
	* Returns the p r users before and after the current p r user in the ordered set of p r users that the user has permission to view where groupId = &#63; and lastName = &#63;.
	*
	* @param prUserId the primary key of the current p r user
	* @param groupId the group ID
	* @param lastName the last name
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next p r user
	* @throws it.ariadne.prova.registration.NoSuchPRUserException if a p r user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static it.ariadne.prova.registration.model.PRUser[] filterFindByG_LN_PrevAndNext(
		long prUserId, long groupId, java.lang.String lastName,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.ariadne.prova.registration.NoSuchPRUserException {
		return getPersistence()
				   .filterFindByG_LN_PrevAndNext(prUserId, groupId, lastName,
			orderByComparator);
	}

	/**
	* Removes all the p r users where groupId = &#63; and lastName = &#63; from the database.
	*
	* @param groupId the group ID
	* @param lastName the last name
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_LN(long groupId, java.lang.String lastName)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_LN(groupId, lastName);
	}

	/**
	* Returns the number of p r users where groupId = &#63; and lastName = &#63;.
	*
	* @param groupId the group ID
	* @param lastName the last name
	* @return the number of matching p r users
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_LN(long groupId, java.lang.String lastName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_LN(groupId, lastName);
	}

	/**
	* Returns the number of p r users that the user has permission to view where groupId = &#63; and lastName = &#63;.
	*
	* @param groupId the group ID
	* @param lastName the last name
	* @return the number of matching p r users that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static int filterCountByG_LN(long groupId, java.lang.String lastName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterCountByG_LN(groupId, lastName);
	}

	/**
	* Returns all the p r users where groupId = &#63; and email = &#63;.
	*
	* @param groupId the group ID
	* @param email the email
	* @return the matching p r users
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<it.ariadne.prova.registration.model.PRUser> findByG_E(
		long groupId, java.lang.String email)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_E(groupId, email);
	}

	/**
	* Returns a range of all the p r users where groupId = &#63; and email = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.ariadne.prova.registration.model.impl.PRUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param email the email
	* @param start the lower bound of the range of p r users
	* @param end the upper bound of the range of p r users (not inclusive)
	* @return the range of matching p r users
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<it.ariadne.prova.registration.model.PRUser> findByG_E(
		long groupId, java.lang.String email, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_E(groupId, email, start, end);
	}

	/**
	* Returns an ordered range of all the p r users where groupId = &#63; and email = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.ariadne.prova.registration.model.impl.PRUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param email the email
	* @param start the lower bound of the range of p r users
	* @param end the upper bound of the range of p r users (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching p r users
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<it.ariadne.prova.registration.model.PRUser> findByG_E(
		long groupId, java.lang.String email, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_E(groupId, email, start, end, orderByComparator);
	}

	/**
	* Returns the first p r user in the ordered set where groupId = &#63; and email = &#63;.
	*
	* @param groupId the group ID
	* @param email the email
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching p r user
	* @throws it.ariadne.prova.registration.NoSuchPRUserException if a matching p r user could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static it.ariadne.prova.registration.model.PRUser findByG_E_First(
		long groupId, java.lang.String email,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.ariadne.prova.registration.NoSuchPRUserException {
		return getPersistence()
				   .findByG_E_First(groupId, email, orderByComparator);
	}

	/**
	* Returns the first p r user in the ordered set where groupId = &#63; and email = &#63;.
	*
	* @param groupId the group ID
	* @param email the email
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching p r user, or <code>null</code> if a matching p r user could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static it.ariadne.prova.registration.model.PRUser fetchByG_E_First(
		long groupId, java.lang.String email,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_E_First(groupId, email, orderByComparator);
	}

	/**
	* Returns the last p r user in the ordered set where groupId = &#63; and email = &#63;.
	*
	* @param groupId the group ID
	* @param email the email
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching p r user
	* @throws it.ariadne.prova.registration.NoSuchPRUserException if a matching p r user could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static it.ariadne.prova.registration.model.PRUser findByG_E_Last(
		long groupId, java.lang.String email,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.ariadne.prova.registration.NoSuchPRUserException {
		return getPersistence().findByG_E_Last(groupId, email, orderByComparator);
	}

	/**
	* Returns the last p r user in the ordered set where groupId = &#63; and email = &#63;.
	*
	* @param groupId the group ID
	* @param email the email
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching p r user, or <code>null</code> if a matching p r user could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static it.ariadne.prova.registration.model.PRUser fetchByG_E_Last(
		long groupId, java.lang.String email,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_E_Last(groupId, email, orderByComparator);
	}

	/**
	* Returns the p r users before and after the current p r user in the ordered set where groupId = &#63; and email = &#63;.
	*
	* @param prUserId the primary key of the current p r user
	* @param groupId the group ID
	* @param email the email
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next p r user
	* @throws it.ariadne.prova.registration.NoSuchPRUserException if a p r user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static it.ariadne.prova.registration.model.PRUser[] findByG_E_PrevAndNext(
		long prUserId, long groupId, java.lang.String email,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.ariadne.prova.registration.NoSuchPRUserException {
		return getPersistence()
				   .findByG_E_PrevAndNext(prUserId, groupId, email,
			orderByComparator);
	}

	/**
	* Returns all the p r users that the user has permission to view where groupId = &#63; and email = &#63;.
	*
	* @param groupId the group ID
	* @param email the email
	* @return the matching p r users that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<it.ariadne.prova.registration.model.PRUser> filterFindByG_E(
		long groupId, java.lang.String email)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByG_E(groupId, email);
	}

	/**
	* Returns a range of all the p r users that the user has permission to view where groupId = &#63; and email = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.ariadne.prova.registration.model.impl.PRUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param email the email
	* @param start the lower bound of the range of p r users
	* @param end the upper bound of the range of p r users (not inclusive)
	* @return the range of matching p r users that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<it.ariadne.prova.registration.model.PRUser> filterFindByG_E(
		long groupId, java.lang.String email, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByG_E(groupId, email, start, end);
	}

	/**
	* Returns an ordered range of all the p r users that the user has permissions to view where groupId = &#63; and email = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.ariadne.prova.registration.model.impl.PRUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param email the email
	* @param start the lower bound of the range of p r users
	* @param end the upper bound of the range of p r users (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching p r users that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<it.ariadne.prova.registration.model.PRUser> filterFindByG_E(
		long groupId, java.lang.String email, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByG_E(groupId, email, start, end,
			orderByComparator);
	}

	/**
	* Returns the p r users before and after the current p r user in the ordered set of p r users that the user has permission to view where groupId = &#63; and email = &#63;.
	*
	* @param prUserId the primary key of the current p r user
	* @param groupId the group ID
	* @param email the email
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next p r user
	* @throws it.ariadne.prova.registration.NoSuchPRUserException if a p r user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static it.ariadne.prova.registration.model.PRUser[] filterFindByG_E_PrevAndNext(
		long prUserId, long groupId, java.lang.String email,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.ariadne.prova.registration.NoSuchPRUserException {
		return getPersistence()
				   .filterFindByG_E_PrevAndNext(prUserId, groupId, email,
			orderByComparator);
	}

	/**
	* Removes all the p r users where groupId = &#63; and email = &#63; from the database.
	*
	* @param groupId the group ID
	* @param email the email
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_E(long groupId, java.lang.String email)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_E(groupId, email);
	}

	/**
	* Returns the number of p r users where groupId = &#63; and email = &#63;.
	*
	* @param groupId the group ID
	* @param email the email
	* @return the number of matching p r users
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_E(long groupId, java.lang.String email)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_E(groupId, email);
	}

	/**
	* Returns the number of p r users that the user has permission to view where groupId = &#63; and email = &#63;.
	*
	* @param groupId the group ID
	* @param email the email
	* @return the number of matching p r users that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static int filterCountByG_E(long groupId, java.lang.String email)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterCountByG_E(groupId, email);
	}

	/**
	* Returns all the p r users where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @return the matching p r users
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<it.ariadne.prova.registration.model.PRUser> findByG_U(
		long groupId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_U(groupId, userId);
	}

	/**
	* Returns a range of all the p r users where groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.ariadne.prova.registration.model.impl.PRUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of p r users
	* @param end the upper bound of the range of p r users (not inclusive)
	* @return the range of matching p r users
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<it.ariadne.prova.registration.model.PRUser> findByG_U(
		long groupId, long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByG_U(groupId, userId, start, end);
	}

	/**
	* Returns an ordered range of all the p r users where groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.ariadne.prova.registration.model.impl.PRUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of p r users
	* @param end the upper bound of the range of p r users (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching p r users
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<it.ariadne.prova.registration.model.PRUser> findByG_U(
		long groupId, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByG_U(groupId, userId, start, end, orderByComparator);
	}

	/**
	* Returns the first p r user in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching p r user
	* @throws it.ariadne.prova.registration.NoSuchPRUserException if a matching p r user could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static it.ariadne.prova.registration.model.PRUser findByG_U_First(
		long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.ariadne.prova.registration.NoSuchPRUserException {
		return getPersistence()
				   .findByG_U_First(groupId, userId, orderByComparator);
	}

	/**
	* Returns the first p r user in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching p r user, or <code>null</code> if a matching p r user could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static it.ariadne.prova.registration.model.PRUser fetchByG_U_First(
		long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_U_First(groupId, userId, orderByComparator);
	}

	/**
	* Returns the last p r user in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching p r user
	* @throws it.ariadne.prova.registration.NoSuchPRUserException if a matching p r user could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static it.ariadne.prova.registration.model.PRUser findByG_U_Last(
		long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.ariadne.prova.registration.NoSuchPRUserException {
		return getPersistence()
				   .findByG_U_Last(groupId, userId, orderByComparator);
	}

	/**
	* Returns the last p r user in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching p r user, or <code>null</code> if a matching p r user could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static it.ariadne.prova.registration.model.PRUser fetchByG_U_Last(
		long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .fetchByG_U_Last(groupId, userId, orderByComparator);
	}

	/**
	* Returns the p r users before and after the current p r user in the ordered set where groupId = &#63; and userId = &#63;.
	*
	* @param prUserId the primary key of the current p r user
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next p r user
	* @throws it.ariadne.prova.registration.NoSuchPRUserException if a p r user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static it.ariadne.prova.registration.model.PRUser[] findByG_U_PrevAndNext(
		long prUserId, long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.ariadne.prova.registration.NoSuchPRUserException {
		return getPersistence()
				   .findByG_U_PrevAndNext(prUserId, groupId, userId,
			orderByComparator);
	}

	/**
	* Returns all the p r users that the user has permission to view where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @return the matching p r users that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<it.ariadne.prova.registration.model.PRUser> filterFindByG_U(
		long groupId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByG_U(groupId, userId);
	}

	/**
	* Returns a range of all the p r users that the user has permission to view where groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.ariadne.prova.registration.model.impl.PRUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of p r users
	* @param end the upper bound of the range of p r users (not inclusive)
	* @return the range of matching p r users that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<it.ariadne.prova.registration.model.PRUser> filterFindByG_U(
		long groupId, long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterFindByG_U(groupId, userId, start, end);
	}

	/**
	* Returns an ordered range of all the p r users that the user has permissions to view where groupId = &#63; and userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.ariadne.prova.registration.model.impl.PRUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @param start the lower bound of the range of p r users
	* @param end the upper bound of the range of p r users (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching p r users that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<it.ariadne.prova.registration.model.PRUser> filterFindByG_U(
		long groupId, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .filterFindByG_U(groupId, userId, start, end,
			orderByComparator);
	}

	/**
	* Returns the p r users before and after the current p r user in the ordered set of p r users that the user has permission to view where groupId = &#63; and userId = &#63;.
	*
	* @param prUserId the primary key of the current p r user
	* @param groupId the group ID
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next p r user
	* @throws it.ariadne.prova.registration.NoSuchPRUserException if a p r user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static it.ariadne.prova.registration.model.PRUser[] filterFindByG_U_PrevAndNext(
		long prUserId, long groupId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.ariadne.prova.registration.NoSuchPRUserException {
		return getPersistence()
				   .filterFindByG_U_PrevAndNext(prUserId, groupId, userId,
			orderByComparator);
	}

	/**
	* Removes all the p r users where groupId = &#63; and userId = &#63; from the database.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByG_U(long groupId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByG_U(groupId, userId);
	}

	/**
	* Returns the number of p r users where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @return the number of matching p r users
	* @throws SystemException if a system exception occurred
	*/
	public static int countByG_U(long groupId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByG_U(groupId, userId);
	}

	/**
	* Returns the number of p r users that the user has permission to view where groupId = &#63; and userId = &#63;.
	*
	* @param groupId the group ID
	* @param userId the user ID
	* @return the number of matching p r users that the user has permission to view
	* @throws SystemException if a system exception occurred
	*/
	public static int filterCountByG_U(long groupId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().filterCountByG_U(groupId, userId);
	}

	/**
	* Caches the p r user in the entity cache if it is enabled.
	*
	* @param prUser the p r user
	*/
	public static void cacheResult(
		it.ariadne.prova.registration.model.PRUser prUser) {
		getPersistence().cacheResult(prUser);
	}

	/**
	* Caches the p r users in the entity cache if it is enabled.
	*
	* @param prUsers the p r users
	*/
	public static void cacheResult(
		java.util.List<it.ariadne.prova.registration.model.PRUser> prUsers) {
		getPersistence().cacheResult(prUsers);
	}

	/**
	* Creates a new p r user with the primary key. Does not add the p r user to the database.
	*
	* @param prUserId the primary key for the new p r user
	* @return the new p r user
	*/
	public static it.ariadne.prova.registration.model.PRUser create(
		long prUserId) {
		return getPersistence().create(prUserId);
	}

	/**
	* Removes the p r user with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param prUserId the primary key of the p r user
	* @return the p r user that was removed
	* @throws it.ariadne.prova.registration.NoSuchPRUserException if a p r user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static it.ariadne.prova.registration.model.PRUser remove(
		long prUserId)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.ariadne.prova.registration.NoSuchPRUserException {
		return getPersistence().remove(prUserId);
	}

	public static it.ariadne.prova.registration.model.PRUser updateImpl(
		it.ariadne.prova.registration.model.PRUser prUser)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(prUser);
	}

	/**
	* Returns the p r user with the primary key or throws a {@link it.ariadne.prova.registration.NoSuchPRUserException} if it could not be found.
	*
	* @param prUserId the primary key of the p r user
	* @return the p r user
	* @throws it.ariadne.prova.registration.NoSuchPRUserException if a p r user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static it.ariadne.prova.registration.model.PRUser findByPrimaryKey(
		long prUserId)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.ariadne.prova.registration.NoSuchPRUserException {
		return getPersistence().findByPrimaryKey(prUserId);
	}

	/**
	* Returns the p r user with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param prUserId the primary key of the p r user
	* @return the p r user, or <code>null</code> if a p r user with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static it.ariadne.prova.registration.model.PRUser fetchByPrimaryKey(
		long prUserId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(prUserId);
	}

	/**
	* Returns all the p r users.
	*
	* @return the p r users
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<it.ariadne.prova.registration.model.PRUser> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the p r users.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.ariadne.prova.registration.model.impl.PRUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of p r users
	* @param end the upper bound of the range of p r users (not inclusive)
	* @return the range of p r users
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<it.ariadne.prova.registration.model.PRUser> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the p r users.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.ariadne.prova.registration.model.impl.PRUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of p r users
	* @param end the upper bound of the range of p r users (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of p r users
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<it.ariadne.prova.registration.model.PRUser> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the p r users from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of p r users.
	*
	* @return the number of p r users
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	/**
	* Returns all the p r registrations associated with the p r user.
	*
	* @param pk the primary key of the p r user
	* @return the p r registrations associated with the p r user
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<it.ariadne.prova.registration.model.PRRegistration> getPRRegistrations(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getPRRegistrations(pk);
	}

	/**
	* Returns a range of all the p r registrations associated with the p r user.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.ariadne.prova.registration.model.impl.PRUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the p r user
	* @param start the lower bound of the range of p r users
	* @param end the upper bound of the range of p r users (not inclusive)
	* @return the range of p r registrations associated with the p r user
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<it.ariadne.prova.registration.model.PRRegistration> getPRRegistrations(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getPRRegistrations(pk, start, end);
	}

	/**
	* Returns an ordered range of all the p r registrations associated with the p r user.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.ariadne.prova.registration.model.impl.PRUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param pk the primary key of the p r user
	* @param start the lower bound of the range of p r users
	* @param end the upper bound of the range of p r users (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of p r registrations associated with the p r user
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<it.ariadne.prova.registration.model.PRRegistration> getPRRegistrations(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .getPRRegistrations(pk, start, end, orderByComparator);
	}

	/**
	* Returns the number of p r registrations associated with the p r user.
	*
	* @param pk the primary key of the p r user
	* @return the number of p r registrations associated with the p r user
	* @throws SystemException if a system exception occurred
	*/
	public static int getPRRegistrationsSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getPRRegistrationsSize(pk);
	}

	/**
	* Returns <code>true</code> if the p r registration is associated with the p r user.
	*
	* @param pk the primary key of the p r user
	* @param prRegistrationPK the primary key of the p r registration
	* @return <code>true</code> if the p r registration is associated with the p r user; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsPRRegistration(long pk, long prRegistrationPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsPRRegistration(pk, prRegistrationPK);
	}

	/**
	* Returns <code>true</code> if the p r user has any p r registrations associated with it.
	*
	* @param pk the primary key of the p r user to check for associations with p r registrations
	* @return <code>true</code> if the p r user has any p r registrations associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsPRRegistrations(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsPRRegistrations(pk);
	}

	/**
	* Adds an association between the p r user and the p r registration. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the p r user
	* @param prRegistrationPK the primary key of the p r registration
	* @throws SystemException if a system exception occurred
	*/
	public static void addPRRegistration(long pk, long prRegistrationPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addPRRegistration(pk, prRegistrationPK);
	}

	/**
	* Adds an association between the p r user and the p r registration. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the p r user
	* @param prRegistration the p r registration
	* @throws SystemException if a system exception occurred
	*/
	public static void addPRRegistration(long pk,
		it.ariadne.prova.registration.model.PRRegistration prRegistration)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addPRRegistration(pk, prRegistration);
	}

	/**
	* Adds an association between the p r user and the p r registrations. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the p r user
	* @param prRegistrationPKs the primary keys of the p r registrations
	* @throws SystemException if a system exception occurred
	*/
	public static void addPRRegistrations(long pk, long[] prRegistrationPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addPRRegistrations(pk, prRegistrationPKs);
	}

	/**
	* Adds an association between the p r user and the p r registrations. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the p r user
	* @param prRegistrations the p r registrations
	* @throws SystemException if a system exception occurred
	*/
	public static void addPRRegistrations(long pk,
		java.util.List<it.ariadne.prova.registration.model.PRRegistration> prRegistrations)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().addPRRegistrations(pk, prRegistrations);
	}

	/**
	* Clears all associations between the p r user and its p r registrations. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the p r user to clear the associated p r registrations from
	* @throws SystemException if a system exception occurred
	*/
	public static void clearPRRegistrations(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().clearPRRegistrations(pk);
	}

	/**
	* Removes the association between the p r user and the p r registration. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the p r user
	* @param prRegistrationPK the primary key of the p r registration
	* @throws SystemException if a system exception occurred
	*/
	public static void removePRRegistration(long pk, long prRegistrationPK)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removePRRegistration(pk, prRegistrationPK);
	}

	/**
	* Removes the association between the p r user and the p r registration. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the p r user
	* @param prRegistration the p r registration
	* @throws SystemException if a system exception occurred
	*/
	public static void removePRRegistration(long pk,
		it.ariadne.prova.registration.model.PRRegistration prRegistration)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removePRRegistration(pk, prRegistration);
	}

	/**
	* Removes the association between the p r user and the p r registrations. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the p r user
	* @param prRegistrationPKs the primary keys of the p r registrations
	* @throws SystemException if a system exception occurred
	*/
	public static void removePRRegistrations(long pk, long[] prRegistrationPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removePRRegistrations(pk, prRegistrationPKs);
	}

	/**
	* Removes the association between the p r user and the p r registrations. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the p r user
	* @param prRegistrations the p r registrations
	* @throws SystemException if a system exception occurred
	*/
	public static void removePRRegistrations(long pk,
		java.util.List<it.ariadne.prova.registration.model.PRRegistration> prRegistrations)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removePRRegistrations(pk, prRegistrations);
	}

	/**
	* Sets the p r registrations associated with the p r user, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the p r user
	* @param prRegistrationPKs the primary keys of the p r registrations to be associated with the p r user
	* @throws SystemException if a system exception occurred
	*/
	public static void setPRRegistrations(long pk, long[] prRegistrationPKs)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setPRRegistrations(pk, prRegistrationPKs);
	}

	/**
	* Sets the p r registrations associated with the p r user, removing and adding associations as necessary. Also notifies the appropriate model listeners and clears the mapping table finder cache.
	*
	* @param pk the primary key of the p r user
	* @param prRegistrations the p r registrations to be associated with the p r user
	* @throws SystemException if a system exception occurred
	*/
	public static void setPRRegistrations(long pk,
		java.util.List<it.ariadne.prova.registration.model.PRRegistration> prRegistrations)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().setPRRegistrations(pk, prRegistrations);
	}

	public static PRUserPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (PRUserPersistence)PortletBeanLocatorUtil.locate(it.ariadne.prova.registration.service.ClpSerializer.getServletContextName(),
					PRUserPersistence.class.getName());

			ReferenceRegistry.registerReference(PRUserUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(PRUserPersistence persistence) {
	}

	private static PRUserPersistence _persistence;
}