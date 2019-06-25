package com.stock.mvc.services;

import java.util.List;

import com_stock_mvc_entities.Articles;
import com_stock_mvc_entities.CommandeFournisseur;

public interface ICommandeFournisseurService {
public CommandeFournisseur save (CommandeFournisseur entity);
	
	public CommandeFournisseur update(Articles entity);
	
	public List <CommandeFournisseur> selectAll();
	
	public List <CommandeFournisseur>	selectAll(String sortfiled, String sort);
	
	public CommandeFournisseur getById(long id);
	
	public void remove(long id);
	
	public CommandeFournisseur findone(String paramName, Object paramValue);
	
	public CommandeFournisseur findOne(String[] paramNames, Object [] paramValues);
	
	public int findCountBy(String paramNames, String paramValues);

}
