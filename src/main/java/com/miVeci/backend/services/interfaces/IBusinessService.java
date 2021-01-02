package com.miVeci.backend.services.interfaces;

import java.util.List;

import com.miVeci.backend.models.entities.Business;

public interface IBusinessService {
	public void save(Business b); //create -update
	public Business findById(Long id); //retrieve
	public void delete(Long id); //delete
	public List<Business> findAll(); //list
}
