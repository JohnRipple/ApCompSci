import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Kennel {
    private ArrayList<Pet> petList = new ArrayList<>();
    Cat c = new Cat("Cat");
    Dog d = new Dog("Dog");
    LoudDoge ld = new LoudDoge("LoudDog");

    public void allSpeak(){
        petList.add(c);
        petList.add(d);
        petList.add(ld);
        for(int i = 0; i < petList.size(); i++){
            System.out.println(petList.get(i).getname() + " " + petList.get(i).speak());
        }
    }
    public static void main(String[] args){
        Kennel k = new Kennel();
        k.allSpeak();
        int[] i = {1,2,3,4,5667,43,2456,7};
    }
}
