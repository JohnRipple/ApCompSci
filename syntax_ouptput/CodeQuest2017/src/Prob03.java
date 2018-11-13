import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
public class Prob03 {
	private static final String INPUT_FILE_NAME = "Prob03.in.txt";
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
                
                // get N
                String[] s = inLine.split("\\s+");
                int a = Integer.parseInt(s[0]);
                int b = Integer.parseInt(s[1]);
                int c = a + b;
                int d = a * b;
                System.out.println(c + " " + d);
                T--;
	        }
	        
	        br.close();
	        fr.close();
		} catch (Exception e) {
            e.printStackTrace();
        }
	}
}

