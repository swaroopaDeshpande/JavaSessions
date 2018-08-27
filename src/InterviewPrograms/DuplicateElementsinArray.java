package InterviewPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementsinArray {

	public static void main(String[] args) {

		String names[] = { "Java", "JavaScript", "Ruby", "C", "Python", "Java" };

		// compare each element

		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[i].equals(names[j])) {
					System.out.println("Duplicate element is " + names[i]);
				}
			}

			// 2.HashSet

			Set<String> store = new HashSet<String>();
			for (String name : names) {
				if (store.add(name) == false) {
					System.out.println("Duplicate element is " + name);
				}
			}

			// 3.using hashMap
			// Duplicate values allows
			Map<String,Integer> storeMap= new HashMap<String,Integer>();
			for(String name:names)
			{
				Integer count=storeMap.get(name);
				if(count==null)
				{
					storeMap.put(name, 1);
				}
				else{
					storeMap.put(name, ++count);
				}
				//iterator:Get values from hashMap
				
				Set<Entry<String,Integer>> set=storeMap.entrySet();
				
					
			}
			

		}

	}

}
