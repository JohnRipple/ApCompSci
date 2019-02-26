import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
public class Example {
    private static final String INPUT_FILE_NAME = "Prob0.in.txt";
    public static void main(String[] args) {
        try {
            File inFile = new File(INPUT_FILE_NAME);
            FileReader fr = new FileReader(inFile);
            BufferedReader br = new BufferedReader(fr);
            String inLine = null;

            int T = Integer.parseInt(br.readLine());

            while (T > 0) {
                inLine = br.readLine();

            }

            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

