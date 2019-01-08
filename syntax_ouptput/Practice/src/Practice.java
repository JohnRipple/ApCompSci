import java.util.ArrayList;
import java.*;

public class Practice {
	
	public static void main(String[] args) {
		ArrayList<String> sam = new ArrayList<String>();
		sam.add("ben");
		sam.add(0, "wil");
		sam.set(1, "cat");
		sam.add(1,"dog");
		sam.add("pig");
		sam.remove(2);
		//System.out.println(sam.set(1,"up"));
		System.out.println(sam);
	}
}
