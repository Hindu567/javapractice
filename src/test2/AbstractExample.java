package test2;

abstract class test1 
{
	abstract void printInfo();
}
class Employee extends test1{
	void printInfo() 
	{
        String name = "aakanksha";
        int age = 21;
        float salary = 55552.2F;
        
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
	}	
public class AbstractExample {
	
	public static void main(String[] args) {
		test1 emp= new Employee();
		emp.printInfo();

	}

}
}
