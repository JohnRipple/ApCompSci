import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.Arrays;
public class Prob05 {
	private static final String INPUT_FILE_NAME = "Prob05.in.txt";
	public static void main(String[] args) {
		try {
		    // prepare to read the file
	        File inFile = new File(INPUT_FILE_NAME);
	        FileReader fr = new FileReader(inFile);
	        BufferedReader br = new BufferedReader(fr);
	        String inLine = null;
	        String inLine2 = null;
	        
	        // get the number of test cases
	        int T = Integer.parseInt(br.readLine());
	        
	        while (T > 0) {
	        	// read the line of text
                inLine = br.readLine();
                inLine2 = br.readLine();
                
                //Get n
                String[] a = inLine.split(",");
                String[] b = inLine2.split(",");
                
                int bothY = 0;
                Arrays.sort(a);
                Arrays.sort(b);
                int len = a.length;
                if (a.length < b.length) {
                	len = b.length;
                }
                String[] bothYears = new String[len];
                String[] lastYear = new String[len];
                String[] thisYear = new String[len];
                int lastY = 0;
                int thisY = 0;
                int check = 0;
                int check2 = 0;
                for(int i = 0; i < len; i++) {
                	check = 0;
                	for(int j = 0; j < len; j++) {
                		if(a[i].equals(b[j])) {
                			bothYears[bothY] = a[i];
                			bothY++;
                			check++;
                		} 
                	}
                	if(check == 0) {
                		lastYear[lastY] = a[i];
                		lastY++;
                	} 
                }
                
                for(int i = 0; i < len; i++) {
                	check2 = 0;
                	for(int j = 0; j < len; j++) {
                		if(!b[i].equals(a[j])) {
                			check2++;
                		}
                	}
                	if(check2 == len) {
                		thisYear[thisY] = b[i];
                		thisY++;
                	}
                }
                
                for(int i = 0; i < lastY; i++) {
                	System.out.print(lastYear[i]);
                	if(i < lastY-1) {
                		System.out.print(",");
                	} else {
                		System.out.println("");
                	}
                }
                for(int i = 0; i < bothY; i++) {
                	System.out.print(bothYears[i]);
                	if(i < bothY-1) {
                		System.out.print(",");
                	} else {
                		System.out.println("");
                	}
                }
                
                for(int i = 0; i < thisY; i++) {
                	System.out.print(thisYear[i]);
                	if(i < thisY-1) {
                		System.out.print(",");
                	} else {
                		System.out.println("");
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

