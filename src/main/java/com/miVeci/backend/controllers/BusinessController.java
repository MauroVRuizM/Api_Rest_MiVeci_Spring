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

import com.miVeci.backend.models.entities.Business;
import com.miVeci.backend.services.interfaces.IBusinessService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/Business")
public class BusinessController {
	@Autowired
	private IBusinessService service;
	
	@GetMapping("/{id}")
	public Business retrieve(@PathVariable(value = "id") Long id) {
		return service.findById(id);
	}
	
	@GetMapping("")
	public List<Business> list() {
		return service.findAll();
	}
		
	@PostMapping("")
	@ResponseStatus(HttpStatus.CREATED)
	public Business create(@RequestBody Business Business) {		
		service.save(Business);
		return Business;
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Business update(@RequestBody Business Business, @PathVariable Long id) {		 			
		service.save(Business);
		return Business;
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}	

}
