package com.stock.mvc.services.impl;

import java.util.List;

import com.stock.mvc.dao.ILigneVenteDao;
import com.stock.mvc.services.ILigneVenteService;

import com_stock_mvc_entities.LigneVente;

public class LigneVenteServiceImpl implements ILigneVenteService {
	
	
	private ILigneVenteDao dao;
	
	public void setDao(ILigneVenteDao dao) {
		this.dao=dao;
	}
	
	@Override
	public LigneVente save(LigneVente entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LigneVente update(LigneVente entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LigneVente> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LigneVente> selectAll(String sortfiled, String sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LigneVente getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public LigneVente findone(String paramName, Object paramValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LigneVente findOne(String[] paramNames, Object[] paramValues) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int findCountBy(String paramNames, String paramValues) {
		// TODO Auto-generated method stub
		return 0;
	}

}
