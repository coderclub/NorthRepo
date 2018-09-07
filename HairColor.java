package hw4;

public abstract class HairColor extends Classified {	//Inheritance in an abstract class (single level inheritance)
	
	HairColor(){
	
	}
	public abstract void HairColor();					//A void abstract method

	public abstract String HairColor(String color);		//A return abstract method

	public void displayWing() {
		getWing();                 //A getter from Classified.java
	}
	public void newhair(){
		
	}
}

