package com.miVeci.backend.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.miVeci.backend.models.dao.ICustomer;

import com.miVeci.backend.models.entities.Customer;
import com.miVeci.backend.services.interfaces.ICustomerService;


@Service
public class CustomerService implements ICustomerService {
	
	@Autowired  //Inject dependences
	private ICustomer dao;

	@Override
	public void save(Customer p) {
		dao.save(p);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Customer findById(Long id) {
		return dao.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		Customer p = this.findById(id);
		dao.delete(p);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Customer> findAll() {
		return (List<Customer>) dao.findAll();
	}

}
