
public class Booking {
	private String bookingDate;
	private String numberOfRooms;
	public Booking (String bd, String nr) {
		bookingDate = bd;
		numberOfRooms = nr;
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
