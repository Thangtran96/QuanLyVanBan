/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.vanban.service.base;

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

import com.vanban.model.noiBanHanh;

import com.vanban.service.noiBanHanhLocalService;
import com.vanban.service.persistence.LoaiVBPersistence;
import com.vanban.service.persistence.nguoidungPersistence;
import com.vanban.service.persistence.nguoikiPersistence;
import com.vanban.service.persistence.noiBanHanhPersistence;
import com.vanban.service.persistence.vanbanPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the noi ban hanh local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.vanban.service.impl.noiBanHanhLocalServiceImpl}.
 * </p>
 *
 * @author nguye
 * @see com.vanban.service.impl.noiBanHanhLocalServiceImpl
 * @see com.vanban.service.noiBanHanhLocalServiceUtil
 * @generated
 */
public abstract class noiBanHanhLocalServiceBaseImpl
	extends BaseLocalServiceImpl implements noiBanHanhLocalService,
		IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.vanban.service.noiBanHanhLocalServiceUtil} to access the noi ban hanh local service.
	 */

	/**
	 * Adds the noi ban hanh to the database. Also notifies the appropriate model listeners.
	 *
	 * @param noiBanHanh the noi ban hanh
	 * @return the noi ban hanh that was added
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public noiBanHanh addnoiBanHanh(noiBanHanh noiBanHanh)
		throws SystemException {
		noiBanHanh.setNew(true);

		return noiBanHanhPersistence.update(noiBanHanh);
	}

	/**
	 * Creates a new noi ban hanh with the primary key. Does not add the noi ban hanh to the database.
	 *
	 * @param noiBHId the primary key for the new noi ban hanh
	 * @return the new noi ban hanh
	 */
	@Override
	public noiBanHanh createnoiBanHanh(long noiBHId) {
		return noiBanHanhPersistence.create(noiBHId);
	}

	/**
	 * Deletes the noi ban hanh with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param noiBHId the primary key of the noi ban hanh
	 * @return the noi ban hanh that was removed
	 * @throws PortalException if a noi ban hanh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public noiBanHanh deletenoiBanHanh(long noiBHId)
		throws PortalException, SystemException {
		return noiBanHanhPersistence.remove(noiBHId);
	}

	/**
	 * Deletes the noi ban hanh from the database. Also notifies the appropriate model listeners.
	 *
	 * @param noiBanHanh the noi ban hanh
	 * @return the noi ban hanh that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public noiBanHanh deletenoiBanHanh(noiBanHanh noiBanHanh)
		throws SystemException {
		return noiBanHanhPersistence.remove(noiBanHanh);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(noiBanHanh.class,
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
		return noiBanHanhPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vanban.model.impl.noiBanHanhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return noiBanHanhPersistence.findWithDynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vanban.model.impl.noiBanHanhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
		return noiBanHanhPersistence.findWithDynamicQuery(dynamicQuery, start,
			end, orderByComparator);
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
		return noiBanHanhPersistence.countWithDynamicQuery(dynamicQuery);
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
		return noiBanHanhPersistence.countWithDynamicQuery(dynamicQuery,
			projection);
	}

	@Override
	public noiBanHanh fetchnoiBanHanh(long noiBHId) throws SystemException {
		return noiBanHanhPersistence.fetchByPrimaryKey(noiBHId);
	}

	/**
	 * Returns the noi ban hanh with the primary key.
	 *
	 * @param noiBHId the primary key of the noi ban hanh
	 * @return the noi ban hanh
	 * @throws PortalException if a noi ban hanh with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public noiBanHanh getnoiBanHanh(long noiBHId)
		throws PortalException, SystemException {
		return noiBanHanhPersistence.findByPrimaryKey(noiBHId);
	}

	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException, SystemException {
		return noiBanHanhPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns a range of all the noi ban hanhs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vanban.model.impl.noiBanHanhModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of noi ban hanhs
	 * @param end the upper bound of the range of noi ban hanhs (not inclusive)
	 * @return the range of noi ban hanhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<noiBanHanh> getnoiBanHanhs(int start, int end)
		throws SystemException {
		return noiBanHanhPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of noi ban hanhs.
	 *
	 * @return the number of noi ban hanhs
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int getnoiBanHanhsCount() throws SystemException {
		return noiBanHanhPersistence.countAll();
	}

	/**
	 * Updates the noi ban hanh in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param noiBanHanh the noi ban hanh
	 * @return the noi ban hanh that was updated
	 * @throws SystemException if a system exception occurred
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public noiBanHanh updatenoiBanHanh(noiBanHanh noiBanHanh)
		throws SystemException {
		return noiBanHanhPersistence.update(noiBanHanh);
	}

	/**
	 * Returns the loai v b local service.
	 *
	 * @return the loai v b local service
	 */
	public com.vanban.service.LoaiVBLocalService getLoaiVBLocalService() {
		return loaiVBLocalService;
	}

	/**
	 * Sets the loai v b local service.
	 *
	 * @param loaiVBLocalService the loai v b local service
	 */
	public void setLoaiVBLocalService(
		com.vanban.service.LoaiVBLocalService loaiVBLocalService) {
		this.loaiVBLocalService = loaiVBLocalService;
	}

	/**
	 * Returns the loai v b remote service.
	 *
	 * @return the loai v b remote service
	 */
	public com.vanban.service.LoaiVBService getLoaiVBService() {
		return loaiVBService;
	}

	/**
	 * Sets the loai v b remote service.
	 *
	 * @param loaiVBService the loai v b remote service
	 */
	public void setLoaiVBService(com.vanban.service.LoaiVBService loaiVBService) {
		this.loaiVBService = loaiVBService;
	}

	/**
	 * Returns the loai v b persistence.
	 *
	 * @return the loai v b persistence
	 */
	public LoaiVBPersistence getLoaiVBPersistence() {
		return loaiVBPersistence;
	}

	/**
	 * Sets the loai v b persistence.
	 *
	 * @param loaiVBPersistence the loai v b persistence
	 */
	public void setLoaiVBPersistence(LoaiVBPersistence loaiVBPersistence) {
		this.loaiVBPersistence = loaiVBPersistence;
	}

	/**
	 * Returns the nguoidung local service.
	 *
	 * @return the nguoidung local service
	 */
	public com.vanban.service.nguoidungLocalService getnguoidungLocalService() {
		return nguoidungLocalService;
	}

	/**
	 * Sets the nguoidung local service.
	 *
	 * @param nguoidungLocalService the nguoidung local service
	 */
	public void setnguoidungLocalService(
		com.vanban.service.nguoidungLocalService nguoidungLocalService) {
		this.nguoidungLocalService = nguoidungLocalService;
	}

	/**
	 * Returns the nguoidung remote service.
	 *
	 * @return the nguoidung remote service
	 */
	public com.vanban.service.nguoidungService getnguoidungService() {
		return nguoidungService;
	}

	/**
	 * Sets the nguoidung remote service.
	 *
	 * @param nguoidungService the nguoidung remote service
	 */
	public void setnguoidungService(
		com.vanban.service.nguoidungService nguoidungService) {
		this.nguoidungService = nguoidungService;
	}

	/**
	 * Returns the nguoidung persistence.
	 *
	 * @return the nguoidung persistence
	 */
	public nguoidungPersistence getnguoidungPersistence() {
		return nguoidungPersistence;
	}

	/**
	 * Sets the nguoidung persistence.
	 *
	 * @param nguoidungPersistence the nguoidung persistence
	 */
	public void setnguoidungPersistence(
		nguoidungPersistence nguoidungPersistence) {
		this.nguoidungPersistence = nguoidungPersistence;
	}

	/**
	 * Returns the nguoiki local service.
	 *
	 * @return the nguoiki local service
	 */
	public com.vanban.service.nguoikiLocalService getnguoikiLocalService() {
		return nguoikiLocalService;
	}

	/**
	 * Sets the nguoiki local service.
	 *
	 * @param nguoikiLocalService the nguoiki local service
	 */
	public void setnguoikiLocalService(
		com.vanban.service.nguoikiLocalService nguoikiLocalService) {
		this.nguoikiLocalService = nguoikiLocalService;
	}

	/**
	 * Returns the nguoiki remote service.
	 *
	 * @return the nguoiki remote service
	 */
	public com.vanban.service.nguoikiService getnguoikiService() {
		return nguoikiService;
	}

	/**
	 * Sets the nguoiki remote service.
	 *
	 * @param nguoikiService the nguoiki remote service
	 */
	public void setnguoikiService(
		com.vanban.service.nguoikiService nguoikiService) {
		this.nguoikiService = nguoikiService;
	}

	/**
	 * Returns the nguoiki persistence.
	 *
	 * @return the nguoiki persistence
	 */
	public nguoikiPersistence getnguoikiPersistence() {
		return nguoikiPersistence;
	}

	/**
	 * Sets the nguoiki persistence.
	 *
	 * @param nguoikiPersistence the nguoiki persistence
	 */
	public void setnguoikiPersistence(nguoikiPersistence nguoikiPersistence) {
		this.nguoikiPersistence = nguoikiPersistence;
	}

	/**
	 * Returns the noi ban hanh local service.
	 *
	 * @return the noi ban hanh local service
	 */
	public com.vanban.service.noiBanHanhLocalService getnoiBanHanhLocalService() {
		return noiBanHanhLocalService;
	}

	/**
	 * Sets the noi ban hanh local service.
	 *
	 * @param noiBanHanhLocalService the noi ban hanh local service
	 */
	public void setnoiBanHanhLocalService(
		com.vanban.service.noiBanHanhLocalService noiBanHanhLocalService) {
		this.noiBanHanhLocalService = noiBanHanhLocalService;
	}

	/**
	 * Returns the noi ban hanh remote service.
	 *
	 * @return the noi ban hanh remote service
	 */
	public com.vanban.service.noiBanHanhService getnoiBanHanhService() {
		return noiBanHanhService;
	}

	/**
	 * Sets the noi ban hanh remote service.
	 *
	 * @param noiBanHanhService the noi ban hanh remote service
	 */
	public void setnoiBanHanhService(
		com.vanban.service.noiBanHanhService noiBanHanhService) {
		this.noiBanHanhService = noiBanHanhService;
	}

	/**
	 * Returns the noi ban hanh persistence.
	 *
	 * @return the noi ban hanh persistence
	 */
	public noiBanHanhPersistence getnoiBanHanhPersistence() {
		return noiBanHanhPersistence;
	}

	/**
	 * Sets the noi ban hanh persistence.
	 *
	 * @param noiBanHanhPersistence the noi ban hanh persistence
	 */
	public void setnoiBanHanhPersistence(
		noiBanHanhPersistence noiBanHanhPersistence) {
		this.noiBanHanhPersistence = noiBanHanhPersistence;
	}

	/**
	 * Returns the vanban local service.
	 *
	 * @return the vanban local service
	 */
	public com.vanban.service.vanbanLocalService getvanbanLocalService() {
		return vanbanLocalService;
	}

	/**
	 * Sets the vanban local service.
	 *
	 * @param vanbanLocalService the vanban local service
	 */
	public void setvanbanLocalService(
		com.vanban.service.vanbanLocalService vanbanLocalService) {
		this.vanbanLocalService = vanbanLocalService;
	}

	/**
	 * Returns the vanban remote service.
	 *
	 * @return the vanban remote service
	 */
	public com.vanban.service.vanbanService getvanbanService() {
		return vanbanService;
	}

	/**
	 * Sets the vanban remote service.
	 *
	 * @param vanbanService the vanban remote service
	 */
	public void setvanbanService(com.vanban.service.vanbanService vanbanService) {
		this.vanbanService = vanbanService;
	}

	/**
	 * Returns the vanban persistence.
	 *
	 * @return the vanban persistence
	 */
	public vanbanPersistence getvanbanPersistence() {
		return vanbanPersistence;
	}

	/**
	 * Sets the vanban persistence.
	 *
	 * @param vanbanPersistence the vanban persistence
	 */
	public void setvanbanPersistence(vanbanPersistence vanbanPersistence) {
		this.vanbanPersistence = vanbanPersistence;
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

		PersistedModelLocalServiceRegistryUtil.register("com.vanban.model.noiBanHanh",
			noiBanHanhLocalService);
	}

	public void destroy() {
		PersistedModelLocalServiceRegistryUtil.unregister(
			"com.vanban.model.noiBanHanh");
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
		return noiBanHanh.class;
	}

	protected String getModelClassName() {
		return noiBanHanh.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = noiBanHanhPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = com.vanban.service.LoaiVBLocalService.class)
	protected com.vanban.service.LoaiVBLocalService loaiVBLocalService;
	@BeanReference(type = com.vanban.service.LoaiVBService.class)
	protected com.vanban.service.LoaiVBService loaiVBService;
	@BeanReference(type = LoaiVBPersistence.class)
	protected LoaiVBPersistence loaiVBPersistence;
	@BeanReference(type = com.vanban.service.nguoidungLocalService.class)
	protected com.vanban.service.nguoidungLocalService nguoidungLocalService;
	@BeanReference(type = com.vanban.service.nguoidungService.class)
	protected com.vanban.service.nguoidungService nguoidungService;
	@BeanReference(type = nguoidungPersistence.class)
	protected nguoidungPersistence nguoidungPersistence;
	@BeanReference(type = com.vanban.service.nguoikiLocalService.class)
	protected com.vanban.service.nguoikiLocalService nguoikiLocalService;
	@BeanReference(type = com.vanban.service.nguoikiService.class)
	protected com.vanban.service.nguoikiService nguoikiService;
	@BeanReference(type = nguoikiPersistence.class)
	protected nguoikiPersistence nguoikiPersistence;
	@BeanReference(type = com.vanban.service.noiBanHanhLocalService.class)
	protected com.vanban.service.noiBanHanhLocalService noiBanHanhLocalService;
	@BeanReference(type = com.vanban.service.noiBanHanhService.class)
	protected com.vanban.service.noiBanHanhService noiBanHanhService;
	@BeanReference(type = noiBanHanhPersistence.class)
	protected noiBanHanhPersistence noiBanHanhPersistence;
	@BeanReference(type = com.vanban.service.vanbanLocalService.class)
	protected com.vanban.service.vanbanLocalService vanbanLocalService;
	@BeanReference(type = com.vanban.service.vanbanService.class)
	protected com.vanban.service.vanbanService vanbanService;
	@BeanReference(type = vanbanPersistence.class)
	protected vanbanPersistence vanbanPersistence;
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
	private noiBanHanhLocalServiceClpInvoker _clpInvoker = new noiBanHanhLocalServiceClpInvoker();
}