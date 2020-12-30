package com.miVeci.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.miVeci.backend.models.entities.Person;

public interface IPerson extends CrudRepository<Person, Long> {

}
