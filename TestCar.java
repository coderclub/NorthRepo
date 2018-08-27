package packpak;

public class TestCar {

	public static void main(String[]args) {
		
		Car AhmedCar = new Car(201, "Camry", "Toyota") ;				//Constructor 4
		
		Car FahimCar = new Car();										//Constructor 1
		
		Car FarzadCar = new Car("4 Series", "BMW", 50);					//Constructor 3
		FarzadCar.displayCarModel("BMW");								//Method 1
		
		Car ShamsCar = new Car(404, "Prius", "Toyota", 56, 'B' );		//Constructor 2
		System.out.println(ShamsCar.GenerateSerialNo(404, 56));			//Method 2
		ShamsCar.CarMilage();											//Method 3
		ShamsCar.CarMake("Toyota");										//Method 4

	}
}
