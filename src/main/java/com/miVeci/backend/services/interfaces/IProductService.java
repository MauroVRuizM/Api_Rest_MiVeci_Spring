package com.miVeci.backend.services.interfaces;

import java.util.List;

import com.miVeci.backend.models.entities.Product;

public interface IProductService {
	public void save(Product p); //create -update
	public Product findById(Long id); //retrieve
	public void delete(Long id); //delete
	public List<Product> findAll(); //list
}
