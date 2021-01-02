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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
	
	@Column(name="total_pay")
	private Long totalPay;

	@OneToOne
	@JoinColumn(name="order")
	private Order order;
	@OneToMany(mappedBy = "listing", fetch = FetchType.LAZY)
	private List<Product> products;
	
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


	public Long getTotalPay() {
		return totalPay;
	}


	public void setTotalPay(Long totalPay) {
		this.totalPay = totalPay;
	}


	public List<Product> getProducts() {
		return products;
	}


	public void setProducts(List<Product> products) {
		this.products = products;
	}
	

	
	

}
