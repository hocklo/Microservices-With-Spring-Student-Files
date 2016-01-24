/**
 * 
 */
package com.springbootcourse.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


/**
 * @author hocklo
 *
 */
@Entity
public class Team {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String location;
	private String mascotte;
	private Player[] players;
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * @return the mascotte
	 */
	public String getMascotte() {
		return mascotte;
	}
	/**
	 * @param mascotte the mascotte to set
	 */
	public void setMascotte(String mascotte) {
		this.mascotte = mascotte;
	}
	/**
	 * @return the players
	 */
	public Player[] getPlayers() {
		return players;
	}
	/**
	 * @param players the players to set
	 */
	public void setPlayers(Player[] players) {
		this.players = players;
	}
	
	
}