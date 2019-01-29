import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.DecimalFormat;
public class Prob06 {
	private static final String INPUT_FILE_NAME = "Prob06.in.txt";
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
                String[] color = {"OFF", "RED", "GREEN", "BLUE"};
                int[] condition = {0,1,2,3};
                int bat = 8, heat = 4, water = 2, temp = 1;
                int total = 0;
                int total2 = 0;
                for(int i = 0; i < inputs.length; i++) {
                	if(inputs[i].equals("BROKEN")) {
                		if (i == 0) {
                			total += bat;
                		} else if (i == 1) {
                			total += heat;
                		} else if (i == 2) {
                			total += water;
                		} else if (i == 3 ) {
                			total += temp;
                		}
                	}
                }
                if (total == total2) {
                	System.out.println(color[0] + " " + color[0]);
                }
                while(total2 != total) {
                	int rand = (int)(Math.random() * 4) ;
                	int rand2 = (int)(Math.random() * 4) ;
                	
                	total2 = (condition[rand] * 4) + condition[rand2];
                	if(total2 == total) {
                		System.out.println(color[rand] + " " + color[rand2]);
                	}
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