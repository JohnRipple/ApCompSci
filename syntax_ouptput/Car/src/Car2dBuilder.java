
public class Car2dBuilder {
	public static void main(String[] args) {
		int rows = 30;
		int columns = 5;
		Car[][] myCars = new Car[rows][columns];
		
		String[] make = new String[3];
		make[0] = "Toyota";
		make[1] = "Chevy";
		make[2] = "Ford";
		
		String[] model = new String[9];
		model[0] = "Rav4";
		model[1] = "Corolla";
		model[2] = "Tacoma";
		model[3] = "Malibu";
		model[4] = "Blazer";
		model[5] = "Avalanche";
		model[6] = "Focus";
		model[7] = "Tempo";
		model[8] = "Explorer";
		
		String[] color = {"Blue", "Red", "Purple"};
		
		int max = 3;
		int min = 0;
		int mo;

		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				int ma = (int)(Math.random() * (max - min) + min);
				int max1;
				int min1;
				int co = (int)(Math.random() * (max - min) + min);
				
				if(ma == 0) {
					max1 = 3;
					min1 = 0;
					mo = (int)(Math.random() * (max1 - min1) + min1);
					myCars[i][j] = new Car(make[ma], model[mo], color[co]);
				} else if (ma == 1) {
					max1 = 3;
					min1 = 6;
					mo = (int)(Math.random() * (max1 - min1) + min1);
					myCars[i][j] = new Car(make[ma], model[mo], color[co]);
				} else if (ma == 2) {
					max1 = 6;
					min1 = 9;
					mo = (int)(Math.random() * (max1 - min1) + min1);
					myCars[i][j] = new Car(make[ma], model[mo], color[co]);
				}
				System.out.println("Location [" + i + "]" + "[" + j + "] = " + myCars[i][j].getMake() + " " + myCars[i][j].getModel() + " " + myCars[i][j].getColor());
				
			}
		}
		
	}
}
