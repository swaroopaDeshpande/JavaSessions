package JavaPractice;

public class ConstructorwiththisKeyword {
	// class variables
	String name;
	int age;

	ConstructorwiththisKeyword(String name, int age) {
		System.out.println(name);
		System.out.println(age);

	}

	public static void main(String[] args) {
		ConstructorwiththisKeyword obj = new ConstructorwiththisKeyword("Tom", 30);

	}

}
