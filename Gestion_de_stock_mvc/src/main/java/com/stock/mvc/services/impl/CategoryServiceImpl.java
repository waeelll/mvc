package com.stock.mvc.services.impl;

import java.util.List;

import com.stock.mvc.dao.IArticleDao;
import com.stock.mvc.dao.ICategoryDao;
import com.stock.mvc.services.ICategoryService;

import com_stock_mvc_entities.Category;

public class CategoryServiceImpl implements ICategoryService {

	
	private ICategoryDao dao;
	
	
	
	// ça sera utiliser par spring pour faire l'injection d'indepdence 
	public void setDao(ICategoryDao dao) {
		this.dao=dao;
	}
	@Override
	public Category save(Category entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category update(Category entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Category> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Category> selectAll(String sortfiled, String sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Category findone(String paramName, Object paramValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category findOne(String[] paramNames, Object[] paramValues) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int findCountBy(String paramNames, String paramValues) {
		// TODO Auto-generated method stub
		return 0;
	}

}
