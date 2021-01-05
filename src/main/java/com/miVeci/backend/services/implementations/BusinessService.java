package com.miVeci.backend.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.miVeci.backend.models.dao.IBusiness;
import com.miVeci.backend.models.entities.Business;
import com.miVeci.backend.services.interfaces.IBusinessService;

@Service
public class BusinessService implements IBusinessService {

	@Autowired
	private IBusiness dao;
	
	@Override
	public void save(Business b) {
		try {
			dao.save(b);
		}
		catch(Exception ex) {
			throw ex;
		}
		
	}

	@Override
	@Transactional(readOnly=true)
	public Business findById(Long id) {
		return dao.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		try {
			dao.deleteById(id);
		}
		catch(Exception ex) {
			throw ex;
		}
		
	}

	@Override
	@Transactional(readOnly=true)
	public List<Business> findAll() {
		return (List<Business>) dao.findAll();
	}

}
