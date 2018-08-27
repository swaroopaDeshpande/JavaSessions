package JavaPractice;

public class ArrayConcept {

	public static void main(String[] args) {
		// Store multiple values of Similar data types in one single var
		int i[] = new int[3];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		System.out.println(i[2]);
		System.out.println(i.length);
		
		for(int j=0;j<i.length;j++)
		{
			System.out.println(i[j]);
		}
	}

}
