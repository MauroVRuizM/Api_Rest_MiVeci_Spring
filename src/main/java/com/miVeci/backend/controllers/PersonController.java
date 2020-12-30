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

import com.miVeci.backend.models.entities.Person;
import com.miVeci.backend.services.interfaces.IPersonService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/person")
public class PersonController {
	
	@Autowired
	private IPersonService service;
	
	@GetMapping("/{id}")
	public Person retrieve(@PathVariable(value = "id") Long id){
		return service.findById(id);
	}
	
	@GetMapping
	public List<Person> list(){
		return service.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Person create(@RequestBody Person person) {
		service.save(person);
		return person;
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Person update(@RequestBody Person person, @PathVariable Long id) {
		service.save(person);
		return person;
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}

}
