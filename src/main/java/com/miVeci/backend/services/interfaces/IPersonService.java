package com.miVeci.backend.services.interfaces;

import java.util.List;

import com.miVeci.backend.models.entities.Person;


public interface IPersonService {
	
	public void save(Person p); //Create-Update
	public Person findById(Long id); //Retrieve
	public void delete(Long id);  //Delete
	public List<Person> findAll(); //List

}
