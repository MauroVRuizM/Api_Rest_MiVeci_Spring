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

import com.miVeci.backend.models.entities.PaymentMethod;
import com.miVeci.backend.services.interfaces.IPaymentMethodService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/paymentMethod")
public class PaymentMethodController {
	
	@Autowired
	private IPaymentMethodService service;
	
	@GetMapping("/{id}")
	public PaymentMethod retrieve(@PathVariable(value = "id") Long id){
		return service.findById(id);
	}
	
	@GetMapping
	public List<PaymentMethod> list(){
		return service.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public PaymentMethod create(@RequestBody PaymentMethod paymentMethod) {
		service.save(paymentMethod);
		return paymentMethod;
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public PaymentMethod update(@RequestBody PaymentMethod paymentMethod, @PathVariable Long id) {
		service.save(paymentMethod);
		return paymentMethod;
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}

}
