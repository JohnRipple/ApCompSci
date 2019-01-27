import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
public class Prob09 {
	private static final String INPUT_FILE_NAME = "Prob09.in.txt";
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
	        	ArrayList<Character> c = new ArrayList<Character>();
	        	ArrayList<Character> c2 = new ArrayList<Character>();
	        	String alphabet = "abcdefghijklmnopqrstuvwxyz ";
	        	for(int i = 0; i < alphabet.length(); i++) {
	        		c.add(alphabet.toUpperCase().charAt(i));
	        	}
	        	
                inLine = br.readLine();
                char[] inLine2 = inLine.toCharArray();
                String cipher = br.readLine();
                char[] cip = cipher.toCharArray();
                int[] letterPos = new int[cipher.length()];
                int counter = 0;
                int alphCounter = 0;
                String product = "";
                for(int i = 0; i < cipher.length(); i++) {
                	letterPos[i] = c.indexOf(cip[i]);
                }
                for(int i = 0; i < inLine.length(); i++) {
                	if(counter >= cipher.length()) {
                		counter = 0;
                	}
                	alphCounter = 0;
                	for(int j = 0; j < alphabet.length(); j++) {

	                		if (j < alphabet.length() - letterPos[counter]) {
	                			c2.add(alphabet.toUpperCase().charAt(letterPos[counter] + j));
	                		} else {
	                			c2.add(alphabet.toUpperCase().charAt(alphCounter));
	                			alphCounter++;
	                		}
                	}
                	product = product + "" + c2.get(c.indexOf(inLine2[i]));   
                	counter++;
                	c2.clear();
                }
                System.out.println(product);
                T--;
	        }
	        
	        br.close();
	        fr.close();
		} catch (Exception e) {
            e.printStackTrace();
        }
	}
}