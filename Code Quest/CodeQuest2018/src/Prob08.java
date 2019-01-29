import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.DecimalFormat;
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
                String[] in = inLine.split("\\s");
                double[] inputs = new double[in.length];
                DecimalFormat df = new DecimalFormat("000.00");
                double temp = 0.00;
                for(int i = 0; i < in.length; i++) {
                	inputs[i] = Double.parseDouble(in[i]);
                	inputs[i] = inputs[i] - 180;
                	if(inputs[i] < 0) {
                		inputs[i] += 360;
                	}
                	System.out.print(df.format(inputs[i]) + " ");
                }
                System.out.println();
                
                T--;
	        }
	        
	        br.close();
	        fr.close();
		} catch (Exception e) {
            e.printStackTrace();
        }
	}
}