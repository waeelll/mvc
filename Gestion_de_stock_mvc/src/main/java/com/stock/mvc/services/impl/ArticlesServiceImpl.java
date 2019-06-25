package com.stock.mvc.services.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.stock.mvc.dao.IArticleDao;
import com.stock.mvc.services.IArticlesService;

import com_stock_mvc_entities.Articles;


@Transactional
// pour dire que toutes les methodes sont transactionnelles 
public class ArticlesServiceImpl implements IArticlesService {

	private IArticleDao dao;
	
	
	
	// ça sera utiliser par spring pour faire l'injection d'indepdence 
	public void setDao(IArticleDao dao) {
		this.dao=dao;
	}
	
	
	
	
	@Override
	public Articles save(Articles entity) {
		// TODO Auto-generated method stub
		return dao.save(entity);
	}

	@Override
	public Articles update(Articles entity) {
		// TODO Auto-generated method stub
		return dao.update(entity);
	}

	@Override
	public List<Articles> selectAll() {
		// TODO Auto-generated method stub
		return dao.selectAll();
	}

	@Override
	public List<Articles> selectAll(String sortfiled, String sort) {
		// TODO Auto-generated method stub
		return dao.selectAll(sortfiled, sort);
	}

	@Override
	public Articles getById(long id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}

	@Override
	public void remove(long id) {
		// TODO Auto-generated method stub
		dao.remove(id);
	}

	@Override
	public Articles findone(String paramName, Object paramValue) {
		// TODO Auto-generated method stub
		return dao.findone(paramName, paramValue);
	}

	@Override
	public Articles findOne(String[] paramNames, Object[] paramValues) {
		// TODO Auto-generated method stub
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramNames, String paramValues) {
		// TODO Auto-generated method stub
		return dao.findCountBy(paramNames, paramValues);
	}

}
