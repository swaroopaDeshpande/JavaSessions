package Collections;

import java.util.HashMap;

public class DataUsingHashMap {

	public static HashMap<String, String> getUserLoginInfo() {
		// store login credential
		HashMap<String, String> userMap = new HashMap<String, String>();
		userMap.put("Customer", "naveenk_test@123");
		userMap.put("admin", "adminuser_test@123");
		return userMap;
	}

	public HashMap<Integer, String> monthMap() {
		// store login credential
		HashMap<Integer, String> monthMap = new HashMap<Integer, String>();
		monthMap.put(1, "January");
		monthMap.put(2, "February");
		monthMap.put(2, "March");
		monthMap.put(2, "April");
		monthMap.put(2, "May");
		monthMap.put(2, "June");
		monthMap.put(2, "July");
		monthMap.put(2, "August");
		monthMap.put(2, "Sepetember");
		monthMap.put(2, "October");
		monthMap.put(2, "November");
		monthMap.put(2, "December");
		return monthMap;
	}

}
