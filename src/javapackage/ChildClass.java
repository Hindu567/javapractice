package javapackage;

public class ChildClass extends ParentClass{
	
	void test() 
	{
		  System.out.println("This is Child class");
	}

	void displayTest()
    {
        // will invoke or call current
            test();
 
        // will invoke or call parent
     super.test();
    }
}
