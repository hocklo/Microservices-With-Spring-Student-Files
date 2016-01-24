/**
 * 
 */
package com.springbootcourse.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootcourse.domain.Team;
import com.springbootcourse.repository.TeamRepository;

/**
 * @author hocklo
 * Team controller class to practise with rest objects.
 */
@RestController
public class TeamController {
	@Autowired
	private TeamRepository teamRepository;
	
	@RequestMapping("/part2/teams")
	public Iterable<Team> getTeams(){
		return teamRepository.findAll();
	}
	
	@RequestMapping("/part3/teams/{id}")
	public Team getTeam(@PathVariable("id") Long id) {
		return teamRepository.findOne(id);
	}
}
