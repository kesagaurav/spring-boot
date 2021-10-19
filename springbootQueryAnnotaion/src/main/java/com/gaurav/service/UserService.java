package com.gaurav.service;

import java.util.List;

import com.gaurav.model.Person;

public interface UserService {

	Person addUser(Person p);
	List<Person> getPersonByNameAndCity(String name,String city);
	List<Person> getPersonrByNameAndSalarly(String name,String salarly);
	List<Person> getPersonByGenderAndContact(String contact,String gender);
	List<Person> getAllPersons();
	
	
	
}
