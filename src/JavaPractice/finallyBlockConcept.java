package JavaPractice;

public class finallyBlockConcept {

	public static void main(String[] args) {
		// finally is blocked always associated with try and catch blocks
		// first try and catch blocks gets executed then only finally got
		// executed
		// irrespective as there is catch block written or proper catch block
		// available or wrong catch block written finally block always get
		// executed.
		// if wrong exception given in catch block then real exception will be
		// definately thrown byt control will not come in wrong catch block but
		// here also fianlly block will get executed.
		// throw is keyword to create run time exception
		// Throws clause is used to declare an exception, which means it works
		// similar to the try-catch block. On the other hand throw keyword is
		// used to throw an exception explicitly.
		// Declaring arithmetic exception using throws
		// void sample() throws ArithmeticException{
		// Statements
		/*
		 * void myMethod() { try { //throwing arithmetic exception using throw
		 * throw new ArithmeticException("Something went wrong!!"); } catch
		 * (Exception exp) { System.out.println("Error: "+exp.getMessage()); } }
		 */
	}

	

	public static void test() {
		try {
			System.out.println("inside try block");
			throw new RuntimeException("Test");
		} catch (Exception e) {
			System.out.println("inside Catch block");
		}
	}

}
