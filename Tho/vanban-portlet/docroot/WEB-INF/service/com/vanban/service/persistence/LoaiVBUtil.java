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

package com.vanban.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.vanban.model.LoaiVB;

import java.util.List;

/**
 * The persistence utility for the loai v b service. This utility wraps {@link LoaiVBPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author nguye
 * @see LoaiVBPersistence
 * @see LoaiVBPersistenceImpl
 * @generated
 */
public class LoaiVBUtil {
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
	public static void clearCache(LoaiVB loaiVB) {
		getPersistence().clearCache(loaiVB);
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
	public static List<LoaiVB> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<LoaiVB> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<LoaiVB> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static LoaiVB update(LoaiVB loaiVB) throws SystemException {
		return getPersistence().update(loaiVB);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static LoaiVB update(LoaiVB loaiVB, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(loaiVB, serviceContext);
	}

	/**
	* Caches the loai v b in the entity cache if it is enabled.
	*
	* @param loaiVB the loai v b
	*/
	public static void cacheResult(com.vanban.model.LoaiVB loaiVB) {
		getPersistence().cacheResult(loaiVB);
	}

	/**
	* Caches the loai v bs in the entity cache if it is enabled.
	*
	* @param loaiVBs the loai v bs
	*/
	public static void cacheResult(
		java.util.List<com.vanban.model.LoaiVB> loaiVBs) {
		getPersistence().cacheResult(loaiVBs);
	}

	/**
	* Creates a new loai v b with the primary key. Does not add the loai v b to the database.
	*
	* @param loaiId the primary key for the new loai v b
	* @return the new loai v b
	*/
	public static com.vanban.model.LoaiVB create(long loaiId) {
		return getPersistence().create(loaiId);
	}

	/**
	* Removes the loai v b with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param loaiId the primary key of the loai v b
	* @return the loai v b that was removed
	* @throws com.vanban.NoSuchLoaiVBException if a loai v b with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vanban.model.LoaiVB remove(long loaiId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vanban.NoSuchLoaiVBException {
		return getPersistence().remove(loaiId);
	}

	public static com.vanban.model.LoaiVB updateImpl(
		com.vanban.model.LoaiVB loaiVB)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(loaiVB);
	}

	/**
	* Returns the loai v b with the primary key or throws a {@link com.vanban.NoSuchLoaiVBException} if it could not be found.
	*
	* @param loaiId the primary key of the loai v b
	* @return the loai v b
	* @throws com.vanban.NoSuchLoaiVBException if a loai v b with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vanban.model.LoaiVB findByPrimaryKey(long loaiId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.vanban.NoSuchLoaiVBException {
		return getPersistence().findByPrimaryKey(loaiId);
	}

	/**
	* Returns the loai v b with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param loaiId the primary key of the loai v b
	* @return the loai v b, or <code>null</code> if a loai v b with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.vanban.model.LoaiVB fetchByPrimaryKey(long loaiId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(loaiId);
	}

	/**
	* Returns all the loai v bs.
	*
	* @return the loai v bs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vanban.model.LoaiVB> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the loai v bs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vanban.model.impl.LoaiVBModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of loai v bs
	* @param end the upper bound of the range of loai v bs (not inclusive)
	* @return the range of loai v bs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vanban.model.LoaiVB> findAll(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the loai v bs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.vanban.model.impl.LoaiVBModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of loai v bs
	* @param end the upper bound of the range of loai v bs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of loai v bs
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.vanban.model.LoaiVB> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the loai v bs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of loai v bs.
	*
	* @return the number of loai v bs
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static LoaiVBPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (LoaiVBPersistence)PortletBeanLocatorUtil.locate(com.vanban.service.ClpSerializer.getServletContextName(),
					LoaiVBPersistence.class.getName());

			ReferenceRegistry.registerReference(LoaiVBUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(LoaiVBPersistence persistence) {
	}

	private static LoaiVBPersistence _persistence;
}