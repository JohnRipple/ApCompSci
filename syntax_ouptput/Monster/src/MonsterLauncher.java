import java.util.*;
public class MonsterLauncher {
	private static Monster[] menster = new Monster[12]; 
	private static Monster[] menster2 = new Monster[12];
	private static Monster[][] m;
	 
	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			
		}
		int max = 3;
		int min = 0;
		int rows = 4;
		int columns = 6;
		int r = 0, c = 0;
		String[] names = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven","Twelve"};
		double[] d = {1,2,3,4,5,6,7,8,9,10,11,12};
		int[] in = {1,2,3,4,5,6,7,8,9,10,11,12};
		
		for(int i = 0; i < menster.length; i++) {
			int ran = (int)(Math.random()*12);
			int ran1 = (int)(Math.random()*12);
			int ran2 = (int)(Math.random()*12);
			int mon = (int)(Math.random()*3);
			if(mon == 0) {
				menster[i] = new Zombie(names[ran], d[ran1], in[ran2]);
				menster2[i] = new Zombie(names[ran], d[ran1], in[ran2]);
			} else if (mon == 1) {
				menster[i] = new WereWolf(names[ran], d[ran1], in[ran2]);
				menster2[i] = new WereWolf(names[ran], d[ran1], in[ran2]);
			} else {
				menster[i] = new Vampire(names[ran], d[ran1], in[ran2]);
				menster2[i] = new Vampire(names[ran], d[ran1], in[ran2]);
			}
			//System.out.println("Location[" + i + "]: " + menster[i]);
			//System.out.println("Location[" + i + "]: " + menster2[i]);
		}
		r = 0;
		c = 0;
		m = new Monster[columns][rows];
		for(int i = 0; i < columns; i++) {
			r = 0;
			int math =(int)(( Math.random () * (max - min + 1)) + min);
			
				for(int j = 0; j < rows; j++) {
					math =(int) (Math.floor( Math.random () * (max - min + 1)) + min);
					int math1 = (int)(Math.random()*12);
					/*if(math == 1) {
						Check();
						m[c][r] = new WereWolf();
					} else if (math == 2) {
						Check();
						m[c][r] = new Vampire();
					} else {
						Check();
						m[c][r] = new Zombie();
					}*/
					
					m[c][r] = menster[math1];
					//System.out.println(b);
					System.out.println("Location[" + c + "]["+ r + "]: " + m[c][r]);
					r++;
				}
			c++;
		}
	}
	public void pickName() {
		List<String> name = new ArrayList( Arrays.asList("Terminator", "Slicer","Ninja", "cow", "Robot", "littlegirl" ));
	    List<String> remaining = name;
		if (remaining.isEmpty()) {
            // could refill 'remaining' here.. but we'll just throw, for now.
            throw new IllegalStateException("names all used");
        }
		int index = (int) (Math.random() * remaining.size());
        String result = remaining.remove( index);
        System.out.println(result);
	}
	
}
