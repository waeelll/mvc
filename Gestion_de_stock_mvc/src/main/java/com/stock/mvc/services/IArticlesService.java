package com.stock.mvc.services;

import java.util.List;

import com_stock_mvc_entities.Articles;

public interface IArticlesService {

	
	public Articles save (Articles entity);
	
	public Articles update(Articles entity);
	
	public List <Articles> selectAll();
	
	public List <Articles>	selectAll(String sortfiled, String sort);
	
	public Articles getById(long id);
	
	public void remove(long id);
	
	public Articles findone(String paramName, Object paramValue);
	
	public Articles findOne(String[] paramNames, Object [] paramValues);
	
	public int findCountBy(String paramNames, String paramValues);

	

}
