import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
public class Prob01 {
	private static final String INPUT_FILE_NAME = "Prob01.in.txt";
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
                //int n = Integer.parseInt(inLine);
               
                System.out.println(inLine);
                System.out.println(inLine);
                T--;
	        }
	        
	        br.close();
	        fr.close();
		} catch (Exception e) {
            e.printStackTrace();
        }
	}
}

