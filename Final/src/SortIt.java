import java.util.Arrays;

public class SortIt {
    String type;
    Integer[] data;
    private int count = 0;
    public SortIt(String s, Integer[] d){
        type = s;
        data = d;
    }

    public void selectionSort(Integer[] ray)
    {
        for(int i=0; i< ray.length-1; i++)
        {
            int min = i;
            for(int j = i+1; j< ray.length; j++)
            {
                if(ray[j] < ray[min])
                    min = j;
            }
            if( min != i)	{
                int temp = ray[min];
                ray[min] = ray[i];
                ray[i] = temp;
            }
           print(ray, i);
        }
    }

    public void print(Object[] ray, int j){
        String s = "";
        for(int b = 0; b < ray.length; b++){
            if (b == 0)
                s += "[" + ray[b] + ",";
            else if (b == ray.length - 1)
                s += " " + ray[b] + "]";
            else
                s += " " + ray[b] + ",";
        }
        System.out.println("Step: " + j + " " + s);
    }

    public void insertionSort(Integer[] stuff)
    {
        for(int i=1; i < stuff.length; ++i)
        {
            int val = stuff[i];
            int j=i;
            while(j > 0 && val < stuff[j-1])
            {
                stuff[j] = stuff[j-1];
                j--;
            }
            stuff[j]=val;
            print(stuff, i);
        }
    }

    public void mergeSort(Comparable[] stuff, int front, int back)
    {
        int mid = (front+back)/2;

        if(mid==front) return;
        mergeSort(stuff, front, mid);
        mergeSort(stuff, mid, back);
        merge(stuff, front, back);
    }

    public void merge(Comparable[] stuff, int front, int back)
    {
        int dif = back-front;
        Comparable[] temp = new Comparable[ dif ];
        int beg = front, mid = (front+back)/2, saveMid = mid;
        int spot = 0;
        while( beg<saveMid && mid<back ) {
            if(stuff[ beg ].compareTo(stuff[ mid ])<0)
                temp[ spot++ ]= stuff[ beg++ ];
            else
                temp[ spot++ ]= stuff[ mid++ ];
        }
        while( beg < saveMid ) {
            temp[spot++] = stuff[beg++];
            print(stuff, count++);
        }
        while( mid < back ) {
            temp[spot++] = stuff[mid++];
            print(stuff, count++);
        }
        for(int i = 0; i < dif; ++i) {
            stuff[front + i] = temp[i];
        }
        print(stuff, count++);
    }

    public void quickSort(Comparable[] stuff, int low, int high)
    {
        if (low < high)
        {
            int spot = partition(stuff, low, high);
            quickSort(stuff, low, spot);
            quickSort(stuff, spot+1, high);
        }
    }

    public int partition(Comparable[] stuff, int bot, int top)
    {
        //median pivot
        Comparable pivot = stuff[(bot + top)/2];
        while(bot<top)
        {
            while (stuff[top].compareTo(pivot) > 0 && bot < top ){
                top = top - 1;
            }
            while (stuff[bot].compareTo(pivot) < 0 && bot < top ){
                bot = bot + 1;
            }

            Comparable temp = stuff[bot];
            stuff[bot] = stuff[top];
            stuff[top] = temp;
            print(stuff, count++);
        }
        return top;
    }

    public String pPartition(Integer[] ep){
        String s = "";
        for(int i = 0; i < Arrays.toString(ep).length(); i++){
            s += "-";
        }
        return s;
    }

    public String toString(){
        String s = "";
        for(int b = 0; b < data.length; b++){
            if (b == 0)
                s += "[" + data[b] + ",";
            else if (b == data.length - 1)
                s += " " + data[b] + "]";
            else
                s += " " + data[b] + ",";
        }
        return "Type " + type + " | Data: " + s;
    }

}
