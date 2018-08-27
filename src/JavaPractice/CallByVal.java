package JavaPractice;

public class CallByVal {

	public static void main(String[] args) {
		// Call by Val-->you are passing duplicate copy of parameters to a
		// function.SO even if orginal values chnages it will not reflect on
		// duplicate copy.
		
		CallByVal obj= new CallByVal();
		int x=10;
		int y=20;
		int z=obj.sum(x, y);
		System.out.println(x);
		System.out.println(y);
	}
	//here x will be assigned to a and y will be assigned to b.
	public int sum(int a,int b)
	{
		a=30;
		b=40;
		int c;
		c=a+b;
		return c;
	}

}
