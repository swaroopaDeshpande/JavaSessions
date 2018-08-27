package JavaPractice;

public class StringConcatinationConcept {

	public static void main(String[] args) {
		// + sign concatenation operator
		// execution left to right
		// println:use to print console with a new Line
		// print:use to print on the console

		int a = 100;
		int b = 200;

		String x = "Hello";
		String y = "Swaroopa";

		System.out.println(a + b + x + y);// 300HelloSwaroopa
		System.out.println(x + y + a + b);// HelloSwaroopa100200
		System.out.println(x + y + (a + b));// HelloSwaroopa300
		System.out.println(a + b + x + y + a + x + b + y);// 300HelloSwaroopa100Hello200Swaroopa

	}

}
