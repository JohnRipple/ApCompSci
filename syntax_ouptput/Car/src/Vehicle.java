
public class Vehicle {
	private int year = 2018;
	private int mileage = 0;
	private int numSeats = 0;
	private String model;
	private String color;
	private String make;
	private String plateNumber;
	
	public Vehicle() {
		
	}
	
	public Vehicle(int y, int m, int n, String ma, String mo, String co, String pn) {
		year = y;
		mileage = m;
		numSeats = n;
		make = ma;
		model = mo;
		color = co;
		plateNumber = pn;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int y)  {
		year = y;
	}
	
	public int getMileage() {
		return mileage;
	}
	
	public void setMileage(int m) {
		mileage = m;
	}
	
	public int getNumSeats() {
		return numSeats;
	}
	
	public void setNumSeats(int m) {
		numSeats = m;
	}
	public String getMake() {
		return make;
	}
	
	public void setMake(String m) {
		make = m;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String m) {
		model = m;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String m) {
		color = m;
	}
	
	public String getPlateNumber() {
		return plateNumber;
	}
	
	public void setPlateNumber(String m) {
		plateNumber = m;
	}
}
