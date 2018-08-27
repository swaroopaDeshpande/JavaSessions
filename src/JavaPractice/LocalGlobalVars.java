package JavaPractice;

public class LocalGlobalVars {
	//Class vars/Global vars
	int age;
	String name;

	public static void main(String[] args) {
		
		int i=25;
		System.out.println(i);
		sum();
		LocalGlobalVars obj=new LocalGlobalVars();	
	}
	
	public static void sum()
	{
		int i=20;
		System.out.println(i);
		//System.out.println(obj.age);
	}

}
