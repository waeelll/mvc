package com.stock.mvc.services.impl;

import java.util.List;

import com.stock.mvc.dao.IUtilisateurDao;
import com.stock.mvc.services.IUtilisateurService;

import com_stock_mvc_entities.Utilisateur;

public class UtilisateurServiceImpl implements IUtilisateurService{

	private IUtilisateurDao dao;
	public void setDao(IUtilisateurDao dao) {
		this.dao=dao;
	}
	
	@Override
	public Utilisateur save(Utilisateur entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur update(Utilisateur entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Utilisateur> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Utilisateur> selectAll(String sortfiled, String sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Utilisateur findone(String paramName, Object paramValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur findOne(String[] paramNames, Object[] paramValues) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int findCountBy(String paramNames, String paramValues) {
		// TODO Auto-generated method stub
		return 0;
	}

}
