package javapackage;

interface A{
	void a();
	void b();
}
class B implements A {
	
	public  void a() {
		System.out.println("a");
	}
	public  void b() {
		System.out.println("b");
	}
	
}

public class InterfaceExample {

	public static void main(String[] args) {

			A s= new B();
			s.a();
			s.b();
	}

}
