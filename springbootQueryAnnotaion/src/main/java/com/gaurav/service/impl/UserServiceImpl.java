package com.gaurav.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.gaurav.model.Person;
import com.gaurav.repository.PersonRepository;
import com.gaurav.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private PersonRepository repository;
	
	@Override
	public Person addUser(Person p) {
		// TODO Auto-generated method stub
		return repository.save(p);
	}

	@Override
	public List<Person> getPersonByNameAndCity(String name, String city) {
		// TODO Auto-generated method stub
		return repository.findByNameAndCity(name, city);
	}

	@Override
	public List<Person> getPersonrByNameAndSalarly(String name, String salarly) {
		// TODO Auto-generated method stub
		return repository.findByNameAndSalarly(name, salarly);
	}

	@Override
	public List<Person> getPersonByGenderAndContact(String contact, String gender) {
		// TODO Auto-generated method stub
		return repository.findByGenderAndContact(contact, gender);
	}

	@Override
	public List<Person> getAllPersons() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
