package Collections;

import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Test");
		ll.add("Selenium");
		ll.add("UFT");

		// print
		System.out.println(ll);

		// add first
		ll.addFirst("Hello");
		// add last

		ll.addLast("World");
		
		System.out.println(ll);
		//get
		System.out.println(ll.get(0));
		//set
		ll.set(0, "Jerry");
		System.out.println(ll.get(0));
		
		

	}

}
