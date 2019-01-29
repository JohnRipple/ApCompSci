import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
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
                String[] inputs = inLine.split("\\s");
                int counter = 0;
                int r = 0, p = 0, s = 0;
                ArrayList<String> lis = new ArrayList<String>();
                for(int i = 0; i < inputs.length; i++) {
                	lis.add(inputs[i]);
                }
                Collections.sort(lis);
                for(int i = 0; i < inputs.length; i++) {
                	if(counter < lis.size()-1) {
	                	if(lis.get(counter).equals(lis.get(counter+1))) {
	                		lis.remove(counter);
	                		if (lis.get(counter).equals("R")) {
	                			r++;
	                		} else if (lis.get(counter).equals("P")) {
	                			p++;
	                		} else if (lis.get(counter).equals("S")) {
	                			s++;
	                		}
	                	} else {
	                		counter++;
	                	}
                	}
                }
                counter = 0;
                for(int i = 0; i < lis.size(); i++) {
                	if(counter < lis.size()-1) {
                		if (lis.get(counter).equals("R")) {
                			if(lis.get(counter+1).equals("P")) {
                				lis.remove(counter);
                			} else if (lis.get(counter+1).equals("S")){
                				lis.remove(counter+1);
                			}
                		} else if (lis.get(counter).equals("P")) {
                			if(lis.get(counter+1).equals("S")) {
                				lis.remove(counter);
                			} else if(lis.get(counter+1).equals("R")) {
                				lis.remove(counter+1);
                			}
                		} 
                	}
                }
                if(lis.get(0).equals("R") && r == 0) {
                	System.out.println("ROCK" );
                } else if(lis.get(0).equals("P") && p == 0) {
                	System.out.println("PAPER" );
                } else if(lis.get(0).equals("S") && s == 0) {
                	System.out.println("SCISSORS" );
                } else {
                	System.out.println("NO WINNER");
                }
                
                System.out.println(lis + " R: " + r + " P: " + p + " S: " + s);
                
                
                
                T--;
	        }
	        
	        br.close();
	        fr.close();
		} catch (Exception e) {
            e.printStackTrace();
        }
	}
}