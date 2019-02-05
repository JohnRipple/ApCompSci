
public class SelectionSort {
	public static void main(String[] args) {
		int[] r = {9,2,8,5,1};
		selectionSort(r);
	}

	static void selectionSort( int[] ray  ){
		   for(int i=0; i< ray.length-1; i++){
		      int min = i;
		      for(int j = i+1; j< ray.length; j++)
		      {
		         if(ray[j] < ray[min])
		            min = j;    		//find location of smallest
		      }
		      if(min != i) {
		         int temp = ray[min];
		         ray[min] = ray[i];
		         ray[i] = temp;   	//put smallest in spot i
		      }
		   }
		}

}
