package com.gaurav.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gaurav.model.Player;
import com.gaurav.service.PlayerSearchService;
@RestController
public class PlayerSearchController  {
	@Autowired
	private PlayerSearchService service;
	@GetMapping("/players")
	public List<Player> getAllPlayers() {
		// TODO Auto-generated method stub
		return service.getAllPlayers();
	}

	@GetMapping("/players/name/{name}")
	public List<Player> getPlayersByName(String name) {
		// TODO Auto-generated method stub
		return service.getPlayersByName(name);
	}

	@GetMapping("/players/age/{age}")
	public List<Player> getPlayersByAge(int age) {
		// TODO Auto-generated method stub
		return service.getPlayersByAge(age);
	}

	@GetMapping("/players/teamName/{teamName}")
	public List<Player> getPlayersByTeamName(String teamName) {
		// TODO Auto-generated method stub
		return service.getPlayersByTeamName(teamName);
	}

	@GetMapping("/players/city/{city}")
	public List<Player> getPlayersByCity(String city) {
		// TODO Auto-generated method stub
		return service.getPlayersByCity(city);
	}

}
