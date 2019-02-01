import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.stream.Collectors;
public class Prob14 {
	private static final String INPUT_FILE_NAME = "Prob14.in.txt";
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
                int U = Integer.parseInt(br.readLine());
                String[] ULines = br.readLine().split("\\s");
                int[] Unum = new int[ULines.length];
                for(int i = 0; i < ULines.length; i++) {
                	Unum[i] = Integer.parseInt(ULines[i]);
                }
                int L = Integer.parseInt(br.readLine());
                String[] LLines = br.readLine().split("\\s");
                int[] Lnum = new int[LLines.length];
                for(int i = 0; i < LLines.length; i++) {
                	Lnum[i] = Integer.parseInt(LLines[i]);
                }
                String line = br.lines().collect(Collectors.joining());
                String line2 = line;
                line2 = line2.replaceAll("[A-Z]", "").replaceAll("-", "").replaceAll("=", " ");
                line = line.replaceAll("[a-z]", "").replaceAll("=", "").replaceAll("-", " ");
                String[] output = line.split("");
                int counter = 0;
                int ep = 0;
                int ep2 = 0;
                while (counter < Unum.length-1) {
                	ep += Unum[counter];
                	System.out.println(line.substring(ep2, ep));
                	ep2 += Unum[counter];
                	counter++;
                }
                counter = 0;
                ep = 0;
                ep2 = 0;
                while (counter < Lnum.length-1) {
                	ep += Lnum[counter];
                	System.out.println(line2.substring(ep2, ep));
                	ep2 += Lnum[counter];
                	counter++;
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