package com.miVeci.backend.models.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;


@Table(name="Listings")
@Entity
public class Listing implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id_listing")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional=false)
	private Long idListing;
	
	@Column(name="total_due")
	private Long totalDue;

	
	/* FK*/
	
	//@OneToMany(mappedBy = "listing", fetch = FetchType.LAZY)
	//private List<Detail> detail;
	
	public Listing() {
		super();
	}


	public Listing(Long idListing) {
		super();
		this.idListing = idListing;
	}


	public Long getIdListing() {
		return idListing;
	}


	public void setIdListing(Long idListing) {
		this.idListing = idListing;
	}


	public Long getTotalDue() {
		return totalDue;
	}


	public void setTotalDue(Long totalDue) {
		this.totalDue = totalDue;
	}

	
	

}
