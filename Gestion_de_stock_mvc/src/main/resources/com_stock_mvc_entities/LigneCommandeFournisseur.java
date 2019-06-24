package com_stock_mvc_entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class LigneCommandeFournisseur implements Serializable {
	@Id
	@GeneratedValue

	private long idLigneCommandeFournisseur;

	@ManyToOne
	@JoinColumn(name="idLigneCommandeFournisseur")
	private Articles articles;
	
	private CommandeFournisseur commandefournisseur;

	
	
	public long getIdLigneCommandeFournisseur() {
		return idLigneCommandeFournisseur;
	}

	public void setIdLigneCommandeFournisseur(long idLigneCommandeFournisseur) {
		this.idLigneCommandeFournisseur = idLigneCommandeFournisseur;
	}

	public Articles getArticles() {
		return articles;
	}

	public void setArticles(Articles articles) {
		this.articles = articles;
	}

	public CommandeFournisseur getCommandefournisseur() {
		return commandefournisseur;
	}

	public void setCommandefournisseur(CommandeFournisseur commandefournisseur) {
		this.commandefournisseur = commandefournisseur;
	}
	

	


}
