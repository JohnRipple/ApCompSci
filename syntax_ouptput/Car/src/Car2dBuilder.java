
public class Car2dBuilder {
	public static void main(String[] args) {
		String[] make = {"Toyota","Chevy","Ford"};
		String[] model = {"Rav4","Corolla","Tacoma","Malibu","Blazer","Avalanche","Focus","Tempo","Explorer"};
		String[] color = {"Blue", "Red", "Black"};
		int mo = 0, max1 = 0, min1 = 0;
		int rows = 5;
		int columns = 2;
		Car[][] myCars = new Car[rows][columns];
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				int rand = (int)(Math.random() * (3 - 0) + 0);
				int co = (int)(Math.random() * (3 - 0) + 0);
				if(rand == 0) {
					max1 = 3; min1 = 0;
				} else if (rand == 1) {
					max1 = 6; min1 = 3;
				} else if (rand == 2) {
					max1 = 9; min1 = 6;
				}
				mo = (int)(Math.random() * (max1 - min1) + min1);
				myCars[i][j] = new Car(make[rand], model[mo], color[co]);
				System.out.println("Location [" + i + "]" + "[" + j + "] = " + myCars[i][j].getMake() + " " + myCars[i][j].getModel() + " " + myCars[i][j].getColor());
			}
		}
		Car[] cars = new Car[2];
		cars[0] = new Car("Toyota", "Rav4", "Blue");
		cars[1] = new Car("Toyota", "Rav4", "Blue");
		if(cars[0].equals(cars[1])) {
			System.out.println("Yeah");
		} else {
			System.out.println("Yeah'nt");
		}
	}
}