package javapackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		
		System.out.println(Pattern.matches("test", "Test"));
		 Pattern pat = Pattern.compile("geeks");
		 Matcher m = pat.matcher("geeksforgeeks.org");
		 while(m.find())
		 {
			 System.out.println( "Pattern found at " + " "+ m.start() +" "+"to "+ m.end());
		 }
	}

}
