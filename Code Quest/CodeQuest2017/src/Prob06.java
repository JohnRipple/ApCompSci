import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
public class Prob06 {
	private static final String INPUT_FILE_NAME = "Prob06.in.txt";
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
	        Map<Character, String> map = new HashMap<>();
	        map.put('A', "Alpha");
	        map.put('B', "Bravo");
	        map.put('C', "Charlie");
	        map.put('D', "Delta");
	        map.put('E', "Echo");
	        map.put('F', "Foxtrot");
	        map.put('G', "Golf");
	        map.put('H', "Hotel");
	        map.put('I', "India");
	        map.put('J', "Juliet");
	        map.put('K', "Kilo");
	        map.put('L', "Lima");
	        map.put('M', "Mike");
	        map.put('N', "November");
	        map.put('O', "Oscar");
	        map.put('P', "Papa");
	        map.put('Q', "Quebec");
	        map.put('R', "Romeo");
	        map.put('S', "Sierra");
	        map.put('T', "Tango");
	        map.put('U', "Uniform");
	        map.put('V', "Victor");
	        map.put('W', "Whiskey");
	        map.put('X', "Xray");
	        map.put('Y', "Yankee");
	        map.put('Z', "Zulu");
	        
	        while (T > 0) {
	        	// read the line of text
                inLine = br.readLine();
                
                int n = Integer.parseInt(inLine);
                while(n > 0) {
                	inLine2 = br.readLine().toUpperCase();
                	String[] a = inLine2.split("\\s");
                	
                	for(int i = 0; i < a.length; i++) {
                		char[] c = a[i].toCharArray();
                		for(int j = 0; j < c.length; j++) {
                			System.out.print(map.get(c[j]));
                			if(j < c.length -1) {
                				System.out.print("-");
                			} else {
                				System.out.print(" ");
                			}
                		}
                	}
                	System.out.println(" ");
                	n--;
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

