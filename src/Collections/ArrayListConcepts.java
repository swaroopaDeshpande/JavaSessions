package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcepts {

	public static void main(String[] args) {

		// Properties of arrayList
		// 1.Can store duplicate values
		// 2.it maintain Insertion order
		// 3.Synchronized(Thread safe)--Slow
		// 4.Random access to elements : as store value on index basis

		// How to use arraylist for user defined class objects
		// 1.Create class level vars
		// 2.Create Employee class with its constructor
		// 3.ArrayList create of type employee
		// 4.Create object of employee(User defined class)
		// 5.give that ref to arraylist and add
		// 6.Retrieve valued via Iterator=>We have Iterator Method in
		// arrayList(HasNext(),isNext())

		ArrayList arrlist = new ArrayList();

		arrlist.add("Swaroopa");// 0
		arrlist.add(30);// 1
		arrlist.add("Sodtware");// 2
		arrlist.add('F');// 3

		System.out.println(arrlist.size());
		arrlist.add(4);
		System.out.println(arrlist.size());

		// To Print all values of arrayList
		// 1.For loop
		// 2. Iterator

		// 1.For Loop
		for (int i = 0; i < arrlist.size(); i++) {
			System.out.println(arrlist.get(i));
		}
		ArrayList<String> arrStr = new ArrayList<String>();
		arrStr.add("Test123");
		// arrStr.add(10);
		arrStr.add("Seleneium");
		System.out.println("******************************");

		// 1.Create Employee object
		Employee emp = new Employee("Jerry", "QA", 25);
		Employee emp1 = new Employee("Tom", "Dev", 30);
		Employee emp2 = new Employee("Dolly", "Admin", 31);

		// 2.Create ArrayList with generics
		ArrayList<Employee> e1 = new ArrayList<>();
		e1.add(emp);
		e1.add(emp1);
		e1.add(emp2);

		// 3.Retrieve valued via Iterator=>We have Iterator Method in arrayList
		// itself
		Iterator<Employee> it = e1.iterator();
		while (it.hasNext()) {
			Employee employee = it.next();
			System.out.println(employee.name);
			System.out.println(employee.dept);
			System.out.println(employee.age);
		}

		System.out.println("****************");

		// addAll()-adding second list to first list
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("test");
		ar5.add("Selenium");
		ar5.add("QTP");

		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("Dev");
		ar6.add("Java");
		ar6.add("Javascript");

		ar5.addAll(ar6);
		for (int i = 0; i < ar5.size(); i++) {
			System.out.println(ar5.get(i));
		}

		System.out.println("******************");
		// removeAll: remove 2nd array list from 1st
		ar5.removeAll(ar6);
		for (int i = 0; i < ar5.size(); i++) {
			System.out.println(ar5.get(i));
		}

		System.out.println("********************");

		// retainAll:only common part get printed.
		ArrayList<String> ar7 = new ArrayList<String>();
		ar7.add("java");
		ar7.add("Test");

		ArrayList<String> ar8 = new ArrayList<String>();
		ar8.add("java");
		ar8.add("Selenium");

		ar7.retainAll(ar8);

		for (int i = 0; i < ar7.size(); i++) {
			System.out.println(ar7.get(i));
		}
	}

}
