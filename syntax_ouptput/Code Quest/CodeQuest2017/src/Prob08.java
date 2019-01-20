import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
public class Prob08 {
	private static final String INPUT_FILE_NAME = "Prob08.in.txt";
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
                
                String[] a = inLine.split("\\s");
                double b = Double.parseDouble(a[0]);
                double d = b * 1000000;
                double s = Double.parseDouble(a[1]);
                double totalTime = d/s;
                int days = (int)totalTime/24;
                String c = Double.toString(totalTime/24);
                String[] e = c.split("\\.");
                e[1] = "." + e[1];
                double h = Double.parseDouble(e[1]);
                int hours = (int)(h*24);
                
                c = Double.toString(h*24);
                e = c.split("\\.");
                e[1] = "." + e[1];
                double m = Double.parseDouble(e[1]);
                int minutes = (int)(m*60);
                
                c = Double.toString(m*60);
                e = c.split("\\.");
                e[1] = "." + e[1];
                double sec = Double.parseDouble(e[1]);
                int seconds = (int)(sec*60);
                System.out.println("Time to Mars: " + days + " days, " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
                
                
                T--;
	        }
	        
	        br.close();
	        fr.close();
		} catch (Exception e) {
            e.printStackTrace();
        }
	}
}

