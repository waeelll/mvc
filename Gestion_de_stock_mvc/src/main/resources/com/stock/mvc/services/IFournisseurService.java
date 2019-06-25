package com.stock.mvc.services;

import java.util.List;

import com_stock_mvc_entities.Fournisseur;

public interface IFournisseurService {

public Fournisseur save (Fournisseur entity);
	
	public Fournisseur update(Fournisseur entity);
	
	public List <Fournisseur> selectAll();
	
	public List <Fournisseur>	selectAll(String sortfiled, String sort);
	
	public Fournisseur getById(long id);
	
	public void remove(long id);
	
	public Fournisseur findone(String paramName, Object paramValue);
	
	public Fournisseur findOne(String[] paramNames, Object [] paramValues);
	
	public int findCountBy(String paramNames, String paramValues);
}
