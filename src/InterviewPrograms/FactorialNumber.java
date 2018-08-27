package InterviewPrograms;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// In mathematics, the factorial of a non-negative integer n, denoted by
		// n!, is the product of all positive integers less than or equal to n.
		// For example, 5 ! = 5 × 4 × 3 × 2 × 1 = 120

		int number = 5;
		int facto = 1;
		if (number <= 0) {
			System.out.println("Wrong number");
		} else {
			for (int i = 1; i <= number; i++) {
				facto = facto * i;
			}

		}
		System.out.println(facto);

	}

}
