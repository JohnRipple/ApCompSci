package org.lhs.dcsdk12;

public class Vampire extends Monster {
	private int age;
	private double strength;

	public Vampire() {
	}

	public Vampire(String n) {
		super(n);
	}

	public Vampire(double s, int a) {
		strength = s;
		age = a;
	}

	public Vampire (String n, double s, int a) {
		super(n);
		strength = s;
		age = a;
	}

	public double getStrength() {
		return strength;
	}
	
	public double getDouble(){
		return strength;
	}
	
	public void setStrength(double s) {
		strength = s;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int a) {
		age = a;
	}

	public String toString() {
		return "Vampire: Age = " + age + " Strength = " + strength + " Name = " + getMyname(); 
	}
	
	@Override
	public boolean equals(Object obj) {
		Vampire v = (Vampire)obj;
		if(v.getAge() == this.getAge() && v.getDouble() == this.getDouble() && v.getMyname().equals(this.getMyname())) {
			return true;
		}
		return false;
	}

}
