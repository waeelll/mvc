package com.stock.mvc.services;

import java.util.List;

import com_stock_mvc_entities.MvtStck;

public interface IMvtStckService {
public MvtStck save (MvtStck entity);
	
	public MvtStck update(MvtStck entity);
	
	public List <MvtStck> selectAll();
	
	public List <MvtStck>	selectAll(String sortfiled, String sort);
	
	public MvtStck getById(long id);
	
	public void remove(long id);
	
	public MvtStck findone(String paramName, Object paramValue);
	
	public MvtStck findOne(String[] paramNames, Object [] paramValues);
	
	public int findCountBy(String paramNames, String paramValues);

}
