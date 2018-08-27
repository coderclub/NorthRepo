package hw4;

public interface Human {								//Interface

	public void bodyParts(String topPart);				//Abstract method no return type

	public int eye(int eyeNo);							//Abstract method with return type

	void leg(double legNo);								//parameters are allowed in abstract method in an Interface

	void hand(double handNo);

	void tail();

	static void nature() {								//Static and no-return method can be implemented in an Interface
		System.out.println("Human nature is unstable");
	}

	default void nature(String a) {						//Default method will not work due to java standard
		System.out.println("Human mind is very Curious");
	}

	public static int legNhand(int legNo, int handNo) {	//return method will not work due to java standard
		int legNhand = legNo + handNo;
		System.out.println(legNhand);
		return legNhand;
	}

}
