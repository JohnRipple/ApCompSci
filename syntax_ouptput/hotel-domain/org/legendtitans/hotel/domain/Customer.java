package org.legendtitans.hotel.domain;

// TODO: Auto-generated Javadoc
/**
 * The Class Customer.
 */
public class Customer {
	
	/** The firstname. */
	private String firstname;
	
	/** The last name. */
	private String lastName;
	
	/** The addrs line 1. */
	private String addrsLine1;
	
	/** The addrs line 2. */
	private String addrsLine2;
	
	/** The city. */
	private String city;
	
	/** The state. */
	private String state;
	
	/** The zip. */
	private String zip;
	
	/** The phone number. */
	private String phoneNumber;
	
	/** The payment. */
	private Payment payment;
	
	/**
	 * Instantiates a new customer.
	 *
	 * @param fn the fn
	 * @param ln the ln
	 * @param al1 the al 1
	 * @param al2 the al 2
	 * @param c the c
	 * @param s the s
	 * @param z the z
	 * @param pn the pn
	 * @param p the p
	 */
	public Customer(String fn, String ln, String al1, String al2, String c, String s,
			String z, String pn, Payment p) {
		
		firstname = fn;
		lastName = ln;
		addrsLine1 = al1;
		addrsLine2 = al2;
		city = c;
		state = s;
		zip = z;
		phoneNumber = pn;
		payment = p;
	}

	/**
	 * Gets the firstname.
	 *
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * Sets the firstname.
	 *
	 * @param fn the new firstname
	 */
	public void setFirstname(String fn) {
		firstname = fn;
	}

	/**
	 * Gets the last name.
	 *
	 * @return the last name
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the last name.
	 *
	 * @param ln the new last name
	 */
	public void setLastName(String ln) {
		lastName = ln;
	}

	/**
	 * Gets the addrs line 1.
	 *
	 * @return the addrs line 1
	 */
	public String getAddrsLine1() {
		return addrsLine1;
	}

	/**
	 * Sets the addrs line 1.
	 *
	 * @param al1 the new addrs line 1
	 */
	public void setAddrsLine1(String al1) {
		addrsLine1 = al1;
	}

	/**
	 * Gets the addrs line 2.
	 *
	 * @return the addrs line 2
	 */
	public String getAddrsLine2() {
		return addrsLine2;
	}

	/**
	 * Sets the addrs line 2.
	 *
	 * @param al2 the new addrs line 2
	 */
	public void setAddrsLine2(String al2) {
		addrsLine2 = al2;
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

	/**
	 * Gets the phone number.
	 *
	 * @return the phone number
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * Sets the phone number.
	 *
	 * @param pn the new phone number
	 */
	public void setPhoneNumber(String pn) {
		phoneNumber = pn;
	}
	
	/**
	 * Gets the payment.
	 *
	 * @return the payment
	 */
	public Payment getPayment() {
		return payment;
	}

	/**
	 * Sets the payment.
	 *
	 * @param p the new payment
	 */
	public void setPayment(Payment p) {
		payment = p;
	}
}
