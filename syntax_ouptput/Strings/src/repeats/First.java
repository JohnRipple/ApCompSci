package repeats;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class First
{
 public static String go( String a )
	{
	 String s;
	 String check = a.substring(0,1);
	   	if(a.contains(check)) {
	   		if(a.indexOf(check) + 1 < a.length()-1) {
	   			s = a.substring(a.indexOf(check) + 1, a.length()-1);
	   		} else {
	   			return "no";
	   		}

	   		if (s.contains(check)) {
	   			return "yes";
	   		}
	   		
	   	} 
	   	return "no";

	}
}



/*

EXPECTED RUNNER OUTPUT

no
yes
no
no
yes
no
yes
yes
no
no


*/