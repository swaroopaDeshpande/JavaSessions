package InterviewPrograms;

public class StringManuapulationFunctionsConcept {

	public static void main(String[] args) {

		String str = "The rains have started here selenium";
		String str1 = "The rains have started here Selenium";

		System.out.println(str.length());

		System.out.println(str.charAt(5));

		System.out.println(str.indexOf("s"));// 1st occ of s

		System.out.println(str.indexOf("s", str.indexOf("s") + 1));// 2nd occ of
																	// s

		System.out.println(str.indexOf("s", str.indexOf("s", str.indexOf("s") + 1) + str.indexOf("s")));// 3rd
																										// occ

		System.out.println(str.lastIndexOf("have"));

		System.out.println(str.lastIndexOf("hello"));

		// String Comparison
		System.out.println(str.equals(str1));

		System.out.println(str.equalsIgnoreCase(str1));

		// SubString

		System.out.println(str.substring(0, 9));// it will ignore 9th position

		// trim:remove spaces
		String s = " hello world ";
		System.out.println(s.trim());

		// replace
		System.out.println(s.replace(" ", ""));

		String date = "01/2/1985";
		System.out.println(date.replace("/", "-"));

		// spilt
		String test = "Hello_World";
		String testval[] = test.split("_");

	}

}
