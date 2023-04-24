package exer;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point superP = new Point();//부모클래스 객체 선언
		ColorPoint subColor = new ColorPoint();//자식클래스 객체 선언
		
		superP = subColor;//부모는 자식의 모든 것을 받아 줄수 있다!(1층집->2층집 ok) [업캐스팅]
		subColor = (ColorPoint)superP;//자식 객체를 부모 객체에 대입할 때는 형변환이 필요함!(2층집->1층집 not) [다운캐스팅]
		
	}

}
