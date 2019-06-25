package com_stock_mvc_entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Client implements Serializable {
	
	@Id
	@GeneratedValue

	private long idClient;
	
	

	private String nom;
	
	private String prenom;
	
	private String adress;
	
	private String photo;
	
	
	private String mail;
	
	
	@OneToMany(mappedBy = "client")
	private List <CommandeClient> CommandeClients;
	
	
	  
	public Client() {
		super();
		// TODO Auto-generated constructor stub
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

	
	
	
	
	public List<CommandeClient> getCommandeClients() {
		return CommandeClients;
	}

	public void setCommandeClients(List<CommandeClient> commandeClients) {
		CommandeClients = commandeClients;
	}

	public long getIdClient() {
		return idClient;
	}

	public void setIdClient(long id) {
		this.idClient = id;
	}


}
