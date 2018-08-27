package InterviewPrograms;

import java.util.HashMap;

public class HashmapCompare {

	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(10, "Swaroopa");
		hm.put(20, "Deshpande");
		
		HashMap hm1=new HashMap();
		hm1.put(10, "Swaroopa");
		hm1.put(20, "Deshpande");
		
		Boolean flag=hm.equals(hm1);
		if(flag==true)
		{
			System.out.println("both Hashmap are equal");
		}
		else
		{
			System.out.println("Both are not equal");
		}

		
		
		

	}

}
