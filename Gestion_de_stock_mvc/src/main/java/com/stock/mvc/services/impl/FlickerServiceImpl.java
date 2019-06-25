package com.stock.mvc.services.impl;

import java.io.InputStream;

import com.stock.mvc.dao.IFlickrDao;
import com.stock.mvc.services.IFlickrService;

public class FlickerServiceImpl implements IFlickrService{
	
	private IFlickrDao dao;
	
	public void seDao(IFlickrDao dao) {
		this.dao= dao;
		 
	}
	
	public String savePhoto(InputStream photo, String title) throws Exception{
		return dao.savePhoto(photo, title);
	}

}
