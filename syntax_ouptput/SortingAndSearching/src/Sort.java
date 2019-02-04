//(c) A+ Computer Science
// www.apluscompsci.com

//array sort example

import java.util.Arrays;
import static java.lang.System.*;

public class Sort
{
	public static void main(String args[])
	{
		int nums[] = {45,78,90,66,11};
		System.out.println(Arrays.binarySearch(nums, 9)); //No autosort
		Arrays.sort(nums);
		for(int item : nums)
			out.println(item);
		out.println();
	}
}