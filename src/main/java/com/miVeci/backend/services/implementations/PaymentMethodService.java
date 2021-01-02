package com.miVeci.backend.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.miVeci.backend.models.dao.IPaymentMethod;
import com.miVeci.backend.models.entities.PaymentMethod;
import com.miVeci.backend.services.interfaces.IPaymentMethodService;

@Service
public class PaymentMethodService implements IPaymentMethodService {
	
	@Autowired  //Inject dependences
	private IPaymentMethod dao;

	@Override
	public void save(PaymentMethod p) {
		dao.save(p);
	}

	@Override
	@Transactional(readOnly = true)
	public PaymentMethod findById(Long id) {
		return dao.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		PaymentMethod p = this.findById(id);
		dao.delete(p);
	}

	@Override
	@Transactional(readOnly = true)
	public List<PaymentMethod> findAll() {
		return (List<PaymentMethod>) dao.findAll();
	}

}
