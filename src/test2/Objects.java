package test2;

public class Objects {
	
		int x=10;
		
		static void test()//static method can be accessed without creating obj of class
		{
			 System.out.println("Hello World!");
		}
		
		public void mypublicmethod() {
		    System.out.println("public methods can be called with creating objects");
		  }

	public static void main(String[] args) 
	{
		Objects t= new Objects();
		test();//static method
		t.mypublicmethod();//public method
		System.out.println(t.x);

	}

}
