package Collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcepts {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		// Add values
		hm.put(1, "Selenium");
		hm.put(2, "QTP");
		hm.put(3, "TestComplete");
		hm.put(4, "RFT");
		// fetch values from particukar key

		System.out.println(hm.get(1));
		// 4th values key not present so it will return null as it will not
		// store value on basis of index
		System.out.println(hm.get(4));
		
		//how to iterate:use Entry and entrySet()
		for(Entry e: hm.entrySet())
		{
		System.out.println(e.getKey()+" "+e.getValue());	
		}
		hm.remove(3);
		System.out.println(hm);
		
		//store employee obj 
		
		
		
		
	}

	HashMap<Integer,Employee> emp=new HashMap<Integer,Employee> ();
	
	Employee e1=new Employee("Tom","Admin",25);
	Employee e2=new Employee("Jerry","QA",21);
	Employee e3=new Employee("S","Dev",28);
	

	
	
	

	
	
}
