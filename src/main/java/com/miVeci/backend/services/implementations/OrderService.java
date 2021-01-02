package com.miVeci.backend.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.miVeci.backend.models.dao.IOrder;
import com.miVeci.backend.models.entities.Order;
import com.miVeci.backend.services.interfaces.IOrderService;

@Service
public class OrderService implements IOrderService {
	
	@Autowired  //Inject dependences
	private IOrder dao;

	@Override
	public void save(Order o) {
		dao.save(o);
	}

	@Override
	@Transactional(readOnly = true)
	public Order findById(Long id) {
		return dao.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		Order o = this.findById(id);
		dao.delete(o);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Order> findAll() {
		return (List<Order>) dao.findAll();
	}

}
