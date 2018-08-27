package JavaPractice;

public class IncrementDecrementConcept {

	public static void main(String[] args) {
		//++
				//--
				int i=1;
				int j=i++;//post incrementing first give value of i to j then incr i
				
				System.out.println(i);
				System.out.println(j);
				
				int a=1;
				int b=++a;//pre increment
				System.out.println(a);//2
				System.out.println(b);//2
				
				int m=2;
				int n=m--;//post decrement
				System.out.println(m);//2
				System.out.println(n);//1
				
				int p=2;
				int q=--p;//pre decr
				System.out.println(p);
				System.out.println(q);
				
				
				int k = -5;
				int l = k--;
				System.out.println(k);//-6
				System.out.println(l);//-5
				
				
				int c = -5;
				int d = --c;
				System.out.println(c);//-6
				System.out.println(d);//-6

	}

}
