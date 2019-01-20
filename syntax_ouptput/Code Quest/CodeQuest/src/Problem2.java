import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
public class Problem2 {
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
                
                // get N
                double n = Double.parseDouble(inLine.substring(1));
                double t = (n*100)%25;
                int quarters = (int)((n*100)/25);
                int dimes = (int)(t/10);
                int r = (int)(t%10);
                int nickels = (int)(r/5);
                int l = (int)(r%5);
                int pennies = (int)(l);
                System.out.println(inLine);
                System.out.println("Quarters=" + quarters);
                System.out.println("Dimes=" + dimes);
                System.out.println("Nickels=" + nickels );
                System.out.println("Pennies=" + pennies);
	        }
	        
	        br.close();
	        fr.close();
		} catch (Exception e) {
            e.printStackTrace();
        }
	}
}
