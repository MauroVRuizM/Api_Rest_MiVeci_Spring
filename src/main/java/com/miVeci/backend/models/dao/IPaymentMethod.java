package com.miVeci.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.miVeci.backend.models.entities.PaymentMethod;

public interface IPaymentMethod extends CrudRepository<PaymentMethod, Long> {

}
