package com.miVeci.backend.models.entities;

import java.io.File;
import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	
	@JoinColumn(name = "fk_client", referencedColumnName = "id_person")
	@ManyToOne
	private Person client;
	
	@JoinColumn(name = "fk_listing", referencedColumnName = "id_listing")
	@ManyToOne
	private Listing listing;

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

	public Person getClient() {
		return client;
	}

	public void setClient(Person client) {
		this.client = client;
	}

	public Listing getListing() {
		return listing;
	}

	public void setListing(Listing listing) {
		this.listing = listing;
	}
	
	
	

}
