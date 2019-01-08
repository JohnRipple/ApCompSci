public class Car extends Vehicle{
	/*private String make;
	private String model;
	private String color;*/
	private boolean isHatchback;
	private boolean isSUV;

	public Car(String mk, String mdl, String c) {
		super(mk, mdl, c);
	}
	
	public Car(boolean a, boolean s, int y, int m, int n, String ma, String mo, String co, String pn) {
		super(y, m, n , ma, mo, co, pn);
		isHatchback = a;
		isSUV = s;
	}
	public Car(boolean n, boolean s) {
		isHatchback = n;
		isSUV = s;
	}
	
	public Car() {
		isHatchback = false;
		isSUV = false;
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
		return "Car [isHatchback=" + isHatchback + ", isSUV=" + isSUV + ", getYear()=" + getYear() + ", getMileage()="
				+ getMileage() + ", getNumSeats()=" + getNumSeats() + ", getMake()=" + getMake() + ", getModel()="
				+ getModel() + ", getColor()=" + getColor() + ", getPlateNumber()=" + getPlateNumber() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Car c = (Car)obj;
		if(c.getIsSUV() == (this.getIsSUV()) && c.getIsHatchback() == (this.getIsHatchback()) && c.getColor().equals(this.getColor()) 
				&& c.getMake().equals(this.getMake()) && (c.getMileage() == this.getMileage()) && this.getModel().equals(c.getModel()) && (c.getNumSeats() == this.getNumSeats()) 
				&& c.getPlateNumber().equals(this.getPlateNumber()) && c.getYear() == this.getYear()) {
			return true;
		}
		
		return false;
	}
	
	@Override
	public String makeHornSound() {
		return "Beep Beep Beepn't";
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