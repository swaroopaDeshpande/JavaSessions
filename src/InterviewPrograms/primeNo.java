package InterviewPrograms;

public class primeNo {

	public static void main(String[] args) {

		int number=5;
		int counter = 0;
		
		if(number==0 || number==1)
		{
			System.out.println("not a prime no");
		}
		else
		{
			for(int i=2;i<=number/2;i++)
			{
				if(number%2==0)
				{
					counter++;
				}
				else if (counter==0){
					System.out.println("Prime no");
					
				}
			}
		}
	}

}
