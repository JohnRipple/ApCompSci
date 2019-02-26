import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Prob11 {
    private static final String INPUT_FILE_NAME = "Prob11.in.txt";
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
                String[] s = inLine.split("");
                ArrayList<String> n = new ArrayList<String>();
                ArrayList<Integer> up = new ArrayList<Integer>();
                String[] s1 = inLine.split("[,\\s?!]+");
                String[] end = new String[s1.length];
                String fin = "";
                char[] c = inLine.toCharArray();
                ArrayList<String> temp = new ArrayList<String>();
                for(int i = 0; i < c.length; i++) {
                    if(Character.isUpperCase(c[i])){
                        up.add(i);
                    }
                }

                for(int i = 0; i < s.length; i++){
                    if(s[i].equals(",") || s[i].equals("?") || s[i].equals("!")) {
                        n.add(String.valueOf(i));
                        n.add(s[i]);
                    }
                }

                for(int i = 0; i < end.length; i++){
                    end[i] = "";
                }
                for(int i = 0; i < s1.length; i++){
                    for(int j = s1[i].length() - 1; j > -1; j--){
                        end[i] += s1[i].charAt(j);
                    }

                    fin += end[i].toLowerCase();
                    if(i < end.length-1){
                        fin += " ";
                    }
                }
                for(int i = 0; i < fin.length(); i++){
                    temp.add(String.valueOf(fin.charAt(i)));
                }

                for(int i = 0; i < n.size(); i += 2){
                    temp.add(Integer.parseInt(n.get(i)),n.get(i+1));
                }
                for(int i = 0; i < up.size(); i++){
                    temp.add(up.get(i), temp.get(i).toUpperCase());
                    temp.remove(up.get(i)+1);
                }
                String que = "";
                for(int i = 0; i < temp.size(); i++){
                    que += temp.get(i);
                }
                    System.out.println(que);


                T--;
            }

            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

