package com.miVeci.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.miVeci.backend.models.entities.Listing;

public interface IListing extends CrudRepository<Listing, Long> {

}
