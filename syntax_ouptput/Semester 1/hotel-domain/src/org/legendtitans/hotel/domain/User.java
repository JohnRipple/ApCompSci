package org.legendtitans.hotel.domain;


public class User {
	private String username;
	private String password;
		
	public User() {
		
	}
	
	public User(String un, String p) {	
		username = un;
		password = p;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String un) {
		username = un;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String p) {
		password = p;
	}
	
	
}
