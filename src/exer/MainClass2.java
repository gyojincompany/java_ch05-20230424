package exer;

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point point;
		
//		ShapePoint shapePoint = new ShapePoint();//부모클래스 Point->자식클래스 shapePoint 객체 생성
//		shapePoint.helloPrint();
		
		point = new Point();
		point.helloPrint();
		
		point = new ShapePoint();
		point.helloPrint();
		
		
		
		

	}

}
