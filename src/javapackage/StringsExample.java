package javapackage;

public class StringsExample {

	public static void main(String[] args) {


		String s = "Test";
		System.out.println(s.isEmpty());
	s=	s.concat("main");
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.charAt(6));
		System.out.println(s.substring(3));
		System.out.println(s.substring(2, 7));
		System.out.println(s.concat(" again"));
		System.out.println(s.indexOf("a"));
		System.out.println(s.indexOf("a", 3));
		System.out.println(s.lastIndexOf("t"));

	}

}
