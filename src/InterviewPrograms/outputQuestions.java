package InterviewPrograms;

import java.util.HashSet;

public class outputQuestions {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		System.out.println("s1 == s2 is " + s1==s2);//false if we use equals function : true
		
		//Preceding given to + operator that == so it will consider output as 
		//"s1 == s2 is +abc" abc
		
		String s3="JournalDev";
		int start=1;
		char end =5;
		System.out.println(start+end);
		System.out.println(s3.substring(start,end));//ourn
		//starts from 1 that is o and substring exclude last index
		
		HashSet shortset = new HashSet();
		for (short i=0;i<100;i++)
		{
			shortset.add(i);
			shortset.remove(i-1);
		}
		System.out.println(shortset.size());
		
		try{
			boolean flag = false;
			if 	(flag)
			{
				while(true)
				{
					
				}
			}else 
				{
					System.out.println(1);
				}
		}
				finally {
					System.out.println("I am in finally block");
				}
			
		String str =null;
		String str1= "abc";
		System.out.println(str1.equals("abc") | str.equals(null));
		
	}
	
	
	

}
