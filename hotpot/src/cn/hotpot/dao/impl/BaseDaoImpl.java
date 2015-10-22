﻿package cn.hotpot.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.hotpot.dao.BaseDao;
import cn.hotpot.dao.BaseDao.Stack;



/**
 * @action 一个公共的Hibernate通用dao实现类<br>
 *         数据库访问层,每一个实现类都应该来继承该类<br>
 *         不应该重写里面的方法,需要相应的方法,直接到数据访问层每个类对应的接口中添加
 */
@SuppressWarnings("unchecked")
public abstract class BaseDaoImpl<E extends Serializable, PK extends Serializable>
		extends HibernateDaoSupport implements BaseDao<E, PK> {

	/**
	 * 为E对应的实例类型
	 */
	private Class<?> entityClass;

	/**
	 * 获取E实例类的类型
	 */
	public BaseDaoImpl() {
		Class<?> c = this.getClass();
		
		Type t = c.getGenericSuperclass();
		if (t instanceof ParameterizedType) {
			this.entityClass = (Class<?>) ((ParameterizedType) t)
					.getActualTypeArguments()[0];
		}
	}

	
	public E get(PK id) {
		return (E) this.getHibernateTemplate().get(this.entityClass, id);
	}


	public Object getStackValue(DetachedCriteria criteria, String propertyName,
			Stack value) {
		switch (value) {
		case MAX:
			criteria.setProjection(Projections.max(propertyName));
			break;
		case MIN:
			criteria.setProjection(Projections.min(propertyName));
			break;
		case AVG:
			criteria.setProjection(Projections.avg(propertyName));
			break;
		default:
			criteria.setProjection(Projections.sum(propertyName));
			break;
		}
		return this.findByCriteria(criteria, 0, 1).get(0);
	}

	public Integer getRowCount(DetachedCriteria criteria) {
		criteria.setProjection(Projections.rowCount());
		return (Integer) this.findByCriteria(criteria, 0, 1).get(0);
	}

	
	public E load(PK id) {
		return (E) this.getHibernateTemplate().load(this.entityClass, id);
	}
	

	public List<E> loadAll() {
		return this.getHibernateTemplate().loadAll(entityClass);
	}

	public List<E> find(String hql) {
		return this.getHibernateTemplate().find(hql);
	}

	public List<E> find(String hql, Object... values) {
		return this.getHibernateTemplate().find(hql, values);
	}


	public List<E> findByCriteria(DetachedCriteria criteria) {
		return this.getHibernateTemplate().findByCriteria(criteria);
	}

	public List<E> findByCriteria(DetachedCriteria criteria,
			Integer firstResult, Integer maxResults) {
		return this.getHibernateTemplate().findByCriteria(criteria,
				firstResult, maxResults);
	}

	public void save(E entity) throws HibernateException {
		this.getHibernateTemplate().save(entity);
	}

	public void delete(E entity) throws HibernateException {
		this.getHibernateTemplate().delete(entity);
	}


	public void delete(Collection<E> entitys) throws HibernateException {
		this.getHibernateTemplate().deleteAll(entitys);
	}

	public void update(E entity) throws HibernateException {
		this.getHibernateTemplate().update(entity);
	}


	public Integer bulkUpdate(String hql) {
		return this.getHibernateTemplate().bulkUpdate(hql);
	}

	public Integer bulkUpdate(String hql, Object... values) {
		
		return this.getHibernateTemplate().bulkUpdate(hql, values);
	}

	public void flush() throws HibernateException {
		this.getHibernateTemplate().flush();
	}


	public DetachedCriteria createDetachedCriteria() {
		return DetachedCriteria.forClass(this.entityClass);
	}

	public DetachedCriteria createDetachedCriteria(
			Class<? extends Serializable> c) {
		return DetachedCriteria.forClass(c);
	}

	public Criteria createCriteria() {
		return this.createDetachedCriteria().getExecutableCriteria(
				this.getSession());
	}
	
	public void callProcedure(final String sql, final Object[] inParams, final Object[] outParams, final List<Object> resultOut){
		this.getHibernateTemplate().execute(new HibernateCallback() {
			@Override
			public Object doInHibernate(Session session) throws HibernateException,
					SQLException {
				
				Connection conn = session.connection();
			
				CallableStatement pCall = ((java.sql.Connection) conn).prepareCall(sql);
				Integer i = 0;
				Integer paramsLen = inParams.length + outParams.length;
				if(inParams != null){
					for(i = 0; i < inParams.length; i++){
						pCall.setObject(i + 1, inParams[i]);

					}
				}
				if(outParams != null){
					for(; i < paramsLen; i++){
						pCall.registerOutParameter(i + 1, (Integer) outParams[i - inParams.length]);
					}
				}
				pCall.execute();
				
				if(outParams != null){
					for(i = inParams.length + 1; i <= paramsLen; i++){
						resultOut.add(pCall.getObject(i));
					}
				}
				
				return null;
			}
		});
	}

}
/*
bulkUpdate提供了批量删除和更新，直接转换为相应的update/delete SQL进行批量删除和更新

public void batchDelete(String name, int age) {  
    this.hibernateTemplate.bulkUpdate("delete Teacher where name=? and age = ?", new Object[]{name, age});  
}  
            
 
public void batchDelete(String name, String newName) {  
    this.hibernateTemplate.bulkUpdate("update Teacher set name=? where name=?", new Object[]{newName, name});  
}  
*/