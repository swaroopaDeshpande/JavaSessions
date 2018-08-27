package JavaPractice;

public class callByRef {
	int p;
	int q;

	public static void main(String[] args) {
		// call by ref : in c and c++ we are having pointers
		// in java-call by ref is possible by passing value by object referece.
		callByRef obj = new callByRef();
		obj.p = 50;
		obj.q = 60;
		System.out.println("value of p and q before swap");
		System.out.println(obj.p);
		System.out.println(obj.q);
		obj.swap(obj);
		System.out.println("Value of p and q after swap");
		System.out.println(obj.p);
		System.out.println(obj.q);
	}

	public void swap(callByRef t) {
		int temp;
		temp = t.p;// temp=50;
		t.p = t.q;// p=60;
		t.q = temp;// t=50;
	}
}
