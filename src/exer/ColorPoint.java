package exer;

public class ColorPoint extends Point {//sub class
	
	private String color;

	public ColorPoint() {
		//super();//부모 클래스의 기본 생성자 호출(생략 가능)
		//super(10,20);//부모 클래스의 생성자 호출
		// TODO Auto-generated constructor stub
		System.out.println("자식 클래스 생성자 실행됨!!");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void showColorPoint() {
		System.out.println(this.color);
		showPoint();//super class method
	}

}
