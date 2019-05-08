import java.util.Arrays;

public class SortSetup {
    private SortIt[] sorts = new SortIt[4];
    private Integer[] data = {38, 27, 43, 3, 82, 9, 10, 11};
    private Integer[] stored = {38, 27, 43, 3, 82, 9, 10, 11};
    public SortSetup(){}

    public void setup(){
        sorts[0] = new SortIt("Merge", data);
        sorts[1] = new SortIt("Quicksort", data);
        sorts[2] = new SortIt("Insertion", data);
        sorts[3] = new SortIt("Selection", data);
    }

    public void run(){
        for(int i = 0; i < sorts.length; i++){
            System.out.println(sorts[i].toString());
            if(sorts[i].type.equals("Merge")){
                sorts[i].mergeSort(data, 0, data.length);
            } else if(sorts[i].type.equals("Quicksort")){
                sorts[i].quickSort(data, 0, data.length-1);
            } else if(sorts[i].type.equals("Insertion")){
                sorts[i].insertionSort(data);
            } else {
                sorts[i].selectionSort(data);
            }
            System.out.println(Arrays.toString(data));
            for(int j = 0; j < data.length; j++){
                data[j] = stored[j];
            }
            System.out.println(sorts[i].pPartition(data));
        }
    }
}
