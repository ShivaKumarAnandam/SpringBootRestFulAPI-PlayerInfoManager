package com.rest.calls;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {
	
	
	@Autowired
	PlayerRepository playerRepository;

	public Player savePlayerData(Player player) {
		return playerRepository.save(player);
	}

	public List<Player> saveDatae(List<Player> players) {
		return playerRepository.saveAll(players);
	}

	public List<Player> getPlayerByCountry(String country) {
		return playerRepository.getPlayerByCountry(country);
	}

	public List<Player> getAllPlayers() {
		return playerRepository.findAll();
	}

	public void deletePlayerById(Integer id) {
		playerRepository.deleteById(id);
	}

	public Player updatePlayerById(Integer id, Player newPlayer) {
		Player up = playerRepository.getById(id);
		up.setId(newPlayer.getId());
		up.setName(newPlayer.getName());
		up.setNumberOfMatches(newPlayer.getNumberOfMatches());
		up.setCountry(newPlayer.getCountry());
		up.setTotalRuns(newPlayer.getTotalRuns());
		return up;
	}
	

}
