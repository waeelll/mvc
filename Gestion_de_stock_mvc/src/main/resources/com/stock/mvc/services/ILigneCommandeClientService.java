package com.stock.mvc.services;

import java.util.List;

import com_stock_mvc_entities.LigneCommandeClient;

public interface ILigneCommandeClientService {
public LigneCommandeClient save (LigneCommandeClient entity);
	
	public LigneCommandeClient update(LigneCommandeClient entity);
	
	public List <LigneCommandeClient> selectAll();
	
	public List <LigneCommandeClient>	selectAll(String sortfiled, String sort);
	
	public LigneCommandeClient getById(long id);
	
	public void remove(long id);
	
	public LigneCommandeClient findone(String paramName, Object paramValue);
	
	public LigneCommandeClient findOne(String[] paramNames, Object [] paramValues);
	
	public int findCountBy(String paramNames, String paramValues);

}
