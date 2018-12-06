package org.lhs.dcsdk12;
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

	public double getDouble(){
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
	
	@Override
	public boolean equals(Object obj) {
		Zombie v = (Zombie)obj;
		if(v.getAge() == this.getAge() && v.getDouble() == this.getDouble() && v.getMyname().equals(this.getMyname())) {
			return true;
		}
		return false;
	}

}
