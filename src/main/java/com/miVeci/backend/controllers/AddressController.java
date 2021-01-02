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

import com.miVeci.backend.models.entities.Address;
import com.miVeci.backend.services.interfaces.IAddressService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/address")
public class AddressController {
	
	@Autowired
	private IAddressService service;
	
	@GetMapping("/{id}")
	public Address retrieve(@PathVariable(value = "id") Long id){
		return service.findById(id);
	}
	
	@GetMapping
	public List<Address> list(){
		return service.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Address create(@RequestBody Address address) {
		service.save(address);
		return address;
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Address update(@RequestBody Address address, @PathVariable Long id) {
		service.save(address);
		return address;
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}

}
