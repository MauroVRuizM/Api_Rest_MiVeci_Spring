package com.miVeci.backend.models.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Table(name="Addresses")
@Entity
public class Address implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id_address")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional=false)
	private Long idAddress;
	
	@Column(name="name")
	private String name;
	
	@Column(name="lat")
	private Long lat;
	
	@Column(name="lng")
	private Long lng;
	
	@Column(name="reference")
	private String reference;
	
	@JoinColumn(name = "fk_customer", referencedColumnName = "id_customer")
	@ManyToOne
	@JsonIgnore
	private Customer customer;
	
	@OneToOne(mappedBy="address",cascade = CascadeType.ALL)
	@JsonIgnore
	private Business business;
	
	public Address() {
		super();
	}

	public Address(Long idAddress) {
		super();
		this.idAddress = idAddress;
	}

	public Long getIdAddress() {
		return idAddress;
	}

	public void setIdAddress(Long idAddress) {
		this.idAddress = idAddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getLat() {
		return lat;
	}

	public void setLat(Long lat) {
		this.lat = lat;
	}

	public Long getLng() {
		return lng;
	}

	public void setLng(Long lng) {
		this.lng = lng;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}
	

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Business getBusiness() {
		return business;
	}

	public void setBusiness(Business business) {
		this.business = business;
	}
	
	
	
	

}
