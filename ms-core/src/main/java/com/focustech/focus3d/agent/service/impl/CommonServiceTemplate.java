package com.focustech.focus3d.agent.service.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import com.focustech.focus3d.agent.dao.CommonDao;
/**
 *
 * *
 * @author lihaijun
 *
 */
public abstract class CommonServiceTemplate<T> {

	public abstract CommonDao<T> getDao();

	public void insert(T t) {
		getDao().insert(t);
	}

	public T selectByKey(T t) {
		return getDao().selectByKey(t);
	}

	public int updateByKeySelective(T t) {
		return getDao().updateByKeySelective(t);
	}

	public int countByCriteria(Object u) {
		return getDao().countByCriteria(u);
	}

	public int deleteByCriteria(Object u) {
		return getDao().deleteByCriteria(u);
	}

	public List<T> selectByCriteria(Object u, Class<?> targetClass) {
		return getDao().selectByCriteria(u, targetClass);
	}

	public T selectFirstByExample(Object u, Class<?> targetClass) {
		return getDao().selectFirstByExample(u, targetClass);
	}

	public int updateByCriteriaSelective(Object u) {
		return getDao().updateByCriteriaSelective(u);
	}

	public T selectBySn(Long sn, Class<?> cls){

		return getDao().selectByKey(sn, cls);
	}

	public List<T> list(){
		ParameterizedType genericType = (ParameterizedType)this.getClass().getGenericSuperclass();
		Class<T> targetClass = (Class<T>)genericType.getActualTypeArguments()[0];
		Class<? super T> targetSuperClass = targetClass.getSuperclass();
		Object u = null;
		try {
			try {
				u = Class.forName(targetSuperClass.getName() + "Criteria").newInstance();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return selectByCriteria(u, targetClass);
	}
	public T selectBySn(Long sn){
		ParameterizedType genericType = (ParameterizedType)this.getClass().getGenericSuperclass();
		Class<T> targetClass = (Class<T>)genericType.getActualTypeArguments()[0];
		return selectBySn(sn, targetClass);
	}

	public void insertBySystem(T t){
		getDao().insertBySystem(t);
	}
}
