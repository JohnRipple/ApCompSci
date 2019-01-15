package social;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class Social
{
 public static String go( String a )
	{
	 	String s;
		if(a.indexOf("-") == 3) {
			s = a.substring(4);
			if (s.indexOf("-") == 2) {
				return a.substring(7);
			}
			return "bad";
		}
		return "bad";
	}
}



/*

EXPECTED RUNNER OUTPUT

good
bad
good
bad
good
good
bad
bad




*/