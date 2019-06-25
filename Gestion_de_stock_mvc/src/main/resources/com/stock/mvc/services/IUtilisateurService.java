package com.stock.mvc.services;

import java.util.List;

import com_stock_mvc_entities.Utilisateur;

public interface IUtilisateurService {
public Utilisateur save (Utilisateur entity);
	
	public Utilisateur update(Utilisateur entity);
	
	public List <Utilisateur> selectAll();
	
	public List <Utilisateur>	selectAll(String sortfiled, String sort);
	
	public Utilisateur getById(long id);
	
	public void remove(long id);
	
	public Utilisateur findone(String paramName, Object paramValue);
	
	public Utilisateur findOne(String[] paramNames, Object [] paramValues);
	
	public int findCountBy(String paramNames, String paramValues);

}
