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
            while(!br.readLine().equals(null)){
                String[] s = br.readLine().split("\\s");
                ArrayList<String> s1 = new ArrayList<String>;
                for(int i = 1; i < s.length; i++){
                    s1.add(s[i]);
                }
                Collections.sort(s1);


            }

        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}
