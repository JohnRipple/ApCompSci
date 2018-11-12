public class Car {
	private String make;
	private String model;
	private String color;

	public Car(String mk, String mdl, String c) {
		make = mk;
		model = mdl;
		color = c;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String mk) {
		make = mk;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String md) {
		model = md;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String clr) {
		color = clr;
	}
	
	@Override
	public String toString() {
		return "make= "+ make + ", model= " + model + ", and color= " + color;
	}
	
	@Override
	public boolean equals(Object obj) {
		Car inCar = (Car)(obj);
	}

}