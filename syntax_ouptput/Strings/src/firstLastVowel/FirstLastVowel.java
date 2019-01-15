package firstLastVowel;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
 public static String go( String a )
	{
		if (a.substring(0, 1).toLowerCase() == "a" || a.substring(0, 1).toLowerCase() == "e" || a.substring(0, 1).toLowerCase() == "i" || a.substring(0, 1).toLowerCase() == "o" || a.substring(0, 1).toLowerCase() == "u") {
			return "yes";
			
		} else if (a.substring(a.length()-1).toLowerCase() == "a" || a.substring(a.length()-1).toLowerCase() == "e" || a.substring(a.length()-1).toLowerCase() == "i" || a.substring(a.length()-1).toLowerCase() == "o" || a.substring(a.length()-1).toLowerCase() == "u") {
			return "yes";
		}
		return "no";
	}
}