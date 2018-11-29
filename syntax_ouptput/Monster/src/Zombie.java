public class Zombie extends Monster {
	private int age;
	private double weight;

	public Zombie() {
	}

	public Zombie(String n) {
		super(n);
	}

	public Zombie(double w, int a) {
		weight = w;
		age = a;
	}

	public Zombie(String n, double w, int a) {
		super(n);
		weight = w;
		age = a;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double w) {
		weight = w;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int a) {
		age = a;
	}

	public String toString() {
		return "Zombie: Age = " + age + " Weight = " + weight + " Name = " + getMyname();
	}

}
