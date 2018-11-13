import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
public class Prob04 {
	private static final String INPUT_FILE_NAME = "Prob04.in.txt";
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
                int a = Integer.parseInt(inLine);
                int b = 0;
                int c = 1;
                int d = 0;
                for(int i = 1; i < a-1; i++) {
                	d = b + c;
                	if (i % 2 == 0) {
                		c = d;
                	} else {
                		b = d;
                	}
                }
                System.out.println(a + " = " + d);
                
                T--;
	        }
	        
	        br.close();
	        fr.close();
		} catch (Exception e) {
            e.printStackTrace();
        }
	}
}

