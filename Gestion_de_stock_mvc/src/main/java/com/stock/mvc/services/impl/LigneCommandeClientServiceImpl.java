package com.stock.mvc.services.impl;

import java.util.List;

import com.stock.mvc.dao.ILigneCommandeClientDao;
import com.stock.mvc.services.ILigneCommandeClientService;

import com_stock_mvc_entities.LigneCommandeClient;

public class LigneCommandeClientServiceImpl implements ILigneCommandeClientService {

	private ILigneCommandeClientDao dao;
	public void setDao(ILigneCommandeClientDao dao) {
		this.dao=dao;
	}
	
	@Override
	public LigneCommandeClient save(LigneCommandeClient entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LigneCommandeClient update(LigneCommandeClient entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LigneCommandeClient> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LigneCommandeClient> selectAll(String sortfiled, String sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LigneCommandeClient getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public LigneCommandeClient findone(String paramName, Object paramValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LigneCommandeClient findOne(String[] paramNames, Object[] paramValues) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int findCountBy(String paramNames, String paramValues) {
		// TODO Auto-generated method stub
		return 0;
	}

}
