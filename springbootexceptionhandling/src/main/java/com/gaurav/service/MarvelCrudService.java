package com.gaurav.service;

import java.util.List;

import com.gaurav.model.Marvel;

public interface MarvelCrudService {

	Marvel addMarvel(Marvel mh);
	Marvel updateMarvel(Marvel mh);
	void deleteMarvel(int id);
	Marvel getMarvelById(int id);
	List<Marvel> getAllMarvels();
	
	
}
