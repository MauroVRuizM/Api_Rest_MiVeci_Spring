package com.miVeci.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.miVeci.backend.models.entities.Business;

public interface IBusiness extends CrudRepository<Business, Long>{

}
