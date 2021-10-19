package com.gaurav.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gaurav.model.Person;
import com.gaurav.service.UserService;

@RestController
public class PersonController  {
	
	@Autowired
	private UserService service;

	@PostMapping("/person")
	public Person addUser(@RequestBody Person p) {
		// TODO Auto-generated method stub
		return service.addUser(p);
	}
	@GetMapping("/person/name/{name}/{city}")
	public List<Person> getPersonByNameAndCity(@PathVariable String name, @PathVariable String city) {
		// TODO Auto-generated method stub
		System.out.println(service.getPersonByNameAndCity(name, city));
		return service.getPersonByNameAndCity(name, city);
	}

	@GetMapping("/person/name/{name}/salarly/{salarly}")
	public List<Person> getPersonrByNameAndSalarly(@PathVariable String name, @PathVariable String salarly) {
		// TODO Auto-generated method stub
		return service.getPersonrByNameAndSalarly(name, salarly);
	}


	public List<Person> getPersonByGenderAndContact(String contact, String gender) {
		// TODO Auto-generated method stub
		return null;
	}

	@GetMapping("/person")
	public List<Person> getAllPersons() {
		// TODO Auto-generated method stub
		return service.getAllPersons();
	}

}
