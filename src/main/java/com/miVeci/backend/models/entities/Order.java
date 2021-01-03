package com.miVeci.backend.models.entities;

import java.io.File;
import java.io.Serializable;
import java.util.Calendar;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;


@Table(name="Orders")
@Entity
public class Order implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id_order")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional=false)
	private Long idOrder;
	
	@Column(name = "date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Calendar date;
	
	@Column(name="file")
	private File file;
	
	
	/*FK*/
	
	@JoinColumn(name = "fk_customer", referencedColumnName = "id_customer")
	@ManyToOne
	private Customer customer;
	
	 @OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
	 private Listing listing;
	
	@OneToOne(mappedBy="order",cascade = CascadeType.ALL)
	private PaymentMethod paymentmethod;

	//Añadir_Negocio

	public Order() {
		super();
	}

	public Order(Long idOrder) {
		super();
		this.idOrder = idOrder;
	}

	public Long getIdOrder() {
		return idOrder;
	}

	public void setIdOrder(Long idOrder) {
		this.idOrder = idOrder;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public PaymentMethod getPaymentmethod() {
		return paymentmethod;
	}

	public void setPaymentmethod(PaymentMethod paymentmethod) {
		this.paymentmethod = paymentmethod;
	}

	public Listing getListing() {
		return listing;
	}

	public void setListing(Listing listing) {
		this.listing = listing;
	}
	
	
	

}
