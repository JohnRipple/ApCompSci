import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Prob08 {
    private static String INPUT_FILE_NAME = "Prob08.txt";
    public static void main(String[] args){
        try {
            File inFile = new File(INPUT_FILE_NAME);
            FileReader fr = new FileReader(inFile);
            BufferedReader br = new BufferedReader(fr);
            String inLine = null;
            while(!(inLine = br.readLine()).equals("0 0")){
                String[] s = inLine.split("\\s");
                int[] n = new int[s.length];
                for(int i = 0; i < s.length; i++){
                    n[i] = Integer.parseInt(s[i]);
                }
                String total = s[0];
                int current = n[0];
                int previous = 0;
                for(int i = 0; i < n[1]; i++){
                    current++;
                    int length = total.length();
                    int currentLen = String.valueOf(current).length();
                    if((length + currentLen) <= n[1]){
                        total += current;
                        previous = current;
                    }
                }
                System.out.println(s[0] +" "+ s[1] +" " + previous);
            }
            fr.close();
            br.close();
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
