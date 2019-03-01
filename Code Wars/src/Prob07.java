import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

public class Prob07 {
    private static String INPUT_FILE_NAME = "Prob07.txt";
    public static void main(String[] args){
        try {
            File inFile = new File(INPUT_FILE_NAME);
            FileReader fr = new FileReader(inFile);
            BufferedReader br = new BufferedReader(fr);
            String inLine = null;
            while((inLine = br.readLine()) != null){
                String[] s = inLine.split("\\s");
                ArrayList<Integer> n = new ArrayList<Integer>();
                for(int i = 0; i < s.length; i++){
                    n.add(Integer.parseInt(s[i]));
                }
                int num = n.get(0);
                n.remove(0);
                Collections.sort(n, Collections.reverseOrder());
                int total = 0;
                int total2 = 0;
                for(int i = 0; i < 3; i++){
                    if(i < num){
                        if(i == 0) {
                            total += n.get(i);
                            total2 += n.get(n.size()-1);
                        } else {
                            total *= n.get(i);
                            if(i == 1){
                                total2 *= n.get(n.size()-2);
                            } else {
                                total2 *= n.get(0);
                            }
                        }
                    }
                }
                if (total >= total2) {
                    System.out.println(total);
                } else {
                    System.out.println(total2);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
