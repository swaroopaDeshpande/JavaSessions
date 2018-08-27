package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapPracto {

	public static void main(String[] args) {
		// HashMap is a class which implemmts Map interface
		// inherits AbstractMap class
		// 1.It contains only and only unique elements
		// 2.stores key and value pair
		// 3.It is allowed to have one null key and multiple null values
		// 4.it maintains no insertion order
		// 5.HashMap is non Synchronized-multiple threads running,HashMap obj
		// approach by all threads running--not thread safe
		// Problem with HashMap:Failed fast : concurrent modification exception
		// if simultenously 2 threads try to modify or remove same
		// object--Failed Fast Condition u will get concurrent modification
		// exception

		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("Test", "Selenium");
		hm.put("Test1", "Ruby");
		hm.put("Test2", "Java");
		hm.put("Test3", "Paython");

		System.out.println(hm.get("Test"));

		// fetch all values we have entryset method
		for (Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		hm.remove("Test3");
		System.out.println(hm);

		// HAshMap with user created object
		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();
		Employee e1 = new Employee("Tom", "Dev", 25);
		Employee e2 = new Employee("Peter", "QA", 27);
		Employee e3 = new Employee("Steve", "Admin", 26);

		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		// traverse: Entry is interface used to traverse HashMap
		for (Entry<Integer, Employee> m : emp.entrySet()) {
			int key = m.getKey();
			Employee obj = m.getValue();
			System.out.println(key + " " + "Info");

			System.out.println(obj.name);
			System.out.println(obj.dept);
			System.out.println(obj.name);
		}

	}

}
