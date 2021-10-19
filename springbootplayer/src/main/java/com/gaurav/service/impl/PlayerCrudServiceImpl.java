package com.gaurav.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gaurav.model.Player;
import com.gaurav.repository.PlayerRepository;
import com.gaurav.service.PlayerCrudService;
@Service
public class PlayerCrudServiceImpl implements PlayerCrudService {

	@Autowired
	private PlayerRepository repository;
	
	
	@Override
	public Player addPlayer(Player player) {
		// TODO Auto-generated method stub
		return repository.save(player);
	}

	@Override
	public Player updatePlayer(Player player) {
		// TODO Auto-generated method stub
		return repository.save(player);
	}

	@Override
	public Player getPlayerById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	@Override
	public void deletePlayer(int id) {

		repository.deleteById(id);
		
	}

}
