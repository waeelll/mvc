package com.stock.mvc.services;

import java.util.List;

import com_stock_mvc_entities.LigneCommandeFournisseur;

public interface ILigneCommandeFournisseurService {
public LigneCommandeFournisseur save (LigneCommandeFournisseur entity);
	
	public LigneCommandeFournisseur update(LigneCommandeFournisseur entity);
	
	public List <LigneCommandeFournisseur> selectAll();
	
	public List <LigneCommandeFournisseur>	selectAll(String sortfiled, String sort);
	
	public LigneCommandeFournisseur getById(long id);
	
	public void remove(long id);
	
	public LigneCommandeFournisseur findone(String paramName, Object paramValue);
	
	public LigneCommandeFournisseur findOne(String[] paramNames, Object [] paramValues);
	
	public int findCountBy(String paramNames, String paramValues);

}
