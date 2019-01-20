import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
public class Problem3 {
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
                
                // get N
                boolean validTri = false;
                String[] triangleArray = inLine.split("\\s*,\\s*");
               
                int side1 = Integer.parseInt(triangleArray[0]);
                int side2 = Integer.parseInt(triangleArray[1]);
                int side3 = Integer.parseInt(triangleArray[2]);
                if(side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
                	validTri = true;
                }
                
                if (validTri == true) {
                	if (side1 == side2 && side1 == side3) {
                		System.out.println("Equilateral");
                	} else if ((side1 == side2 && side1 != side3) || (side1 == side3 && side1 != side2) || (side2 == side3 && side2 != side1)) {
                		System.out.println("Isosceles");
                	} else {
                		System.out.println("Scalene");
                	}
                } else {
                	System.out.println("Not a valid triangle");
                }
	        }
	        
	        br.close();
	        fr.close();
		} catch (Exception e) {
            e.printStackTrace();
        }
	}
}
