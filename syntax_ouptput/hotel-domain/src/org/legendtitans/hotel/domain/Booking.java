package org.legendtitans.hotel.domain;

import java.util.Date;


public class Booking {

	private Date bookingDate;
	private int numberOfRooms = 0;
	
	Customer customer;		
	Hotel hotel;

	public Booking() {
		
	}
	public Booking(Date bd, int nor) {
		bookingDate = bd;
		numberOfRooms = nor;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bd) {
		bd = bookingDate;
	}

	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	public void setNumberOfRooms(int nor) {
		numberOfRooms = nor;
	}

	public void setCustomer(Customer c) {
		customer = c;
	}

	public Customer getCustomer() {
		return customer;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel h) {
		hotel = h;
	}
	
	
}
