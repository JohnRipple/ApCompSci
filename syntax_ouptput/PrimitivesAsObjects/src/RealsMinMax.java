import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//(c) A+ Computer Science  -  www.apluscompsci.com

//real number min and max example

public class RealsMinMax
{
	public static void main(String args[])
	{
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);

		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);  //really really big number
		
		float f = .838485f;
		double d = .020304;
		int i = 1253; 
		System.out.println("-------------------------------");
		String[] s = {String.valueOf(f), String.valueOf(d), String.valueOf(i)};
		for(int j = 0; j < s.length; j++) {
			System.out.println(s[j]);
		}
		
		float f2 = Float.parseFloat(s[0]);
		double d2 = Double.parseDouble(s[1]);
		int i2 = Integer.parseInt(s[2]);
		System.out.println("-------------------------------");
		System.out.println(f2);
		System.out.println(d2);
		System.out.println(i2);
		System.out.println("-------------------------------");
		
		ArrayList<Integer> c = new ArrayList<Integer>();
		String boi = "13 9 56 5 798 3 25";
		String bois[] = boi.split("\\s");
		for(int j = 0; j < bois.length; j++) {
			c.add(Integer.parseInt(bois[j]));
		}
		Collections.sort(c);
		Collections.reverse(c);
		System.out.println(c);
	}
}