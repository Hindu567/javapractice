package test2;

public class Strings {

	public static void main(String[] args) {


		String name ="test hindu mathi";
		String name2="hindu";
		String t= name+name2;
	System.out.println(t);
		
		int count= name.split(" ").length;
		System.out.println(count);
		System.out.println(name.charAt(2));
		System.out.println(name.compareTo(name2));
		System.out.println(name.concat(name2));
		
		//boolean output
		System.out.println(name.contains(name2));//true
		System.out.println(name.endsWith("t"));  //false
		System.out.println(name.equals(name));//true
		System.out.println(name2.equals("HINDU"));//false
		System.out.println(name2.equalsIgnoreCase("HINDU"));//true
		
		System.out.println(name.indexOf("hindu"));
		System.out.println(name.indexOf("u"));
		System.out.println(name.indexOf("0"));
		
		String s1="";  
		String s2="javat point";  
		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());
		
		System.out.println(String.join("/", "welcome", "you"));
		System.out.println(name.lastIndexOf("i"));
		System.out.println(name.length());
		String rep= "tttttt";
		System.out.println(rep.replace('t', 'e'));
		
		String s3= "java string split method by javatpoint";    
		System.out.println(s1.startsWith("Ja"));  // false  
		System.out.println(s1.startsWith("j"));   // true 
		System.out.println(s3.substring(2, 6));
		System.out.println(s3.substring(6));
		
		String s4="hindu";
		char[] ch =s4.toCharArray();
		System.out.println(ch.length);
		for (char c: ch)
		{
			System.out.println(c);
		}
		
		String s5="HINDU";
		System.out.println(s5.toLowerCase());
		String s6="hindu";
		System.out.println(s6.toUpperCase());
	}

}
