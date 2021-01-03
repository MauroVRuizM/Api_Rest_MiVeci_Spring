package com.miVeci.backend.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.miVeci.backend.models.dao.IProduct;
import com.miVeci.backend.models.entities.Product;
import com.miVeci.backend.services.interfaces.IProductService;

@Service
public class ProductService implements IProductService {

	@Autowired
	private IProduct dao;
	
	@Override
	public void save(Product p) {
		try {
			dao.save(p);
		}
		catch(Exception ex) {
			throw ex;
		}
		
	}

	@Override
	@Transactional(readOnly=true)
	public Product findById(Long id) {
		return dao.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		try {
			dao.deleteById(id);
		}
		catch(Exception ex) {
			throw ex;
		}
		
		
	}

	@Override
	@Transactional(readOnly=true)
	public List<Product> findAll() {
		return (List<Product>) dao.findAll();
	}
	
}
