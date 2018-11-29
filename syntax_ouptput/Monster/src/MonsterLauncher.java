public class MonsterLauncher {
	public static void main(String[] args) {
		int max = 3;
		int min = 0;
		int rows = 4;
		int columns = 6;
		int r = 0, c = 0;
		String[] names = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven","Twelve"};
		double[] d = {1,2,3,4,5,6,7,8,9,10,11,12};
		int[] in = {1,2,3,4,5,6,7,8,9,10,11,12};
		Monster[][] menster = new Monster[6][4]; 
		for(int i = 0; i < 12; i++) {
			int ran = (int)(Math.random()*12);
			int ran1 = (int)(Math.random()*12);
			int ran2 = (int)(Math.random()*12);
			int mon = (int)(Math.random()*3);
			/*if(mon == 1) {
				 menster[c][r] = new Vampire(names[ran], d[ran1], in[ran2]);
				 System.out.println(c);
				 c++;
				 menster[c][r] = new Vampire(names[ran], d[ran1], in[ran2]);
			} else if (mon == 2) {
				 menster[c][r] = new WereWolf(names[ran], d[ran1], in[ran2]);
				 System.out.println(c);
				 c++;
				 menster[c][r] = new WereWolf(names[ran], d[ran1], in[ran2]);
			} else {
				 menster[c][r] = new Zombie(names[ran], d[ran1], in[ran2]);
				 System.out.println(c);
				 c++;
				 menster[c][r] = new Zombie(names[ran], d[ran1], in[ran2]);
			}*/
			menster[c][r] = new Vampire(names[ran], d[ran1], in[ran2]);
			System.out.println("Location[" + c + "]["+ r + "]: " + menster[c][r]);
			c++;
			menster[c][r] = new Vampire(names[ran], d[ran1], in[ran2]);
			System.out.println("Location[" + c + "]["+ r + "]: " + menster[c][r]);
			c++;
			
			if(c >= 5) {
				c = 0;
				r++;
			}
			
		}
		r = 0;
		c = 0;
		Monster[][] m = new Monster[columns][rows];
		for(int i = 0; i < columns; i++) {
			r = 0;
			int math =(int)(( Math.random () * (max - min + 1)) + min);
				for(int j = 0; j < rows; j++) {
					math =(int) (Math.floor( Math.random () * (max - min + 1)) + min);
					if(math == 1) {
						m[c][r] = new WereWolf();
					} else if (math == 2) {
						m[c][r] = new Vampire();
					} else {
						m[c][r] = new Zombie();
					}
					//System.out.println("Location[" + c + "]["+ r + "]: " + m[c][r]);
					r++;
				}
			c++;
		}
	}
}
