package com_stock_mvc_entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class Vente  implements Serializable{
	@Id
	@GeneratedValue

	private long idVente;
	
	private String code;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateVente;
	
	@OneToMany(mappedBy="vente")
	private List<LigneVente> ligneventes;

	public long getIdVente() {
		return idVente;
	}

	public void setIdVente(long idVente) {
		this.idVente = idVente;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getDateVente() {
		return dateVente;
	}

	public void setDateVente(Date dateVente) {
		this.dateVente = dateVente;
	}

	public List<LigneVente> getLigneventes() {
		return ligneventes;
	}

	public void setLigneventes(List<LigneVente> ligneventes) {
		this.ligneventes = ligneventes;
	}
	


}
