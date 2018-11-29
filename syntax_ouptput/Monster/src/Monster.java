public class Monster {
	private String myname;

	public Monster() {
		myname = "Monster";
	}

	public String getMyname() {
		return myname;
	}

	public void setMyname(String myname) {
		this.myname = myname;
	}

	public Monster(String name) {
		myname = name;
	}

	public String toString() {
		return myname + "\n";
	}
}
