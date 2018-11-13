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
                
                int n = inLine.length()-2;
                int num = Integer.parseInt(inLine.substring(n+1, inLine.length()));
                String w = inLine.substring(0, n);
                // get N
                //double n = Double.parseDouble(inLine);
                char[] c = w.toCharArray();
                for(int i = 0; i < w.length(); i++) {
                	if(i == num) {
                	} else {
                		System.out.print(c[i]);
                	}
                }
                System.out.println("");
               T--;
	        }
	        
	        br.close();
	        fr.close();
		} catch (Exception e) {
            e.printStackTrace();
        }
	}
}

