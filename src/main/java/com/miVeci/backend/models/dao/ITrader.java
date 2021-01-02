package com.miVeci.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.miVeci.backend.models.entities.Trader;

public interface ITrader extends CrudRepository<Trader, Long>{

}
