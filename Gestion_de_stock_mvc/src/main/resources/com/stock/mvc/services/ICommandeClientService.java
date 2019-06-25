package com.stock.mvc.services;

import java.util.List;

import com_stock_mvc_entities.CommandeClient;

public interface ICommandeClientService {
public CommandeClient save (CommandeClient entity);
	
	public CommandeClient update(CommandeClient entity);
	
	public List <CommandeClient> selectAll();
	
	public List <CommandeClient>	selectAll(String sortfiled, String sort);
	
	public CommandeClient getById(long id);
	
	public void remove(long id);
	
	public CommandeClient findone(String paramName, Object paramValue);
	
	public CommandeClient findOne(String[] paramNames, Object [] paramValues);
	
	public int findCountBy(String paramNames, String paramValues);
}
