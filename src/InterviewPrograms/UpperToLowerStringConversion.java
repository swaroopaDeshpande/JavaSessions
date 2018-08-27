package InterviewPrograms;

import java.util.Arrays;

public class UpperToLowerStringConversion {

	public static void main(String[] args) {
		// Change a string such that first character is upper case, second is
		// lower case and so on.
		String str = "my name is Bokesh";

		for (int i = 0; i < str.length(); i++) {
		    char ch = str.charAt(i);

			if (i % 2 == 0)
				
				System.out.println(Character.toUpperCase(ch));
			else
				System.out.println(Character.toLowerCase(ch));
		}
		

	}

}
