import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
public class Prob02 {
	private static final String INPUT_FILE_NAME = "Prob02.in.txt";
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
                int len = inLine.length();
                
                int len2 = inLine.toUpperCase().replaceAll("A|E|I|O|U", "").length();
                System.out.println(len-len2);
                //Get n
                //int n = Integer.parseInt(inLine);
                
                
                T--;
	        }
	        
	        br.close();
	        fr.close();
		} catch (Exception e) {
            e.printStackTrace();
        }
	}
}