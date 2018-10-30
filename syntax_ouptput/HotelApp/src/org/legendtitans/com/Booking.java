package org.legendtitans.com;

public class Booking {
	private String bookingDate;
	private String numberOfRooms;
	public Booking (String bd, String nr) {
		bookingDate = bd;
		numberOfRooms = nr;
		
	}
	
	Customer customer;
	
	Hotel hotel;
	
	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getBookingDate() {
		return bookingDate;
	}
	
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	
	public String getNumberOfRooms() {
		return numberOfRooms;
	}
	
	public void setNumberOfRooms(String numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}
	
}
