package com.rest.calls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {
	
	
	
	@Autowired
	PlayerService playerService;
	
	@PostMapping("/saveplayer")
	public Player savePlayer(@RequestBody Player player) {
		return playerService.savePlayerData(player);
	}
	
	@PostMapping("/saveplayers")
	public List<Player> savePlayers(@RequestBody List<Player> players) {
		return playerService.saveDatae(players);
	}
	
	@GetMapping("/get/{country}")
	public List<Player> getPlayer(@PathVariable String country) {
		return playerService.getPlayerByCountry(country);
	}
	
	@GetMapping("/getall")
	public List<Player> getAllPlayers() {
		return playerService.getAllPlayers();
	}
	
	@DeleteMapping("/delete/{id}")
	public void deletePlayer(@PathVariable Integer id) {
		 playerService.deletePlayerById(id);
	}
	
	@PutMapping("/update/{id}")
	public Player updatePlayer(@PathVariable Integer id, @RequestBody Player newPlayer) {
		return playerService.updatePlayerById(id, newPlayer);
	}
	
	
}
