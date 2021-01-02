package com.miVeci.backend.models.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Table(name="Traders")
@Entity
public class Trader extends Person implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="id_trader")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Long idTrader;
	
	@Column(name="legal")
	private String legal;

	@OneToMany(mappedBy="trader",fetch=FetchType.LAZY)
	private List<Business> businesses;

	public Trader() {
		super();
	}

	public Trader(Long idTrader) {
		super();
		this.idTrader = idTrader;
	}

	public Long getIdTrader() {
		return idTrader;
	}

	public void setIdTrader(Long idTrader) {
		this.idTrader = idTrader;
	}

	public String getLegal() {
		return legal;
	}

	public void setLegal(String legal) {
		this.legal = legal;
	}

	public List<Business> getBusinesses() {
		return businesses;
	}

	public void setBusinesses(List<Business> businesses) {
		this.businesses = businesses;
	}
	
	
}
