import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Prob09 {
    public static String INPUT_FILE_NAME = "Prob09.txt";
    public static void main(String[] args){
        try {
            File inFile = new File(INPUT_FILE_NAME);
            FileReader fr = new FileReader(inFile);
            BufferedReader br = new BufferedReader(fr);
            String inLine = null;
            while((inLine = br.readLine()) != null){
                int num = Integer.parseInt(inLine);
                String[] b = Integer.toBinaryString(num).split("");
                int[] binary = new int[b.length];
                int zero = 0;
                int one = 0;
                for (int i = 0; i < b.length; i++ ){
                    binary[i] = Integer.parseInt(b[i]);
                    if (binary[i] == 0) {
                        zero++;
                    } else {
                        one++;
                    }
                }
                if( zero > one){
                    System.out.println(num + " Light");
                } else if (one > zero) {
                    System.out.println(num + " Heavy");
                } else {
                    System.out.println(num + " Balanced");
                }
            }

        } catch (Exception e){
            System.out.println(e);
        }
    }
}
