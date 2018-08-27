package hw4;

public class AllBodyParts extends Classified implements Human { 	// Abstraction
																	//Multi-level Inheritance
	public static String subjectName;
	
	public AllBodyParts() {
		 /*  the default constructor, which (auto-generated during the creation of a
		 * class) you can call otherwise will not work */
		// TODO Auto-generated constructor stub
		System.out.println("default constructor");
	}

	AllBodyParts(String topPart, int topPartNo) { 					// Constructor
		System.out.println("All include in " + topPart);
	}

	public AllBodyParts(String middlePart) {
		System.out.println(middlePart);
	}

	public AllBodyParts(int eyeNo) {
		System.out.println("from constructor " + eyeNo);
	}

	public void AllBodyParts(int eyeNo) { 			// A void method with the same name as class and constructor
		System.out.println("from method " + eyeNo);
	}

	public double AllBodyParts(double legNo, double handNo) {
													// A return method with the same name as class and constructor
		double legNhand = legNo + handNo;
		System.out.println("return method " + legNhand);
		return legNhand;
	}

	public void AllBodyPartsIn() { 										// Polymorphism
		System.out.println("parts stolen, nothing found");
	}

	public void AllBodyPartsIn(String hd) {
		System.out.println(hd + " found");
	}

	public void AllBodyPartsIn(String hd, int eyeNo) {
		System.out.println(hd + " found and " + eyeNo + " eye found");
	}

	public void bodyParts(String topPart) {
	}

	public int eye(int eyeNo) {
		System.out.println("this person has " + eyeNo + " eyes"); 		// Overridden from Interface
		return eyeNo;
	}

	public void leg(double legNo) {
	}

	public void hand(double handNo) {
	}

	public void tail() {
		System.out.println(subjectName + " has a tail");

	}
}
