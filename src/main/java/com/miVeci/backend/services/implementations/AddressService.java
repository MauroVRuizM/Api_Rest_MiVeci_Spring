package com.miVeci.backend.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.miVeci.backend.models.dao.IAddress;
import com.miVeci.backend.models.entities.Address;
import com.miVeci.backend.services.interfaces.IAddressService;


@Service
public class AddressService implements IAddressService {
	
	@Autowired  //Inject dependences
	private IAddress dao;

	@Override
	public void save(Address a) {
		dao.save(a);
	}

	@Override
	@Transactional(readOnly = true)
	public Address findById(Long id) {
		return dao.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		Address a = this.findById(id);
		dao.delete(a);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Address> findAll() {
		return (List<Address>) dao.findAll();
	}

}
