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
	private String emailAddress;
	public Customer(String fn, String ln, String add1, String add2, String ct, String st, String z, String pn, String ea) {
		firstName = fn;
		lastName = ln;
		address1 = add1;
		address2 = add2;
		city = ct;
		state = st;
		zip = z;
		phoneNumber = pn;
		emailAddress = ea;
		
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
	
	public void setEmail(String email) {
		this.emailAddress = email;
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
	
	public String getEmail() {
		return emailAddress;
	}
	
	
	
	/*public static void main(String[] args) {
		SwingDatabase sd = new SwingDatabase();
		sd.createAndShowGUI();
		
		String[] data = SwingDatabase.getFields();
		for(int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}*/
	
}
