package com.miVeci.backend.services.interfaces;

import java.util.List;

import com.miVeci.backend.models.entities.PaymentMethod;

public interface IPaymentMethodService {
	
	public void save(PaymentMethod p); //Create-Update
	public PaymentMethod findById(Long id); //Retrieve
	public void delete(Long id);  //Delete
	public List<PaymentMethod> findAll(); //List

}
