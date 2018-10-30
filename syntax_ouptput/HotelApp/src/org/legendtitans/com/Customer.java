package org.legendtitans.com;

public class Customer {
	private String firstName; 
	private String lastName;
	private String address1; 
	private String address2;
	private String city;
	private String state;
	private String zip;
	private String phoneNumber;
	private Payment payment;
	public Customer(String fn, String ln, String add1, String add2, String ct, String st, String z, String pn, Payment p) {
		firstName = fn;
		lastName = ln;
		address1 = add1;
		address2 = add2;
		city = ct;
		state = st;
		zip = z;
		phoneNumber = pn;
		payment = p;
		
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	public void setPhone(String phone) {
		this.phoneNumber = phone;
	}

	
	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getAddress1() {
		return address1;
	}
	
	public String getAddress2() {
		return address2;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getState() {
		return state;
	}
	
	public String getZip() {
		return zip;
	}
	
	public String getPhone() {
		return phoneNumber;
	}
	
	
	
}
