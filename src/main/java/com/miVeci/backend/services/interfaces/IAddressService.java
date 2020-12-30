package com.miVeci.backend.services.interfaces;

import java.util.List;

import com.miVeci.backend.models.entities.Address;


public interface IAddressService {
	
	public void save(Address a); //Create-Update
	public Address findById(Long id); //Retrieve
	public void delete(Long id);  //Delete
	public List<Address> findAll(); //List

}
