﻿package cn.hotpot.biz;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

public interface BaseBiz {
	/**
	 * 按主键数组
	 * @param args
	 * @throws Exception
	 */
	public abstract void deleteByParam(Serializable[] args) throws Exception;
	
	public abstract void saveByParam(Serializable[] args) throws Exception;
	
	public abstract void delete(Serializable entity) throws Exception;
	/**
	 * 基本保存方法
	 * @param entity
	 * @throws Exception
	 */
	public abstract void save(Serializable entity) throws Exception;

	/**
	 * 基本更新方法
	 * @param entity
	 * @throws Exception
	 */
	public abstract void update(Serializable entity) throws Exception;

	/**
	 * 按主键查
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public abstract Object findById(Serializable id) throws Exception;

	/**
	 * 按条件查
	 * @param dc
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public abstract List findByCriteria(DetachedCriteria dc) throws Exception;
	
	/**
	 * 按条件分页
	 * @param firstResult
	 * @param maxResults
	 * @param dc
	 * @return
	 * @throws Exception
	 */
	@SuppressWarnings("unchecked")
	public abstract List findByCriteria(int currentPage, int pageSize,DetachedCriteria dc) throws Exception;

	/**
	 * 求满足条件的行数
	 * @param dc
	 * @return
	 * @throws Exception
	 */
	public abstract int getRowCount(DetachedCriteria dc) throws Exception;
	
	
	public abstract List findByHql(String hql) throws Exception;
	
	public abstract List findByHql(String hql, Object... values) throws Exception;
	
	public abstract void bulkUpdate(String hql) throws Exception;
	public abstract void bulkUpdate(String hql, Object... values) throws Exception;
	
}
