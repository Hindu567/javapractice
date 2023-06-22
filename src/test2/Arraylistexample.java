package test2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Arraylistexample {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("hero");
		cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    cars.add("BMW");
	    System.out.println(cars);
	    Collections.sort(cars);
	    System.out.println(cars);
	    
	    cars.remove(2);
	    System.out.println(cars);
	   System.out.println(cars.get(0)); 
	   System.out.println(cars.set(3, "test"));
	   System.out.println(cars.size());
	   
//	String[] arr= new String[]{"HIndu", "Sindu", "Pardu"};
	   String [] arr = {"Mango", "Apple", "Grapes", "Papaya", "Pineapple", "Banana", "Orange"};
	   Arrays.sort(arr, Collections.reverseOrder());  
	System.out.println(arr);
	   
	}

}
