package com.gaurav.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gaurav.model.Player;
import com.gaurav.service.PlayerCrudService;

@RestController
public class PlayerCrudController {
	@Autowired
	private PlayerCrudService service;
	
	
	@PostMapping("/player")
	public Player addPlayer(@RequestBody Player player) {
		
		return service.addPlayer(player);
	}
	
	@PutMapping("/player")
	public Player updatePlayer(@RequestBody Player player) {
		return service.updatePlayer(player);
		
	}
	
	@DeleteMapping("/player/{id}")
	public void deletePlayer(@PathVariable int id ) {
	service.deletePlayer(id);
	}
	
	
	@GetMapping("/player/{id}")
	public Player getPlayerById(@PathVariable int id) {
		// TODO Auto-generated method stub
		return service.getPlayerById(id);
	}

	
}
