package com.miVeci.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.miVeci.backend.models.entities.Product;
import com.miVeci.backend.services.interfaces.IProductService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/Product")
public class ProductController {
	@Autowired
	private IProductService service;
	
	@GetMapping("/{id}")
	public Product retrieve(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@GetMapping("")
	public List<Product> list() {
		return service.findAll();
	}
		
	@PostMapping("")
	@ResponseStatus(HttpStatus.CREATED)
	public Product create(@RequestBody Product Product) {		
		service.save(Product);
		return Product;
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Product update(@RequestBody Product Product, @PathVariable Long id) {		 			
		service.save(Product);
		return Product;
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}	

}
