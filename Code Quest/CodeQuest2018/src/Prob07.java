import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
public class Prob07 {
	private static final String INPUT_FILE_NAME = "Prob07.in.txt";
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
                int n = Integer.parseInt(br.readLine());
                ArrayList<Integer> counter = new ArrayList<Integer>();
                for(int j = 0; j < n; j++) {
	                inLine = br.readLine();
	                String[] inputs = inLine.split("");
	                ArrayList<String> palindrome = new ArrayList<String>();
	                ArrayList<String> palindrome2 = new ArrayList<String>();
	                
	                for(int i = 0; i < inputs.length; i++) {
	                	if(!inputs[i].equals(" ")) {
	                		palindrome.add(inputs[i].toLowerCase());
	                		palindrome2.add(inputs[i].toLowerCase());
	                	}
	                }
	                Collections.reverse(palindrome2);
	                if(!palindrome.equals(palindrome2)) {
	                	counter.add(j+1);
	                }
                }
                if (counter.isEmpty()) {
                	System.out.println("True");
                } else {
                	System.out.print("False -");
                	for(int i = 0; i < counter.size(); i++) {
                		System.out.print(" " + counter.get(0)); 
                		if (i < counter.size()-1) {
                			System.out.print(",");
                		}
                	}
                	System.out.println();
                }
                T--;
	        }
	        
	        br.close();
	        fr.close();
		} catch (Exception e) {
            e.printStackTrace();
        }
	}
}