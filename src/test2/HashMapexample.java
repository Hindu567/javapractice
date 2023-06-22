package test2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class HashMapexample {

	public static void main(String[] args) {
		HashMap<String, String> hash= new HashMap<String, String>();
		hash.put("Test1", "1");
		hash.put("Test2", "2");
		System.out.println(hash);
		System.out.println(hash.get("Test1"));
		System.out.println(hash.remove("Test2"));
		System.out.println(hash);
		hash.put("Test2", "2");
		hash.put("Test3", "3");
		
		for(String i: hash.keySet())
		{System.out.println(i);
			}
		
		for(String i: hash.values())
		{System.out.println(i);
			}
		HashMap<String, Integer> people = new HashMap<String, Integer>();
		
		 people.put("John", 32);
	/***********************HashSet***************/
		 
		 HashSet<String> cars = new HashSet<String>();
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("BMW");
		    cars.add("Mazda");
		    System.out.println(cars);
		    Iterator<String> it = cars.iterator();
		  System.out.println(it.next());
		    
		    while(it.hasNext())
		    { System.out.println(it.next());
		    	
		    }
		   
		 //   System.out.println(cars);
		
			}

}
