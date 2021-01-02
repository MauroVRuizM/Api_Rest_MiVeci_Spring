package com.miVeci.backend.models.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name="Customers")
@Entity
public class Customer extends Person implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_customer")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	private Long idCustomer;
	
	
	public Customer() {
		super();
	}


	public Customer(Long idCustomer) {
		super();
		this.idCustomer = idCustomer;
	}


	public Long getIdCustomer() {
		return idCustomer;
	}


	public void setIdCustomer(Long idCustomer) {
		this.idCustomer = idCustomer;
	}
	
	
	
}
