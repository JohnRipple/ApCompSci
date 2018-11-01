package org.legendtitans.hotel.domain;

public class Customer {		
	private String firstname;	
	private String lastName;	
	private String addrsLine1;	
	private String addrsLine2;	
	private String city;
	private String state;	
	private String zip;	
	private String phoneNumber;
	
	private Payment payment;
	
	public Customer() {
		
	}
	
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

	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String fn) {
		firstname = fn;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String ln) {
		lastName = ln;
	}

	public String getAddrsLine1() {
		return addrsLine1;
	}

	public void setAddrsLine1(String al1) {
		addrsLine1 = al1;
	}

	public String getAddrsLine2() {
		return addrsLine2;
	}
	
	public void setAddrsLine2(String al2) {
		addrsLine2 = al2;
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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String pn) {
		phoneNumber = pn;
	}
	
	public Payment getPayment() {
		return payment;
	}
	
	public void setPayment(Payment p) {
		payment = p;
	}
}
