package org.lhs.dcsdk12;
public class WereWolf extends Monster {
	private double speed;
	private int age;

	public WereWolf() {
	}

	public WereWolf(String n) {
		super(n);
	}

	public WereWolf(double s, int a) {
		speed = s;
		age = a;
	}

	public WereWolf(String n, double s, int a) {
		super(n);
		speed = s;
		age = a;
	}
	
	public double getSpeed() {
		return speed;
	}
	public double getDouble(){
		return speed;
	}
	public void setSpeed(double s) {
		speed = s;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int a) {
		age = a;
	}

	public String toString() {
		return "WereWolf: Age = " + age + " Speed = " + speed + " Name = " + getMyname(); 
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this.getClass() != obj.getClass()) {
			return false;
		}
		WereWolf v = (WereWolf)obj;
		if(v.getAge() == this.getAge() && v.getDouble() == this.getDouble() && v.getMyname().equals(this.getMyname())) {
			return true;
		}
		return false;
	}
}
