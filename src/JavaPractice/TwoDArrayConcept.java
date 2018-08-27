package JavaPractice;

public class TwoDArrayConcept {

	public static void main(String[] args) {

		String x[][] = new String[3][5];
		System.out.println(x.length);// 3 Total no of rows
		System.out.println(x[0].length);//5 total no of colms
		
		//store values
		//1st row
		x[0][0]="Test";
		x[0][1]="Selenium";
		x[0][2]="Java";
		x[0][3]="Java Script";
		x[0][4]="Dot Net";
		//2nd row
		x[1][0]="A1";
		x[1][1]="B1";
		x[1][2]="C1";
		x[1][3]="D1";
		x[1][4]="E1";
		//3rd row
		x[2][0]="A2";
		x[2][1]="B2";
		x[2][2]="C2";
		x[2][3]="D2";
		x[2][4]="E2";
		
		//Print all values of 2D array-2for loops
		
		
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[0].length;j++)
			{
				System.out.println(x[i][j]);
			}
		}
		
		
		
		
		
	}

}
