public class Car {
	/*private String make;
	private String model;
	private String color;*/
	private boolean isHatchback;
	private boolean isSUV;

	/*public Car(String mk, String mdl, String c) {
		make = mk;
		model = mdl;
		color = c;
	}*/
	
	public Car(boolean n, boolean s) {
		isHatchback = n;
		isSUV = s;
	}
	
	public Car() {
		
	}
	
	public boolean getIsHatchback() {
		return isHatchback;
	}
	
	public void setIsHatchback(boolean n) {
		isHatchback = n;
	}
	
	public boolean getIsSUV() {
		return isSUV;
	}
	
	public void setIsSUV(boolean s) {
		isSUV = s;
	}

	@Override
	public String toString() {
		return "Car [numSeats=" + isHatchback + ", isSUV=" + isSUV + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Car c = (Car)obj;
		if(c.getIsSUV() == (this.getIsSUV()) && c.getIsHatchback() == (this.getIsHatchback())) {
			return true;
		}
		
		return false;
	}

	
	/*
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
		if(this.toString().equals(inCar.toString())) {
			return true;
		} 
		return false;
	}*/

}