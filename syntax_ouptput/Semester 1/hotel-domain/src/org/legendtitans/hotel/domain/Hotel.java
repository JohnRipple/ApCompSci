package org.legendtitans.hotel.domain;


public class Hotel {
	private String name;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private String zip;
	
	public Hotel() {
		
	}
	
	public Hotel(String n, String al1, String al2, String c, String s, String z) {
		name = n;
		addressLine1 = al1;
		addressLine2 = al2;
		city = c;
		state = s;
		zip = z;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		name = n;
	}

	public String getAddressLine1() {
		return addressLine1;
	}
	
	public void setAddressLine1(String al1) {
		addressLine1 = al1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String al2) {
		addressLine2 = al2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String c) {
		city = c;
	}

	public String getState() {
		return state;
	}
	
	public void setState(String s) {
		state = s;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String z) {
		zip = z;
	}
	
}
