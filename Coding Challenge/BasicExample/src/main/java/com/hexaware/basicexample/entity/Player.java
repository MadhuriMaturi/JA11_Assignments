package com.hexaware.basicexample.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
@Entity
@Table(name="player_details")
public class Player {
	@Id
	private int playerId;
	@NotBlank(message="playername cannot be null")
	@Pattern(regexp = "[A-Z][a-z]{3,20}")
	private String playerName;
	@NotNull(message="Jersey number cannot be null")
	private int jerseyNumber;
	@Pattern(regexp = "[A-Z][a-z]{3,20}")
	private String role;
	@NotNull(message="totalmatches cannot be null")
	private int totalmatches;
	@Pattern(regexp = "[A-Z][a-z]{3,20}")
	private String teamName;
	private String countryName;
	@NotBlank(message="Description cannotbe blank")
	private String description;
	public Player() {
		super();
	}
	
	public Player(int playerId, String playerName, int jerseyNumber, String role, int totalmatches, String teamName,
			String countryName, String description) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.jerseyNumber = jerseyNumber;
		this.role = role;
		this.totalmatches = totalmatches;
		this.teamName = teamName;
		this.countryName = countryName;
		this.description = description;
	}



	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getJerseyNumber() {
		return jerseyNumber;
	}
	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	public int getTotalmatches() {
		return totalmatches;
	}
	public void setTotalmatches(int totalmatches) {
		this.totalmatches = totalmatches;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	
	
	
	

}
