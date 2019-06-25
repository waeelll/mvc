package com_stock_mvc_entities;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Category implements Serializable {
	
	@Id
	@GeneratedValue
	
	private long idCategory;
	
	private String code;
	
	private String designation;
	
	@OneToMany(mappedBy= "category")
	private List <Articles> articles;
	
	public Category() {
		// TODO Auto-generated constructor stub
	}

	public long getIdCategory() {
		return idCategory;
	}

	public void setIdCategory(long idCategory) {
		this.idCategory = idCategory;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public List<Articles> getArticles() {
		return articles;
	}

	public void setArticles(List<Articles> articles) {
		this.articles = articles;
	}
	
	
	
	

}
