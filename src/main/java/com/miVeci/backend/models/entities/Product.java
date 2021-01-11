package com.miVeci.backend.models.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Table(name="Products")
@Entity
public class Product implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id_product")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Long idProduct;
	
	@Column(name="name")
	private String name;
	
	@Column(name="price")
	private double price;
	
	@Column(name="category")
	private String category;
	
	@Column(name="description")
	private String description;
	
	@Column(name="stock")
	private int stock;
	
	@Column(name="availability")
	private boolean availability;
	
	@Column(name="image")
	private String image;
	
	@JoinColumn(name="fk_business",referencedColumnName="id_business")
	@ManyToOne
	@JsonIgnore
	private Business business;
	
	@JoinColumn(name="fk_product",referencedColumnName="id_listing")
	@ManyToOne
	@JsonIgnore
	private Listing listing;

	public Product() {
		super();
	}

	public Product(Long idProduct) {
		super();
		this.idProduct = idProduct;
	}

	public Long getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
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

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Business getBusiness() {
		return business;
	}

	public void setBusiness(Business business) {
		this.business = business;
	}
	
	

}
