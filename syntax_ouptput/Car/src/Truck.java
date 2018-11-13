
public class Truck extends Vehicle {
	private int numAxels;
	
	public Truck() {
		numAxels = 2;
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
		return "Number of Axels" + numAxels;
	}
	
	@Override
	public boolean equals(Object obj) {
		Truck t = (Truck)obj;
		if(t.getNumAxels() == numAxels) {
			return true;
		}
		
		return false;
	}
 }
