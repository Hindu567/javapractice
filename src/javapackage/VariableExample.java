package javapackage;

public class VariableExample 

{

	// Static variable
    static int a= 100 ;
    
    // Instance variable
    String b;        

    public VariableExample() 
    {
    	this.b="test";
    }
    public static void main(String[] args)
    {
    	
    	System.out.println(VariableExample.a);
    	
    	VariableExample var= new VariableExample();
    	
    	System.out.println(var.b);
    }
}
