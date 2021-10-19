package com.gaurav.service;

import com.gaurav.model.Player;

public interface PlayerCrudService {
	Player addPlayer(Player player);
	Player updatePlayer(Player player);
	Player getPlayerById(int id);
	void deletePlayer(int id);
}
