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

package it.ariadne.prova.registration.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import it.ariadne.prova.registration.model.PRUser;
import it.ariadne.prova.registration.service.PRUserLocalService;
import it.ariadne.prova.registration.service.persistence.PRProductPersistence;
import it.ariadne.prova.registration.service.persistence.PRRegistrationPersistence;
import it.ariadne.prova.registration.service.persistence.PRUserPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the p r user local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link it.ariadne.prova.registration.service.impl.PRUserLocalServiceImpl}.
 * </p>
 *
 * @author Politi
 * @see it.ariadne.prova.registration.service.impl.PRUserLocalServiceImpl
 * @see it.ariadne.prova.registration.service.PRUserLocalServiceUtil
 * @generated
 */
public abstract class PRUserLocalServiceBaseImpl extends BaseLocalServiceImpl
	implements PRUserLocalService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link it.ariadne.prova.registration.service.PRUserLocalServiceUtil} to access the p r user local service.
	 */

	/**
	 * Adds the p r user to the database. Also notifies the appropriate model listeners.
	 *
	 * @param prUser the p r user
	 * @return the p r user that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public PRUser addPRUser(PRUser prUser) throws SystemException {
		prUser.setNew(true);

		return prUserPersistence.update(prUser);
	}

	/**
	 * Creates a new p r user with the primary key. Does not add the p r user to the database.
	 *
	 * @param prUserId the primary key for the new p r user
	 * @return the new p r user
	 */
	@Override
	public PRUser createPRUser(long prUserId) {
		return prUserPersistence.create(prUserId);
	}

	/**
	 * Deletes the p r user with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param prUserId the primary key of the p r user
	 * @return the p r user that was removed
	 * @throws PortalException if a p r user with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public PRUser deletePRUser(long prUserId)
		throws PortalException, SystemException {
		return prUserPersistence.remove(prUserId);
	}

	/**
	 * Deletes the p r user from the database. Also notifies the appropriate model listeners.
	 *
	 * @param prUser the p r user
	 * @return the p r user that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public PRUser deletePRUser(PRUser prUser) throws SystemException {
		return prUserPersistence.remove(prUser);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(PRUser.class,
			clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return prUserPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.ariadne.prova.registration.model.impl.PRUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return prUserPersistence.findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link it.ariadne.prova.registration.model.impl.PRUserModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	@SuppressWarnings("rawtypes")
	public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return prUserPersistence.findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery)
		throws SystemException {
		return prUserPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows that match the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows that match the dynamic query
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection) throws SystemException {
		return prUserPersistence.countWithDynamicQuery(dynamicQuery, projection);
	}

	@Override
	public PRUser fetchPRUser(long prUserId) throws SystemException {
		return prUserPersistence.fetchByPrimaryKey(prUserId);
	}

	/**
	 * Returns the p r user with the primary key.
	 *
	 * @param prUserId the primary key of the p r user
	 * @return the p r user
	 * @throws PortalException if a p r user with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public PRUser getPRUser(long prUserId)
		throws PortalException, SystemException {
		return prUserPersistence.findByPrimaryKey(prUserId);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return prUserPersistence.findByPrimaryKey(primaryKeyObj);
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
	@Override
	public List<PRUser> getPRUsers(int start, int end)
		throws SystemException {
		return prUserPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of p r users.
	 *
	 * @return the number of p r users
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getPRUsersCount() throws SystemException {
		return prUserPersistence.countAll();
	}

	/**
	 * Updates the p r user in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param prUser the p r user
	 * @return the p r user that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public PRUser updatePRUser(PRUser prUser) throws SystemException {
		return prUserPersistence.update(prUser);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addPRRegistrationPRUser(long registrationId, long prUserId)
		throws SystemException {
		prRegistrationPersistence.addPRUser(registrationId, prUserId);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addPRRegistrationPRUser(long registrationId, PRUser prUser)
		throws SystemException {
		prRegistrationPersistence.addPRUser(registrationId, prUser);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addPRRegistrationPRUsers(long registrationId, long[] prUserIds)
		throws SystemException {
		prRegistrationPersistence.addPRUsers(registrationId, prUserIds);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void addPRRegistrationPRUsers(long registrationId,
		List<PRUser> PRUsers) throws SystemException {
		prRegistrationPersistence.addPRUsers(registrationId, PRUsers);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void clearPRRegistrationPRUsers(long registrationId)
		throws SystemException {
		prRegistrationPersistence.clearPRUsers(registrationId);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void deletePRRegistrationPRUser(long registrationId, long prUserId)
		throws SystemException {
		prRegistrationPersistence.removePRUser(registrationId, prUserId);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void deletePRRegistrationPRUser(long registrationId, PRUser prUser)
		throws SystemException {
		prRegistrationPersistence.removePRUser(registrationId, prUser);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void deletePRRegistrationPRUsers(long registrationId,
		long[] prUserIds) throws SystemException {
		prRegistrationPersistence.removePRUsers(registrationId, prUserIds);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void deletePRRegistrationPRUsers(long registrationId,
		List<PRUser> PRUsers) throws SystemException {
		prRegistrationPersistence.removePRUsers(registrationId, PRUsers);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PRUser> getPRRegistrationPRUsers(long registrationId)
		throws SystemException {
		return prRegistrationPersistence.getPRUsers(registrationId);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PRUser> getPRRegistrationPRUsers(long registrationId,
		int start, int end) throws SystemException {
		return prRegistrationPersistence.getPRUsers(registrationId, start, end);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<PRUser> getPRRegistrationPRUsers(long registrationId,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return prRegistrationPersistence.getPRUsers(registrationId, start, end,
			orderByComparator);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getPRRegistrationPRUsersCount(long registrationId)
		throws SystemException {
		return prRegistrationPersistence.getPRUsersSize(registrationId);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean hasPRRegistrationPRUser(long registrationId, long prUserId)
		throws SystemException {
		return prRegistrationPersistence.containsPRUser(registrationId, prUserId);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public boolean hasPRRegistrationPRUsers(long registrationId)
		throws SystemException {
		return prRegistrationPersistence.containsPRUsers(registrationId);
	}

	/**
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void setPRRegistrationPRUsers(long registrationId, long[] prUserIds)
		throws SystemException {
		prRegistrationPersistence.setPRUsers(registrationId, prUserIds);
	}

	/**
	 * Returns the p r product local service.
	 *
	 * @return the p r product local service
	 */
	public it.ariadne.prova.registration.service.PRProductLocalService getPRProductLocalService() {
		return prProductLocalService;
	}

	/**
	 * Sets the p r product local service.
	 *
	 * @param prProductLocalService the p r product local service
	 */
	public void setPRProductLocalService(
		it.ariadne.prova.registration.service.PRProductLocalService prProductLocalService) {
		this.prProductLocalService = prProductLocalService;
	}

	/**
	 * Returns the p r product persistence.
	 *
	 * @return the p r product persistence
	 */
	public PRProductPersistence getPRProductPersistence() {
		return prProductPersistence;
	}

	/**
	 * Sets the p r product persistence.
	 *
	 * @param prProductPersistence the p r product persistence
	 */
	public void setPRProductPersistence(
		PRProductPersistence prProductPersistence) {
		this.prProductPersistence = prProductPersistence;
	}

	/**
	 * Returns the p r registration local service.
	 *
	 * @return the p r registration local service
	 */
	public it.ariadne.prova.registration.service.PRRegistrationLocalService getPRRegistrationLocalService() {
		return prRegistrationLocalService;
	}

	/**
	 * Sets the p r registration local service.
	 *
	 * @param prRegistrationLocalService the p r registration local service
	 */
	public void setPRRegistrationLocalService(
		it.ariadne.prova.registration.service.PRRegistrationLocalService prRegistrationLocalService) {
		this.prRegistrationLocalService = prRegistrationLocalService;
	}

	/**
	 * Returns the p r registration persistence.
	 *
	 * @return the p r registration persistence
	 */
	public PRRegistrationPersistence getPRRegistrationPersistence() {
		return prRegistrationPersistence;
	}

	/**
	 * Sets the p r registration persistence.
	 *
	 * @param prRegistrationPersistence the p r registration persistence
	 */
	public void setPRRegistrationPersistence(
		PRRegistrationPersistence prRegistrationPersistence) {
		this.prRegistrationPersistence = prRegistrationPersistence;
	}

	/**
	 * Returns the p r user local service.
	 *
	 * @return the p r user local service
	 */
	public it.ariadne.prova.registration.service.PRUserLocalService getPRUserLocalService() {
		return prUserLocalService;
	}

	/**
	 * Sets the p r user local service.
	 *
	 * @param prUserLocalService the p r user local service
	 */
	public void setPRUserLocalService(
		it.ariadne.prova.registration.service.PRUserLocalService prUserLocalService) {
		this.prUserLocalService = prUserLocalService;
	}

	/**
	 * Returns the p r user persistence.
	 *
	 * @return the p r user persistence
	 */
	public PRUserPersistence getPRUserPersistence() {
		return prUserPersistence;
	}

	/**
	 * Sets the p r user persistence.
	 *
	 * @param prUserPersistence the p r user persistence
	 */
	public void setPRUserPersistence(PRUserPersistence prUserPersistence) {
		this.prUserPersistence = prUserPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();

		PersistedModelLocalServiceRegistryUtil.register("it.ariadne.prova.registration.model.PRUser",
			prUserLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"it.ariadne.prova.registration.model.PRUser");
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return PRUser.class;
	}

	protected String getModelClassName() {
		return PRUser.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = prUserPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = it.ariadne.prova.registration.service.PRProductLocalService.class)
	protected it.ariadne.prova.registration.service.PRProductLocalService prProductLocalService;
	@BeanReference(type = PRProductPersistence.class)
	protected PRProductPersistence prProductPersistence;
	@BeanReference(type = it.ariadne.prova.registration.service.PRRegistrationLocalService.class)
	protected it.ariadne.prova.registration.service.PRRegistrationLocalService prRegistrationLocalService;
	@BeanReference(type = PRRegistrationPersistence.class)
	protected PRRegistrationPersistence prRegistrationPersistence;
	@BeanReference(type = it.ariadne.prova.registration.service.PRUserLocalService.class)
	protected it.ariadne.prova.registration.service.PRUserLocalService prUserLocalService;
	@BeanReference(type = PRUserPersistence.class)
	protected PRUserPersistence prUserPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private PRUserLocalServiceClpInvoker _clpInvoker = new PRUserLocalServiceClpInvoker();
}