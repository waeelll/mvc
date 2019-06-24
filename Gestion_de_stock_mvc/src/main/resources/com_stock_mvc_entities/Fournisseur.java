package com_stock_mvc_entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Fournisseur implements Serializable {
	
	@Id
	@GeneratedValue
	
	private long idFournisseur;
	
	
	
	

	private String nom;
	
	private String prenom;
	
	private String adress;
	
	private String photo;
	
	private String mail;
	
	
	@OneToMany(mappedBy="Fournisseur")
	private List<CommandeFournisseur> commandeFournisseurs;
	
	
	
	
	
	
	public Fournisseur() {
	super();
	}
	
	public long getIdFournisseur() {
		return idFournisseur;
	} 

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public List<CommandeFournisseur> getCommandeFournisseurs() {
		return commandeFournisseurs;
	}

	public void setCommandeFournisseurs(List<CommandeFournisseur> commandeFournisseurs) {
		this.commandeFournisseurs = commandeFournisseurs;
	}

	public void setIdFournisseur(long idFournisseur) {
		this.idFournisseur = idFournisseur;
	}

}
