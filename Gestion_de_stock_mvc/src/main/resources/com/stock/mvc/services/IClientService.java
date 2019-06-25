package com.stock.mvc.services;

import java.util.List;

import com_stock_mvc_entities.Client;

public interface IClientService {

public Client save (Client entity);
	
	public Client update(Client entity);
	
	public List <Client> selectAll();
	
	public List <Client>	selectAll(String sortfiled, String sort);
	
	public Client getById(long id);
	
	public void remove(long id);
	
	public Client findone(String paramName, Object paramValue);
	
	public Client findOne(String[] paramNames, Object [] paramValues);
	
	public int findCountBy(String paramNames, String paramValues);
}
