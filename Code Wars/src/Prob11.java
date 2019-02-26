import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class Prob11 {
    private static String INPUT_STRING_NAME = "Prob11.txt";
    public static void main(String[] args){
        try {
            File inFile = new File(INPUT_STRING_NAME);
            FileReader fr = new FileReader(inFile);
            BufferedReader br = new BufferedReader(fr);
            String inline = null;

            int T = Integer.parseInt(br.readLine());
            while (T-- > 0) {

            }
            br.close();
            fr.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
