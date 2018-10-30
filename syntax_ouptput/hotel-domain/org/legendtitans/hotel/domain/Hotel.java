package org.legendtitans.hotel.domain;

// TODO: Auto-generated Javadoc
/**
 * The Class Hotel.
 */
public class Hotel {
	
	/** The name. */
	private String name;
	
	/** The address line 1. */
	private String addressLine1;
	
	/** The address line 2. */
	private String addressLine2;
	
	/** The city. */
	private String city;
	
	/** The state. */
	private String state;
	
	/** The zip. */
	private String zip;
	
	/**
	 * Instantiates a new hotel.
	 *
	 * @param n the n
	 * @param al1 the al 1
	 * @param al2 the al 2
	 * @param c the c
	 * @param s the s
	 * @param z the z
	 */
	public Hotel(String n, String al1, String al2, String c, String s, String z) {
		name = n;
		addressLine1 = al1;
		addressLine2 = al2;
		city = c;
		state = s;
		zip = z;
	}
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name.
	 *
	 * @param n the new name
	 */
	public void setName(String n) {
		name = n;
	}
	
	/**
	 * Gets the address line 1.
	 *
	 * @return the address line 1
	 */
	public String getAddressLine1() {
		return addressLine1;
	}
	
	/**
	 * Sets the address line 1.
	 *
	 * @param al1 the new address line 1
	 */
	public void setAddressLine1(String al1) {
		addressLine1 = al1;
	}
	
	/**
	 * Gets the address line 2.
	 *
	 * @return the address line 2
	 */
	public String getAddressLine2() {
		return addressLine2;
	}
	
	/**
	 * Sets the address line 2.
	 *
	 * @param al2 the new address line 2
	 */
	public void setAddressLine2(String al2) {
		addressLine2 = al2;
	}
	
	/**
	 * Gets the city.
	 *
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	
	/**
	 * Sets the city.
	 *
	 * @param c the new city
	 */
	public void setCity(String c) {
		city = c;
	}
	
	/**
	 * Gets the state.
	 *
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	
	/**
	 * Sets the state.
	 *
	 * @param s the new state
	 */
	public void setState(String s) {
		state = s;
	}
	
	/**
	 * Gets the zip.
	 *
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}
	
	/**
	 * Sets the zip.
	 *
	 * @param z the new zip
	 */
	public void setZip(String z) {
		zip = z;
	}

	
	
}
