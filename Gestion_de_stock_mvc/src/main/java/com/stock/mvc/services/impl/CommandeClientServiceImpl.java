package com.stock.mvc.services.impl;

import java.util.List;

import com.stock.mvc.dao.ICommandeClientDao;
import com.stock.mvc.services.ICommandeClientService;

import com_stock_mvc_entities.CommandeClient;

public class CommandeClientServiceImpl implements ICommandeClientService {

	
	private ICommandeClientDao dao;
	
	public void setDao(ICommandeClientDao dao) {
		this.dao=dao;
	}
	@Override
	public CommandeClient save(CommandeClient entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CommandeClient update(CommandeClient entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CommandeClient> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CommandeClient> selectAll(String sortfiled, String sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CommandeClient getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CommandeClient findone(String paramName, Object paramValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CommandeClient findOne(String[] paramNames, Object[] paramValues) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int findCountBy(String paramNames, String paramValues) {
		// TODO Auto-generated method stub
		return 0;
	}

}
