package org.legendtitans.hotel.domain;

import java.util.Date;

// TODO: Auto-generated Javadoc
/**
 * The Class Booking.
 */
public class Booking {
	

	private Date bookingDate;
	
	
	private int numberOfRooms = 0;
	
	
	Customer customer;
	
	
	Hotel hotel;
	
	/**
	 * Instantiates a new booking.
	 *
	 * @param bd the bd
	 * @param nor the nor
	 */
	public Booking(Date bd, int nor) {
		bookingDate = bd;
		numberOfRooms = nor;
	}

	/**
	 * Gets the booking date.
	 *
	 * @return the booking date
	 */
	public Date getBookingDate() {
		return bookingDate;
	}

	/**
	 * Sets the booking date.
	 *
	 * @param bd the new booking date
	 */
	public void setBookingDate(Date bd) {
		bd = bookingDate;
	}

	/**
	 * Gets the number of rooms.
	 *
	 * @return the number of rooms
	 */
	public int getNumberOfRooms() {
		return numberOfRooms;
	}
	
	/**
	 * Sets the number of rooms.
	 *
	 * @param nor the new number of rooms
	 */
	public void setNumberOfRooms(int nor) {
		numberOfRooms = nor;
	}
	
	/**
	 * Sets the customer.
	 *
	 * @param c the new customer
	 */
	public void setCustomer(Customer c) {
		customer = c;
	}
	
	/**
	 * Gets the customer.
	 *
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}
	
	/**
	 * Gets the hotel.
	 *
	 * @return the hotel
	 */
	public Hotel getHotel() {
		return hotel;
	}

	/**
	 * Sets the hotel.
	 *
	 * @param h the new hotel
	 */
	public void setHotel(Hotel h) {
		hotel = h;
	}
	
	
}
