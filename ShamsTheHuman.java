package hw4;
	// Test Subject
public class ShamsTheHuman extends HairColor { // Hierarchy inheritance
	
	public static void main(String[] args) {
		
		Human.nature();
		
		AllBodyParts Shams = new AllBodyParts(); //Constructor
		Shams.AllBodyParts(2);					// Method
		Shams.AllBodyParts(2, 3);
		
		AllBodyParts ChikniShams = new AllBodyParts(2);
		Shams.AllBodyParts(2.5, 2);
		ChikniShams.tail();
		
		ShamsTheHuman ShamsJr = new ShamsTheHuman();
		ShamsJr.displaySP();
		ShamsJr.HairColor();
		ShamsJr.HairColor("Black");
		ShamsJr.setSP("mouse");					//data hiding
		System.out.println("My Super Power is " + ShamsJr.getSP() +"  "+ ShamsJr.behaviour);
		
	}
	public void HairColor() {
		System.out.println("hair color void");
	}
	public String HairColor(String color) {
		System.out.println("hair color return " + color );
		return color;
	}

}
