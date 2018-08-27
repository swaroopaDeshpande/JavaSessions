package JavaPractice;

public class ConditionalOperatorsConcept {

	public static void main(String[] args) {
		int a = 20;
		int b = 30;

		if (a == b) {
			System.out.println("both are equal");
		} else {
			System.out.println("Both are not equal");
		}
		int x = 100;
		int y = 200;
		int z = 30;

		if (x > y && x > z) {
			System.out.println("X is greatest");
		} else if (y > z) {
			System.out.println("Y is greatest");
		} else {
			System.out.println("z is greatest");
		}
	}

}
