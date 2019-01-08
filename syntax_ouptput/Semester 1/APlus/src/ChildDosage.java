import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.DecimalFormat;
public class ChildDosage {
	private static final String INPUT_FILE_NAME = "pr23.dat";
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
                String inLine2 = br.readLine();
                Integer childAge = Integer.parseInt(inLine); 
                double c = (double)childAge;
                Double adultDosage = Double.parseDouble(inLine2);
                DecimalFormat df = new DecimalFormat("###.000");
                double dosage = ( c / (c + 12) ) * adultDosage;
                System.out.println(df.format(dosage));
                T--;
	        }
	        
	        br.close();
	        fr.close();
		} catch (Exception e) {
            e.printStackTrace();
        }
	}
}