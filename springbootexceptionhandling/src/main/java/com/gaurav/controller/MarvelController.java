package com.gaurav.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gaurav.exception.ResourceNotFoundException;
import com.gaurav.model.Marvel;
import com.gaurav.repository.MarvelRepository;

@RestController
public class MarvelController  {
	@Autowired
	private MarvelRepository repository;
	
	@PostMapping("/marvel")
	public Marvel addMarvel(@RequestBody Marvel mh) {
		// TODO Auto-generated method stub
		return this.repository.save(mh);
	}
	@PutMapping("/marvel/{id}")
	public Marvel updateMarvel(@RequestBody Marvel mh,@PathVariable int id) {
		// TODO Auto-generated method stub
		Marvel existingMarvel=this.repository.findById(id)
				.orElseThrow(()->	new ResourceNotFoundException("marvel not found with id " + id));
			existingMarvel.setName(mh.getName());
			existingMarvel.setColor(mh.getColor());
			existingMarvel.setWeapons(mh.getWeapons());
		
		return repository.save(existingMarvel);
	}

	@DeleteMapping("/marvel/{id}")
	public void deleteMarvel(@PathVariable int id) {
		// TODO Auto-generated method stub
		Marvel existingMarvel=this.repository.findById(id)
				.orElseThrow(()->	new ResourceNotFoundException("marvel not found with id " + id));
		repository.delete(existingMarvel);
		
	}

	@GetMapping("/marvel/{id}")
	public Marvel getMarvelById(@PathVariable int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElseThrow(()->
			new ResourceNotFoundException("marvel not found with id " + id));
		
	}

	@GetMapping("/marvels")
	public List<Marvel> getAllMarvels() {
		// TODO Auto-generated method stub
		return repository.findAll();
		
	}

}
