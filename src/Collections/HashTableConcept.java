package Collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {
		Hashtable h1 = new Hashtable();
		h1.put(1, "Tom");
		h1.put(2, "Test");
		h1.put(3, "Selenium");

		// create a clone copy/shallow copy:
		Hashtable h2 = new Hashtable();
		h2 = (Hashtable) h1.clone();

		System.out.println(h1);
		System.out.println(h2);

		h1.clear();
		System.out.println(h1);
		System.out.println(h2);

		Hashtable st = new Hashtable();
		st.put("a", "Swaroopa");
		st.put("b", "Senior AUtomation Engineer");
		st.put("c", "Selenium");

		if (st.containsValue("Swaroopa")) {
			System.out.println("value is found");
		}

		// to get all values from Hashtable-Enumeration--elements()
		Enumeration e = st.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

		// using enterySet()
		Set s = st.entrySet();
		System.out.println(s);

		Hashtable st1 = new Hashtable();
		st1.put("a", "Swaroopa");
		st1.put("b", "Senior AUtomation Engineer");
		st1.put("c", "Selenium");
		st1.put("c", "Selenium");// it contains only unique values as well as it
									// cannot define any numm key or value
		// st1.put(null, "selenium");//null pointer execption
		// st1.put("B", null);//null pointer execption

		// both hashtable object equal or not

		if (st.equals(st1))

		{
			System.out.println("both are equal");
		}

		// get value from key
		System.out.println(st.get("a"));

		// get hashcode of hashtable object
		System.out.println(st.hashCode());

	}

}
