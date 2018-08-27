package InterviewPrograms;

public class PalindromeConcept {

	public static void main(String[] args) {
		// madam

		String str = "madam";
		String palidome = "";

		for (int i = str.length() - 1; i >= 0; i--)
			palidome = palidome + str.charAt(i);
		if (palidome.equals(str)) {
			System.out.println("String is palidrome");
		} else {
			System.out.println("String is not palidrome");
		}
	}

}
