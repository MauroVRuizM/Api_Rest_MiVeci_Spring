package com.miVeci.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.miVeci.backend.models.entities.Customer;

public interface ICustomer extends CrudRepository<Customer, Long> {

}
