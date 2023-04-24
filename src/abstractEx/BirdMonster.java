package abstractEx;

public class BirdMonster implements Monster{

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("부리로 찍어서 공격!");
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("하늘을 날라서 이동");
		
	}
	
}
