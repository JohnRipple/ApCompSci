import java.util.Arrays;

public class Sorting {
	static int[] nums = { 9, 2, 8, 5, 1 };
	static int[] nums1 = {17 , 13 , 4 , 1 , 6};

	public static void main(String[] args) {
		System.out.println("Start of array passing: " + Arrays.toString(nums));
		//selectionSort(nums1);
		//insertionSort(nums);
		System.out.println(Arrays.binarySearch(nums1, 11));
		System.out.println("End of array passing: " + Arrays.toString(nums));
	}

	public static void selectionSort(int[] ray) {
		for (int i = 0; i < ray.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < ray.length; j++) {
				if (ray[j] < ray[min])
					min = j; // find location of smallest
			}
			if (min != i) {
				int temp = ray[min];
				ray[min] = ray[i];
				ray[i] = temp; // put smallest in spot i
			}
		}
	}

	public static void insertionSort(int[] stuff) {
		for (int i = 1; i < stuff.length; ++i) {
			int val = stuff[i];
			int j = i;
			while (j > 0 && val < stuff[j - 1]) {
				stuff[j] = stuff[j - 1];
				j--;
			}
			stuff[j] = val;
		}
	}

}
