package Inheritance1;

public class TestTeacher {

	public static void main(String[] args) {
		
		HeadMaster hm  = new HeadMaster();
		hm.name = "Asif Tanvir";
		hm.age = 35;
		hm.phone = 347656239;
		hm.displayinformation1();
		
		HeadMaster hm1  = new HeadMaster();
		hm1.name = "John Beker";
		hm1.age = 55;
		hm1.phone = 347656239;
		hm1.bonus -= 5000;
		
		hm1.displayinformation2();
		
	}

}
