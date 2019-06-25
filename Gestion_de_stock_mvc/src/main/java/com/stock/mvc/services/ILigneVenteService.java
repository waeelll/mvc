package com.stock.mvc.services;

import java.util.List;

import com_stock_mvc_entities.LigneVente;

public interface ILigneVenteService {
public LigneVente save (LigneVente entity);
	
	public LigneVente update(LigneVente entity);
	
	public List <LigneVente> selectAll();
	
	public List <LigneVente>	selectAll(String sortfiled, String sort);
	
	public LigneVente getById(long id);
	
	public void remove(long id);
	
	public LigneVente findone(String paramName, Object paramValue);
	
	public LigneVente findOne(String[] paramNames, Object [] paramValues);
	
	public int findCountBy(String paramNames, String paramValues);

}
