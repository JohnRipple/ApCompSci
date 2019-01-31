import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
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
                inLine = br.readLine();
                String[] inputs = inLine.split(",");
                ArrayList<Integer> sort = new ArrayList<Integer>();
                sort.add(Integer.parseInt(inputs[0]));
                sort.add(Integer.parseInt(inputs[1]));
                Collections.sort(sort);
                Collections.reverse(sort);
                int minuend = sort.get(0);
                int subtrahend = sort.get(1);
                int difference = -1;
                while(difference != 0) {
                	difference = minuend-subtrahend; 
                	System.out.println(minuend + "-" + subtrahend + "=" + difference);
                	if(subtrahend > difference && difference != 0) {
                		minuend = subtrahend; 
                    	subtrahend = difference;
                	} else if (difference != 0) {
                		minuend = difference;
                	}
                }
                if (minuend == 1 && subtrahend == 1) {
                	System.out.println("COPRIME");
                } else {
                	System.out.println("NOT COPRIME");
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