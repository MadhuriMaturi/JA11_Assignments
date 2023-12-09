package com.hexaware.basicexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.hexaware.basicexample.entity.Player;

public interface PlayerRepository extends JpaRepository<Player,Integer>
{		
	  @Modifying 
	  @Query("Delete from  Player p where p.countryName=?1")
	  public void deleteplayer(String countryName);
	 
	 
}

