import java.util.ArrayList;
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


        p.removeWordsOfLength(1);
        System.out.println(p.myList);
    }


}
