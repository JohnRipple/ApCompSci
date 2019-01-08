
public class Truck extends Vehicle {
	private int numAxels;
	
	public Truck() {
		numAxels = 2;
	}
	
	public Truck(int a, int y, int m, int n, String ma, String mo, String co, String pn) {
		super(y, m, n , ma, mo, co, pn);
		numAxels = a;
	}
	
	public Truck(int n) {
		numAxels = n;
	}
	
	public int getNumAxels() {
		return numAxels;
	}
	
	public void setNumAxels(int n) {
		numAxels = n;
	}
	
	@Override
	public String toString() {
		return "Truck [numAxels=" + numAxels + ", getYear()=" + getYear() + ", getMileage()=" + getMileage()
				+ ", getNumSeats()=" + getNumSeats() + ", getMake()=" + getMake() + ", getModel()=" + getModel()
				+ ", getColor()=" + getColor() + ", getPlateNumber()=" + getPlateNumber() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Truck t = (Truck)obj;
		if(t.getNumAxels() == numAxels && t.getColor().equals(this.getColor()) 
				&& t.getMake().equals(this.getMake()) && (t.getMileage() == this.getMileage()) && this.getModel().equals(t.getModel()) && (t.getNumSeats() == this.getNumSeats()) 
				&& t.getPlateNumber().equals(this.getPlateNumber()) && t.getYear() == this.getYear()) {
			return true;
		}
		
		return false;
	}
	
	@Override
	public String makeHornSound() {
		return "BWAMP BWAMP BEEP BEEP BEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEP";
	}
 }
