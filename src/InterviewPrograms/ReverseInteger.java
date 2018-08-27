package InterviewPrograms;

public class ReverseInteger {

	public static void main(String[] args) {
		// 1234=4321
		
		int num=1234;
		int rev=0;
		while(num!=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);


	}

}
