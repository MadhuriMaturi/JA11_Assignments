package com.hexaware.basicexample.restcontroller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.basicexample.dto.PlayerDTO;
import com.hexaware.basicexample.entity.Player;
import com.hexaware.basicexample.service.IPlayerService;

import jakarta.validation.Valid;
@CrossOrigin("http://localhost:4200")
@RequestMapping("/api/players")
@RestController
public class PlayerRestController {
	@Autowired
	IPlayerService service;
	
	Logger logger=LoggerFactory.getLogger(PlayerRestController.class);
	
	@PostMapping("/addplayer")
	public Player addPlayer(@Valid @RequestBody PlayerDTO playerDTO)
	{
		return service.addPlayer(playerDTO);
	}
	
	@GetMapping("/getall")
	public List<Player> getAllPlayer()
	{
		return service.getAllPlayer();
	}
	@PutMapping("/updateplayer")
	public Player updatePlayer(@Valid @RequestBody PlayerDTO playerDTO)
	{
		return service.updatePlayer(playerDTO);
	}
	@DeleteMapping("/deleteplayer")
	public void deleteplayer(@PathVariable int playerId)
	{
		  service.deletByPlayerId(playerId);
		  logger.info(" player data deleted");
	}
	 @DeleteMapping("deleteby/{countryName}")
	 public void deleteByCountryName(@PathVariable String countryName)
	 {
		 service.deleteplayer(countryName);
	 }
	
	

}
