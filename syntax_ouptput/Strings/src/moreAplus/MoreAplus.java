package moreAplus;


public class MoreAplus
{
   public static String go( String a )
	{
	   String s;
	   	if(a.contains("aplus")) {
	   		if(a.indexOf("aplus") + 5 < a.length()-1) {
	   			s = a.substring(a.indexOf("aplus") + 5, a.length()-1);
	   		} else {
	   			return "no";
	   		}

	   		if (s.contains("aplus")) {
	   			return "yes";
	   		}
	   		
	   	} 
	   	return "no";
	}
}
