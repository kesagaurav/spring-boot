package com.gaurav.service;

import java.util.List;

import com.gaurav.model.Player;

public interface PlayerSearchService {


	List<Player> getAllPlayers();
	List<Player> getPlayersByName(String name);
	List<Player> getPlayersByAge(int age);
	List<Player> getPlayersByTeamName(String teamName);
	List<Player> getPlayersByCity(String city);
	
	
	
}
