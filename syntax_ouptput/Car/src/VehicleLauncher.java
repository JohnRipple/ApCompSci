
public class VehicleLauncher {
	public static void main(String[] args) {
		Truck t = new Truck(5, 2010, 12400, 4, "Ford", "Focus", "Blue", "1111");
		Truck v = new Truck(5, 2010, 12400, 4, "Ford", "Jeep", "Blue", "1112");
		Car c = new Car(false, true, 2010, 12400, 4, "Ford", "Focus", "Red", "123");
		Car b = new Car(true, false, 2010, 12400, 4, "Toyota", "Focus", "Orange", "1233");
		
		System.out.println(c.toString());
		System.out.println(b.toString());
		System.out.println(t.toString());
		System.out.println(v.toString());
	}
}
