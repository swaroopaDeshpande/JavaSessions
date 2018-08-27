package JavaPractice.OOPSConcept;

public abstract class AbstractionConceptBank {

	public abstract void loan();

	public void debit() {
		System.out.println("Bank-debit method");
	}

	public void credit() {
		System.out.println("Bank credit method");
	}

}