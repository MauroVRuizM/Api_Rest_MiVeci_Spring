package com.miVeci.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.miVeci.backend.models.entities.Order;

public interface IOrder extends CrudRepository<Order, Long> {

}
