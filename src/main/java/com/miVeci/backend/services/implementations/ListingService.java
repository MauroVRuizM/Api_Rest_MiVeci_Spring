package com.miVeci.backend.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.miVeci.backend.models.dao.IListing;
import com.miVeci.backend.models.entities.Listing;
import com.miVeci.backend.services.interfaces.IListingService;

@Service
public class ListingService implements IListingService {
	
	@Autowired  //Inject dependences
	private IListing dao;

	@Override
	public void save(Listing l) {
		dao.save(l);
	}

	@Override
	@Transactional(readOnly = true)
	public Listing findById(Long id) {
		return dao.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		Listing l = this.findById(id);
		dao.delete(l);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Listing> findAll() {
		return (List<Listing>) dao.findAll();
	}

}
