
public class Car {
	private int[][] myCars;
	private String make;
	private String model;
	private String color;
	
	public Car() {
		
	}
	public Car(String ma, String mo, String co) {
		make = ma;
		model = mo;
		color = co;
	}
	
	public int[][] getMyCars() {
		return myCars;
	}
	public void setMyCars(int[][] myCars) {
		this.myCars = myCars;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	
}
