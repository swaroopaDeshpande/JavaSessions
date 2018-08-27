package InterviewPrograms;

public class Swapvarswithoutthird {

	public static void main(String[] args) {
		// with using third variable
		int x=5;
		int y=10;
//		int t;
//		t=x;
//		x=y;
//		y=t;
//		
//		System.out.println(x);
	//	System.out.println(y);
		
		//without using third var
		
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println(x);
		System.out.println(y);
	}

}
