package org.legendtitans.hotel.domain;

// TODO: Auto-generated Javadoc
/**
 * The Class User.
 */
public class User {
	
	/** The username. */
	private String username;
	
	/** The password. */
	private String password;
	
	/**
	 * Instantiates a new user.
	 *
	 * @param un the un
	 * @param p the p
	 */
	public User(String un, String p) {	
		username = un;
		password = p;
	}
	
	/**
	 * Gets the username.
	 *
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	
	/**
	 * Sets the username.
	 *
	 * @param un the new username
	 */
	public void setUsername(String un) {
		username = un;
	}
	
	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	
	/**
	 * Sets the password.
	 *
	 * @param p the new password
	 */
	public void setPassword(String p) {
		password = p;
	}
	
	
}
