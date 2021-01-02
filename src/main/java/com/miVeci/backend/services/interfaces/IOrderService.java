package com.miVeci.backend.services.interfaces;

import java.util.List;

import com.miVeci.backend.models.entities.Order;

public interface IOrderService {
	
	public void save(Order o); //Create-Update
	public Order findById(Long id); //Retrieve
	public void delete(Long id);  //Delete
	public List<Order> findAll(); //List

}
