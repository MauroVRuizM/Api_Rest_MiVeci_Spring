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

import com.miVeci.backend.models.entities.Customer;
import com.miVeci.backend.services.interfaces.ICustomerService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/Customer")
public class CustomerController {
	
	@Autowired
	private ICustomerService service;
	
	@GetMapping("/{id}")
	public Customer retrieve(@PathVariable(value = "id") Long id){
		return service.findById(id);
	}
	
	@GetMapping
	public List<Customer> list(){
		return service.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Customer create(@RequestBody Customer Customer) {
		service.save(Customer);
		return Customer;
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Customer update(@RequestBody Customer Customer, @PathVariable Long id) {
		service.save(Customer);
		return Customer;
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}

}
