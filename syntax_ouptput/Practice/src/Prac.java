import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Prac {
    ArrayList<String> myList = new ArrayList<>();
    public int numWordsOfLength(int len) {
        int count = 0;
        for(int i = 0; i < myList.size(); i++) {
            if(myList.get(i).length() == len) {
                count++;
            }
        }
        return count;
    }

    public void removeWordsOfLength(int len) {
        for(int i = 0; i < myList.size(); i++) {
            if(myList.get(i).length() == len) {
                myList.remove(i);
            }
        }
    }

    public static void main(String[] args){
        Prac p = new Prac();
        p.myList.add("1");
        p.myList.add("2");
        p.myList.add("12");
        p.myList.add("124");

        List<Integer> l = new ArrayList<Integer>();
        l.add(5);
        l.add(Integer.valueOf((int)2.6));
        double d = (double)5/6;
        System.out.println(d);

        p.removeWordsOfLength(1);
        System.out.println(p.myList);
    }


}
