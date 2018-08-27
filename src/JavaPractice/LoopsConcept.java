package JavaPractice;


public class LoopsConcept {

	public static void main(String[] args) {
		// Looping:in order to avoid repetative tasks we use loops
		// 1.while loop :
		// disadvt:it will generate infinite loop if u dont give incremental or
		// decre. operator.
		
		int i=1;//initialization
		while(i<=10)//condition
		{
			System.out.println(i);
			i++;//incr/decr
		}
		System.out.println("****************");
		//for loop
		for(int j=1;j<=100;j++)
		{
			System.out.println(j);
		}

	}

}
