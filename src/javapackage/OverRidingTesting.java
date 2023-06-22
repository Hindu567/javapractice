package javapackage;

public class OverRidingTesting {

	public static void main(String[] args) 
	{
		
		//OverRidingTesting test = new OverRidingTesting();
		show();
		OverridingTestParent par=new OverridingTestParent();
		OverridingChild child=new OverridingChild();
		OverridingTestParent child1= new OverridingChild();
	
		par.show();
		child.show();
		child1.show();
		

	}
	
	public static void show()
	{
		System.out.println("static test");
	}

}
