package com.gaurav.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaurav.model.Marvel;
import com.gaurav.repository.MarvelRepository;
import com.gaurav.service.MarvelCrudService;
@Service
public class MarvelCrudServiceImpl implements MarvelCrudService {
	@Autowired
	private MarvelRepository repository;
	
	@Override
	public Marvel addMarvel(Marvel mh) {
		// TODO Auto-generated method stub
		return repository.save(mh);
	}

	@Override
	public Marvel updateMarvel(Marvel mh) {
		// TODO Auto-generated method stub
		return repository.save(mh);
	}

	@Override
	public void deleteMarvel(int id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Marvel getMarvelById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	@Override
	public List<Marvel> getAllMarvels() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
