package com_stock_mvc_entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class CommandeFournisseur implements Serializable {

	
	@Id
	@GeneratedValue
	private long idCommandeFournisseur;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCommande;
	
	@OneToMany
	@JoinColumn(name="idFournisseur")
	private Fournisseur fournisseur;
	
	@OneToMany(mappedBy="CommandeFournisseur")
	private List <LigneCommandeFournisseur> LigneCommandeFournisseurs;
	

	public long getIdCommandeFournisseur() {
		return idCommandeFournisseur;
	}

	public void setIdCommandeFournisseur(long idCommandeFournisseur) {
		this.idCommandeFournisseur = idCommandeFournisseur;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	public Fournisseur getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(Fournisseur fournisseur) {
		this.fournisseur = fournisseur;
	}

	public List<LigneCommandeFournisseur> getLigneCommandeFournisseurs() {
		return LigneCommandeFournisseurs;
	}

	public void setLigneCommandeFournisseurs(List<LigneCommandeFournisseur> ligneCommandeFournisseurs) {
		LigneCommandeFournisseurs = ligneCommandeFournisseurs;
	}
	
}
