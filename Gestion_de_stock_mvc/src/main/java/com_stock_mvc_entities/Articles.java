package com_stock_mvc_entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Locale.Category;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.annotation.Generated;

@Entity
@Table
public class Articles implements Serializable {
	
	@Id
	@GeneratedValue
	@Column
	private long id;

	private String codeArticle;

	private String designation;

	private BigDecimal prixUnitaireHT;

	private BigDecimal TauxTVA;

	private BigDecimal prixUnitaireTTC;
	
	private String photo;
	
	public Articles() {
		// TODO Auto-generated constructor stub
	}
	
	@ManyToOne
	@JoinColumn(name="idCategory")
	private Category category;
	

	public String getCodeArticle() {
		return codeArticle;
	}

	public void setCodeArticle(String codeArticle) {
		this.codeArticle = codeArticle;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public BigDecimal getPrixUnitaireHT() {
		return prixUnitaireHT;
	}

	public void setPrixUnitaireHT(BigDecimal prixUnitaireHT) {
		this.prixUnitaireHT = prixUnitaireHT;
	}

	public BigDecimal getTauxTVA() {
		return TauxTVA;
	}

	public void setTauxTVA(BigDecimal tauxTVA) {
		TauxTVA = tauxTVA;
	}

	public BigDecimal getPrixUnitaireTTC() {
		return prixUnitaireTTC;
	}

	public void setPrixUnitaireTTC(BigDecimal prixUnitaireTTC) {
		this.prixUnitaireTTC = prixUnitaireTTC;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	

}
