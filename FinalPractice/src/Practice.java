import java.util.Scanner;


public class Practice {
	public static void main(String[] args) {
		double x = 5/2.0;
		System.out.println(x);

	}
	
	public static double ave(int[] ints)
	{
	   int sum = 0;
	   for(int val : ints)
	      sum += val;
	   return   sum/(ints.length+0.0) ;
	}

}
