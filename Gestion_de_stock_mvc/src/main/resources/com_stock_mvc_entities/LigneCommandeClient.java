package com_stock_mvc_entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class LigneCommandeClient  implements Serializable{
	
	@Id
	@GeneratedValue

	private long idLigneCOmmandeClient;
	
	@ManyToOne
	@JoinColumn(name="idCommandeClient")
	private Articles articles;
	
	private CommandeClient commandeClient;

	
	public long getIdLigneCOmmandeClient() {
		return idLigneCOmmandeClient;
	}

	public void setIdLigneCOmmandeClient(long idLigneCOmmandeClient) {
		this.idLigneCOmmandeClient = idLigneCOmmandeClient;
	}

	public Articles getArticles() {
		return articles;
	}

	public void setArticles(Articles articles) {
		this.articles = articles;
	}

	public CommandeClient getCommandeClient() {
		return commandeClient;
	}

	public void setCommandeClient(CommandeClient commandeClient) {
		this.commandeClient = commandeClient;
	}

	

}
