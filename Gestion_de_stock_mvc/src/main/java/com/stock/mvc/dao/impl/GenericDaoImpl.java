package com.stock.mvc.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.stock.mvc.dao.IGenericDao;


@SuppressWarnings("unchecked")
public class GenericDaoImpl<E> implements IGenericDao<E>{

	@PersistenceContext
	EntityManager em;
	
	private Class<E> type;
	
	public GenericDaoImpl() {
		// TODO Auto-generated constructor stub
		 Type t = getClass().getGenericSuperclass();
		 ParameterizedType pt = (ParameterizedType) t;
		 type = (Class<E>) pt.getActualTypeArguments()[0];
		 
		 
		 
	 }
	
	
	
		
	
	
	
	public Class<E> getType() {
		return type;
	}







	@Override
	public E save(E entity) {
		// TODO Auto-generated method stub
		em.persist(entity);
		return entity;
	}

	@Override
	public E update(E entity) {
		// TODO Auto-generated method stub
		
		em.merge(entity);
		return entity;
	}

	@Override
	public List<E> selectAll() {
		// TODO Auto-generated method stub
		Query query = em.createQuery("select t from "+ type.getSimpleName()+"t");
		return query.getResultList();
		
	
	}

	@Override
	public List<E> selectAll(String sortfiled, String sort) {
		Query querry = em.createQuery("select t from "+ type.getSimpleName()+"t order by"+ sortfiled+""+ sort);
		return querry.getResultList();
	}

	@Override
	public E getById(long id) {
	return em.find(type, id);
	
	}

	@Override
	public void remove(long id) {
		E tab = em.getReference(type, id);
		em.remove(tab);
	}

	@Override
	public E findone(String paramName, Object paramValue) {
		// TODO Auto-generated method stub
		
		Query query = em.createQuery("select t from "+ type.getSimpleName()+"t where"+ paramName + "= :x");
		query.setParameter(paramName, paramValue);
		return query.getResultList().size()>0 ? (E) query.getResultList().get(0) : null; 
		
	}

	@Override
	public E findOne(String[] paramNames, Object[] paramValues) {
		if(paramNames.length != paramValues.length) {
			return null;
	}
		String queryString = "select e from"+ type.getName()+"e where";
		int len = paramNames.length;
		for(int i=0;  i<len ;i++) {
			queryString += "e." +paramNames[i] + "= :x"+i;
			if((i+1)<len) {
				queryString +="and";
			}
		}
		Query query = em.createQuery(queryString);
		
		for (int i=0; i<len; i++) {
			query.setParameter("x"+i, paramValues[i]);
		}
		return query.getResultList().size()>0 ? (E) query.getResultList().get(0) : null;
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		Query query = em.createQuery("select t from "+ type.getSimpleName()+"t where"+ paramName + "= :x");
		query.setParameter(paramName, paramValue);
		
		return query.getResultList().size()>0 ? ((Long) query.getSingleResult()).intValue():0;
	}









}
