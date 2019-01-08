import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
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
	        	// read the line of text
	        	double bb = 0, k = 0, b1 = 0, b2 = 0, b3 = 0, hr = 0;
	 	        double totalBat = 0;
                inLine = br.readLine();
                String[] a = inLine.split(":");
                String[] b = a[1].split(",");
                for(int i = 0; i < b.length; i++) {
                	if(b[i].equals("BB")) {
                		bb++;
                	} else if (b[i].equals("K")) {
                		k++;
                		totalBat++;
                	} else if (b[i].equals("1B")) {
                		b1++;
                		totalBat++;
                	} else if (b[i].equals("2B")) {
                		b2++;
                		totalBat++;
                	} else if (b[i].equals("3B")) {
                		b3++;
                		totalBat++;
                	} else if (b[i].equals("HR")) {
                		hr++;
                		totalBat++;
                	}
                }
                
                double result = (((1*b1)+(2*b2)+(3*b3)+(4*hr))/totalBat);
                DecimalFormat decim = new DecimalFormat("#.000");
                System.out.println(a[0] + "=" + decim.format(result));
                
                
                T--;
	        }
	        
	        br.close();
	        fr.close();
		} catch (Exception e) {
            e.printStackTrace();
        }
	}
}

