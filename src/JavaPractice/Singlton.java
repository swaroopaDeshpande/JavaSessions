package JavaPractice;

public class Singlton {

	// in OOP a singleton class is a class can have only one object or
	// instance of the class at a time.
	// how to design siglton class
	// 1.Make Constructor =private
	// 2.Static method return type: object of singlton clas
	// diff between Normal and singlton class
	// in case normal class we use constructor for instantiation and in sigloton
	// we use getInstance() Method.

	private static Singlton Singlton_instance = null;
	public String str;

	private Singlton() {
		str = "Hey I am using Singlton class pattern";
	}

	public static Singlton getInstance() {// lazy initialization
		if (Singlton_instance == null)
			Singlton_instance = new Singlton();
		return Singlton_instance;
	}

	public static void main(String[] args) {
		Singlton obj = Singlton.getInstance();
		Singlton obj1 = Singlton.getInstance();
		Singlton obj2 = Singlton.getInstance();

		obj.str = (obj.str).toUpperCase();

		System.out.println(obj.str);
		System.out.println(obj1.str);
		System.out.println(obj2.str);

		obj2.str = (obj2.str).toLowerCase();

		System.out.println(obj.str);
		System.out.println(obj1.str);
		System.out.println(obj2.str);

	}

}
