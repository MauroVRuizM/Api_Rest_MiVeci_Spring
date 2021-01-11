package com.miVeci.backend.models.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Table(name="Businesses")
@Entity
public class Business implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id_business")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Long idBussiness;
	
	@Column(name="name")
	private String name;
	
	@Column(name="category")
	private String category;
	
	@Column(name="description")
	private String description;
	
	@Column(name="open")
	private String open;
	
	@Column(name="close")
	private String close;
	
	@Column(name="status")
	private boolean status;
	
	@Column(name="image")
	private String image;
	
	@Column(name="delivery")
	private boolean delivery;
	
	@Column(name="booking")
	private boolean booking;
	
	@JoinColumn(name="fk_trader",referencedColumnName="id_trader")
	@ManyToOne
	private Trader trader;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_address")
	 private Address address;
	
	@OneToMany(mappedBy="business",fetch=FetchType.LAZY)
	private List<Product> products;

	public Business() {
		super();
	}

	public Business(Long idBussiness) {
		super();
		this.idBussiness = idBussiness;
	}

	public Long getIdBussiness() {
		return idBussiness;
	}

	public void setIdBussiness(Long idBussiness) {
		this.idBussiness = idBussiness;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOpen() {
		return open;
	}

	public void setOpen(String open) {
		this.open = open;
	}

	public String getClose() {
		return close;
	}

	public void setClose(String close) {
		this.close = close;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public boolean isDelivery() {
		return delivery;
	}

	public void setDelivery(boolean delivery) {
		this.delivery = delivery;
	}

	public boolean isBooking() {
		return booking;
	}

	public void setBooking(boolean booking) {
		this.booking = booking;
	}

	public Trader getTrader() {
		return trader;
	}

	public void setTrader(Trader trader) {
		this.trader = trader;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	
}
