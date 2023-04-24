package exer;

public abstract class Car { //추상 클래스 선언
	
	private int door;
	int tire;
	String carName;
	
	public abstract void printTire();//추상 메서드(메서드 선언부만 있는 메서드)
	
//	public Car() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public Car(int door, int tire, String carName) {
//		super();
//		this.door = door;
//		this.tire = tire;
//		this.carName = carName;
//	}

	public void printCarName() {
		System.out.println(this.carName);
	}
	

}
