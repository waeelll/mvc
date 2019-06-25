package com.stock.mvc.services;

import java.util.List;

import com_stock_mvc_entities.Articles;
import com_stock_mvc_entities.Vente;

public interface IVenteService {
	
public Vente save (Vente entity);
	
	public Vente update(Vente entity);
	
	public List <Vente> selectAll();
	
	public List <Vente>	selectAll(String sortfiled, String sort);
	
	public Articles getById(long id);
	
	public void remove(long id);
	
	public Vente findone(String paramName, Object paramValue);
	
	public Vente findOne(String[] paramNames, Object [] paramValues);
	
	public int findCountBy(String paramNames, String paramValues);

}
