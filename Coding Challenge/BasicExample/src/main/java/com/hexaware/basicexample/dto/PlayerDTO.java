package com.hexaware.basicexample.dto;


public class PlayerDTO {
	
	private int playerId;	
	private String playerName;
	private int jerseyNumber;
	private String role;
	private int totalmatches;
	private String teamName;
	private String countryName;
	private String description;
	
	public PlayerDTO() {
		super();
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





	public PlayerDTO(int playerId, String playerName, int jerseyNumber, String role, int totalmatches, String teamName,
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
	
	
	

}
