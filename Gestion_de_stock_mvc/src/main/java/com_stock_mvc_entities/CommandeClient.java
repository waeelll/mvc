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

public class CommandeClient implements Serializable {
	@Id
	@GeneratedValue

	private long idCommandeClient;

	
	private String code;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCommande;
	
	@OneToMany
	@JoinColumn(name="idClient")
	private Client client;
	
	@OneToMany(mappedBy="CommandeClient")
	private List <LigneCommandeClient> LigneCommandeClients;
	
	
	
	
	
	public long getIdCommandeClient() {
		return idCommandeClient;
	}

	public void setIdCommandeClient(long idCommandeClient) {
		this.idCommandeClient = idCommandeClient;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<LigneCommandeClient> getLigneCommandeClients() {
		return LigneCommandeClients;
	}

	public void setLigneCommandeClients(List<LigneCommandeClient> ligneCommandeClients) {
		LigneCommandeClients = ligneCommandeClients;
	}


}
