package com.miVeci.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.miVeci.backend.models.entities.Address;

public interface IAddress extends CrudRepository<Address, Long> {

}
