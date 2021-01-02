package com.miVeci.backend.services.interfaces;

import java.util.List;

import com.miVeci.backend.models.entities.Trader;

public interface ITraderService {
	public void save(Trader t); //create -update
	public Trader findById(Long id); //retrieve
	public void delete(Long id); //delete
	public List<Trader> findAll(); //list
}
