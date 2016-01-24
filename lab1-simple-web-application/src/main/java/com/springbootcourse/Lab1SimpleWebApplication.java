package com.springbootcourse;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springbootcourse.domain.Player;
import com.springbootcourse.domain.Team;
import com.springbootcourse.repository.TeamRepository;

@SpringBootApplication
public class Lab1SimpleWebApplication {
	
	@Autowired
	private TeamRepository teamRepository;

	public static void main(String[] args) {
		SpringApplication.run(Lab1SimpleWebApplication.class, args);
	}
	
	@PostConstruct
	public void init() {
		 List<Team> list = new ArrayList<>();
		  
		  Player player = new Player();
	      player.setName("Michael Jordan");
	      player.setAge(69);
	      
	      Set<Player> players = new HashSet<Player>();
	      players.add(player);
	      
	      Team team = new Team();
	      team.setLocation("Harlem");
	      team.setName("Globetrotters");
	      team.setPlayers(players);
	      list.add(team);
	      
	      players = new HashSet<Player>();
	      player = new Player();
	      player.setName("Jerry West");
	      player.setAge(75);
	      
	      players = new HashSet<Player>();
	      players.add(player);
	      
	      team = new Team();
	      team.setLocation("Washington");
	      team.setName("Generals");
	      team.setPlayers(players);
	      list.add(team);

	      teamRepository.save(list);
	}
}
