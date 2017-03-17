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
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import com.vanban.model.LoaiVB;

import com.vanban.service.LoaiVBService;
import com.vanban.service.persistence.LoaiVBPersistence;
import com.vanban.service.persistence.nguoidungPersistence;
import com.vanban.service.persistence.nguoikiPersistence;
import com.vanban.service.persistence.noiBanHanhPersistence;
import com.vanban.service.persistence.vanbanPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the loai v b remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.vanban.service.impl.LoaiVBServiceImpl}.
 * </p>
 *
 * @author nguye
 * @see com.vanban.service.impl.LoaiVBServiceImpl
 * @see com.vanban.service.LoaiVBServiceUtil
 * @generated
 */
public abstract class LoaiVBServiceBaseImpl extends BaseServiceImpl
	implements LoaiVBService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link com.vanban.service.LoaiVBServiceUtil} to access the loai v b remote service.
	 */

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
	}

	public void destroy() {
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
		return LoaiVB.class;
	}

	protected String getModelClassName() {
		return LoaiVB.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = loaiVBPersistence.getDataSource();

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
	private LoaiVBServiceClpInvoker _clpInvoker = new LoaiVBServiceClpInvoker();
}