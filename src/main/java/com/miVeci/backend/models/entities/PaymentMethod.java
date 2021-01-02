package com.miVeci.backend.models.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Table(name="PaymentMethods")
@Entity
public class PaymentMethod implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id_paymentMethod")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Basic(optional=false)
	private Long idPaymentMethod;
	
	@Column(name="type")
	private String type;
	
	@Column(name="quantity")
	private Long quantity;
	
	@OneToOne(mappedBy="order")
	private Order order;
	
	public PaymentMethod() {
		super();
	}

	public PaymentMethod(Long idPaymentMethod) {
		super();
		this.idPaymentMethod = idPaymentMethod;
	}

	public Long getIdPaymentMethod() {
		return idPaymentMethod;
	}

	public void setIdPaymentMethod(Long idPaymentMethod) {
		this.idPaymentMethod = idPaymentMethod;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	
	
	

}
