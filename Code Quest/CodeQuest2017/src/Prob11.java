import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Prob11 {
    private static final String INPUT_FILE_NAME = "Prob11.in.txt";
    public static void main(String[] args) {
        try {
            // prepare to read the file
            File inFile = new File(INPUT_FILE_NAME);
            FileReader fr = new FileReader(inFile);
            BufferedReader br = new BufferedReader(fr);
            String inLine = null;

            // get the number of test cases
            int T = Integer.parseInt(br.readLine());

            while (T > 0) {
                // read the line of text
                inLine = br.readLine();
                String[] s = inLine.split("");
                ArrayList<Integer> n = new ArrayList<Integer>();
                String[] s1 = inLine.split("[,\\s?!]+");

                for(int i = 0; i < s.length; i++){
                    if(s[i].equals(",") || s[i].equals("?") || s[i].equals("!")){
                        n.add(i);
                    }
                }
                for(int i = 0; )
                T--;
            }

            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

