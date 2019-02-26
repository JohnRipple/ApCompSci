import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

public class Prob12 {
    private static final String INPUT_FILE_NAME = "Prob12.txt";
    public static void main(String[] args) {
        try {
            // prepare to read the file
            File inFile = new File(INPUT_FILE_NAME);
            FileReader fr = new FileReader(inFile);
            BufferedReader br = new BufferedReader(fr);
            String inLine = null;

            int cas = Integer.parseInt(br.readLine());
            ArrayList<String> s = new ArrayList<String>();
            for (int i = 0; i < cas; i++) {
                s.add(br.readLine());
            }
            int T = Integer.parseInt(br.readLine());
            int counter = 0;
            while (counter++ < T) {
                int k = -1;
                inLine = br.readLine();
                for (int i = 0; i < cas; i++) {
                    if (anagram(s.get(i), inLine) == true) {
                        k = i;
                    }
                }
                if (k != -1) {
                    System.out.println("Yes: " + s.get(k));
                } else {
                    System.out.println("No: No matching case");
                }
            }
            br.close();
            fr.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    public static boolean anagram (String a, String b){
        char[] c = a.replace(" ", "").toCharArray();
        char[] c1 = b.replace(" ", "").toCharArray();
        Arrays.sort(c);
        Arrays.sort(c1);
        int count = 0;
        if (c.length == c1.length) {
            for (int i = 0; i < c1.length; i++) {
                count++;
            }
            if (count == c1.length){
                return true;
            }
        }
        return false;
    }
}



