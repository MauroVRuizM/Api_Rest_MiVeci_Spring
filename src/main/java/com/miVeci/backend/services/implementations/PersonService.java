package com.miVeci.backend.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.miVeci.backend.models.dao.IPerson;

import com.miVeci.backend.models.entities.Person;
import com.miVeci.backend.services.interfaces.IPersonService;


@Service
public class PersonService implements IPersonService {
	
	@Autowired  //Inject dependences
	private IPerson dao;

	@Override
	public void save(Person p) {
		dao.save(p);
		
	}

	@Override
	@Transactional(readOnly = true)
	public Person findById(Long id) {
		return dao.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		Person p = this.findById(id);
		dao.delete(p);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Person> findAll() {
		return (List<Person>) dao.findAll();
	}

}
