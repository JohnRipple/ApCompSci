package odd;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		int t = 1 ;
		while(t == 1) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter a word :: ");
			StringOddOrEven b = new StringOddOrEven(s.nextLine());
			System.out.println(b.isEven());
			if (s.nextLine().equals("")) {
				t = 0;
			}
		}
	}
}