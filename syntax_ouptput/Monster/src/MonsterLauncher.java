
public class MonsterLauncher {
	public static void main(String[] args) {
		WereWolf w = new WereWolf(12,3);
		Vampire v = new Vampire(15,4);
		Zombie z = new Zombie("Boi" , 1, 8);
		System.out.println(w);
		System.out.println(v);
		System.out.println(z);
	}
}
