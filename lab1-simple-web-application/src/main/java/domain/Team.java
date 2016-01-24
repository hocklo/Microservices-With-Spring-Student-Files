/**
 * 
 */
package domain;

/**
 * @author hocklo
 *
 */
public class Team {
	private Long id;
	private String name;
	private String location;
	private String mascotte;
	
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
	
	
}
