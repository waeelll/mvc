package com.stock.mvc.services;

import java.util.List;


import com_stock_mvc_entities.Category;

public interface ICategoryService {

public Category save (Category entity);
	
	public Category update(Category entity);
	
	public List <Category> selectAll();
	
	public List <Category>	selectAll(String sortfiled, String sort);
	
	public Category getById(long id);
	
	public void remove(long id);
	
	public Category findone(String paramName, Object paramValue);
	
	public Category findOne(String[] paramNames, Object [] paramValues);
	
	public int findCountBy(String paramNames, String paramValues);

}
