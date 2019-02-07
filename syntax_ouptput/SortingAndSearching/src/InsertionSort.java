
public class InsertionSort {
	public static void main(String[] args) {
		int[] r = {9,2,8,5,1};
		insertionSort(r);
		for(int i = 0; i < r.length; i++){
			System.out.println(r[i]);
		}
	}

	static void insertionSort( int[] stuff)
	{
	   for (int i=1; i< stuff.length; ++i)
	   {
	      int val = stuff[i];
	      int j=i;
	      while(j > 0 && val < stuff[j-1]){         
	         stuff[j]=stuff[j-1];
	         j--;
	      }
	      stuff[j]=val;
	   }
	}

}
