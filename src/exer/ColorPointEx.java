package exer;

public class ColorPointEx {

	public static void main(String[] args) {
		
		Point p = new Point();//부모클래스(super class) Point 객체 생성
		
		p.setX(10);
		p.setY(20);
		
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();//자식클래스(sub class) ColorPoint 객체 생성
		
		cp.setX(100);
		cp.setY(200);
		cp.setColor("red");
		
		cp.showColorPoint();
		
		
		
	}

}
