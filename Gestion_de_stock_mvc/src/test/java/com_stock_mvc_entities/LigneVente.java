package com_stock_mvc_entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class LigneVente implements Serializable {
	
	
	@Id
	@GeneratedValue
	private long idLigneVente;
	
	@ManyToOne
	@JoinColumn(name="idArticles ")
	private Articles article;
	
	@ManyToMany
	@JoinColumn(name="idArticles")
	private Vente vente;
	
	
	
	

	public long getIdLigneVente() {
		return idLigneVente;
	}

	public void setIdLigneVente(long idLigneVente) {
		this.idLigneVente = idLigneVente;
	}

	public Articles getArticle() {
		return article;
	}

	public void setArticle(Articles article) {
		this.article = article;
	}
	

}
