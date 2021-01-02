package com.miVeci.backend.services.interfaces;

import java.util.List;

import com.miVeci.backend.models.entities.Customer;


public interface ICustomerService {
	
	public void save(Customer c); //Create-Update
	public Customer findById(Long id); //Retrieve
	public void delete(Long id);  //Delete
	public List<Customer> findAll(); //List

}
