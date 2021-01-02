package com.miVeci.backend.services.interfaces;

import java.util.List;

import com.miVeci.backend.models.entities.Listing;

public interface IListingService {
	
	public void save(Listing l); //Create-Update
	public Listing findById(Long id); //Retrieve
	public void delete(Long id);  //Delete
	public List<Listing> findAll(); //List

}
