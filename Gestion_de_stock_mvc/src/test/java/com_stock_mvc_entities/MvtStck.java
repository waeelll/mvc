package com_stock_mvc_entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class MvtStck  implements Serializable{
	
	
	public static final int ENTREE =1;
	
	public static final int SORTIE =2;

	@Id
	@GeneratedValue

	private long idMvtStck;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateMvt;
	
	private BigDecimal quantie;
	
	private int typeMvt;
	
	@ManyToOne
	@JoinColumn(name="idArticles")
	private Articles article;
	
	
	
	public long getidMvtStck() {
		return idMvtStck;
	}

	public void setidMvtStck(long id) {
		this.idMvtStck = id;
	}

	public long getIdMvtStck() {
		return idMvtStck;
	}

	public void setIdMvtStck(long idMvtStck) {
		this.idMvtStck = idMvtStck;
	}

	public Date getDateMvt() {
		return dateMvt;
	}

	public void setDateMvt(Date dateMvt) {
		this.dateMvt = dateMvt;
	}

	public BigDecimal getQuantie() {
		return quantie;
	}

	public void setQuantie(BigDecimal quantie) {
		this.quantie = quantie;
	}

	public int getTypeMvt() {
		return typeMvt;
	}

	public void setTypeMvt(int typeMvt) {
		this.typeMvt = typeMvt;
	}

	public Articles getArticle() {
		return article;
	}

	public void setArticle(Articles article) {
		this.article = article;
	}

	public static int getEntree() {
		return ENTREE;
	}

	public static int getSortie() {
		return SORTIE;
	}

}
