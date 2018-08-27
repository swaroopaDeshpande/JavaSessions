package JavaPractice.OOPSConcept;

public class ClassAndObjectConcepts {
	// Class is an entity,Physical entity where we have to define properties and
	// characteristics in the form of Methods and vars
	// Naveen is a human class , his age and gender is his characteristics and
	// his methods like run(),write(),sleep() etc

	// class/global vars
	int modelNo;
	int wheels;

	public static void main(String[] args) {

		ClassAndObjectConcepts obj = new ClassAndObjectConcepts();
		obj.modelNo = 2012;
		obj.wheels = 4;

		System.out.println(obj.modelNo);
		System.out.println(obj.wheels);
	}

}
