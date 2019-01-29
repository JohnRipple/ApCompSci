import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
public class Prob05 {
	private static final String INPUT_FILE_NAME = "Prob05.in.txt";
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
                int n = Integer.parseInt(inLine);
                int in = n;
                int counter = 0;
                while(n != 1) {
                	if (n % 2 == 0) {
                		n = n/2;
                	} else {
                		n = (n*3)+1;
                	}
                	counter++;
                }
                System.out.println(in + ":" + (counter + 1));
                
                
                T--;
	        }
	        
	        br.close();
	        fr.close();
		} catch (Exception e) {
            e.printStackTrace();
        }
	}
}