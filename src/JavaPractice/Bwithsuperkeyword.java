package JavaPractice;

public class Bwithsuperkeyword extends Awithsuperkeyword {

	public Bwithsuperkeyword() {
		super(10);
		System.out.println("child class constructor");
	}

	public static void main(String[] args) {

		Bwithsuperkeyword obj = new Bwithsuperkeyword();
	}

}
