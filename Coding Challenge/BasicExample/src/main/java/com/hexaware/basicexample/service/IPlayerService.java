package com.hexaware.basicexample.service;

import java.util.List;

import com.hexaware.basicexample.dto.PlayerDTO;
import com.hexaware.basicexample.entity.Player;

public interface IPlayerService {
	
	public Player addPlayer(PlayerDTO playerDTO);
	public Player updatePlayer(PlayerDTO playerDTO);
	public void  deletByPlayerId(int playerId); 
	public List<Player> getAllPlayer();
	//public void deleteByCountryName(String countryName);
	public void deleteplayer(String countryName);

}
