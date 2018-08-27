package JavaPractice;

public class MainMethodOverloading {

	public static void main(String[] args) {
		// this is actual main method ,only this will get call.for other main
		// method we need to call explicitely
		System.out.println("main method");
		main("testing");
		main("Selenium", "testing");
	}

	public static void main(String a) {
		System.out.println("main method-with String parameter");
	}

	public static void main(String a, String b) {
		System.out.println("main method-with two String parameter");
	}

	public static void main(int a, int b) {
		System.out.println("main method-with int parameters");
	}

}
