package com.miVeci.backend.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.miVeci.backend.models.dao.ITrader;
import com.miVeci.backend.models.entities.Trader;
import com.miVeci.backend.services.interfaces.ITraderService;

@Service
public class TraderService implements ITraderService{
	@Autowired
	private ITrader dao;
	
	@Override
	public void save(Trader p) {
		try {
			dao.save(p);
		}
		catch(Exception ex) {
			throw ex;
		}
		
	}

	@Override
	@Transactional(readOnly=true)
	public Trader findById(Long id) {
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
	public List<Trader> findAll() {
		return (List<Trader>) dao.findAll();
	}
}
