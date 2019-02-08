import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
public class Prob03 {
	private static final String INPUT_FILE_NAME = "Prob03.in.txt";
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
                String[] inputs = inLine.split("th");
                System.out.println(inputs[1]);
                if(inLine.equals("1th")) {
                	System.out.println("1st");
                } else if (inLine.equals("2th")) {
                	System.out.println("2nd");
                } else if (inLine.equals("3th")) {
                	System.out.println("3rd");
                } else {
                	System.out.println(inLine);
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