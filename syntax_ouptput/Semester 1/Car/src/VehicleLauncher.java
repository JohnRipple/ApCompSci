
public class VehicleLauncher {
	public static void main(String[] args) {
		Truck t = new Truck(5, 2010, 12400, 4, "Ford", "Focus", "Blue", "1111");
		Truck a = new Truck(5, 2010, 12400, 4, "Ford", "Jeep", "Blue", "1112");
		Car c = new Car(false, true, 2010, 12400, 4, "Ford", "Focus", "Red", "123");
		Car b = new Car(true, false, 2010, 12400, 4, "Toyota", "Focus", "Orange", "1233");
		Car d = new Car(true, false, 0, 0, 4, "Highlander", "Focus", "Orange", "1233");
		
		Vehicle[] v = new Vehicle[5];
		v[0] = t;
		v[1] = a;
		v[2] = c;
		v[3] = b;
		v[4] = d;
		v[4] = new Car(false,true,0,0,0,"","","","");
		for(int i = 0; i < v.length; i++) {
			System.out.println(v[i]);
		}
		
		/*
		System.out.println(c.toString());
		System.out.println(b.toString());
		System.out.println(t.toString());
		System.out.println(a.toString());
		System.out.println(t.makeHornSound());
		*/
	}
}
