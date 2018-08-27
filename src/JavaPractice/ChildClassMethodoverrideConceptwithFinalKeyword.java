package JavaPractice;

public class ChildClassMethodoverrideConceptwithFinalKeyword extends ParentClassFinalMethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClassMethodoverrideConceptwithFinalKeyword obj = new ChildClassMethodoverrideConceptwithFinalKeyword();
		obj.sum();

	}
	//here sum method cannot be ovveride as its declare as final in parent class
	
//	public  void sum()
//	{
//		System.out.println("this method cannt be overrrides");
//	}
	
	

}
