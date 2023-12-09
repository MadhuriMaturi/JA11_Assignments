package com.hexaware.basicexample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.basicexample.dto.PlayerDTO;
import com.hexaware.basicexample.entity.Player;
import com.hexaware.basicexample.repository.PlayerRepository;

import jakarta.transaction.Transactional;
@Service
public class PlayerServiceImp implements IPlayerService {
	@Autowired
	PlayerRepository repository;
	
	@Override
	public Player addPlayer(PlayerDTO playerDTO) {
		Player player=new Player();
		player.setPlayerId(playerDTO.getPlayerId());
		player.setPlayerName(playerDTO.getPlayerName());
		player.setJerseyNumber(playerDTO.getJerseyNumber());
		player.setRole(playerDTO.getRole());
		player.setTeamName(playerDTO.getTeamName());
		player.setTotalmatches(playerDTO.getTotalmatches());
		player.setDescription(playerDTO.getDescription());
		player.setCountryName(playerDTO.getCountryName());
		return repository.save(player);
	}

	@Override
	public List<Player> getAllPlayer() {

		return repository.findAll();
	}
	@Override
	public Player updatePlayer(PlayerDTO playerDTO) {
		Player player=new Player();
		player.setPlayerId(playerDTO.getPlayerId());
		player.setPlayerName(playerDTO.getPlayerName());
		player.setJerseyNumber(playerDTO.getJerseyNumber());
		player.setRole(playerDTO.getRole());
		player.setTeamName(playerDTO.getTeamName());
		player.setTotalmatches(playerDTO.getTotalmatches());
		player.setDescription(playerDTO.getDescription());
		player.setCountryName(playerDTO.getCountryName());
		return repository.save(player);
		
	}

	@Override
	public void deletByPlayerId(int playerId) {
		repository.deleteById(playerId);
	}

	@Override
	@Transactional
	public void deleteplayer(String countryName) {
		repository.deleteplayer(countryName);		
	}

	
	

}
