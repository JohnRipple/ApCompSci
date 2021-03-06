//(c) A+ Computer Science
// www.apluscompsci.com

//insertion sort example 

import static java.lang.System.*;

public class InsertionSort
{
    public static void insertionSort( int[] stuff)
    {
        for(int i=1; i< stuff.length; ++i)
        {
            int val = stuff[i];
            int j=i;
            while(j>0&&val<stuff[j-1])
            {
                stuff[j]=stuff[j-1];
                j--;
            }
            stuff[j]=val;
        }
    }

    public static void insertionSortC( Comparable[] stuff)
    {
        for(int i=1; i< stuff.length; ++i)
        {
            Comparable val = stuff[i];
            int j=i;
            while( j>0 && val.compareTo(stuff[j-1])<0 )
            {
                stuff[j]=stuff[j-1];
                j--;
            }
            stuff[j]=val;
        }
    }
}