package InterviewPrograms;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
	String rev="";
	System.out.println("Enter String you want to reverse");
	Scanner scan = new Scanner(System.in);
	String str= scan.next();
	int length=str.length();
	System.out.println(length);
	
	for(int i=length-1;i>=0;i--)
	{
		rev=rev+str.charAt(i);
	}
	System.out.println(rev);
	}

}
