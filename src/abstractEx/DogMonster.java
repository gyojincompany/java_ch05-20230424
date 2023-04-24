package abstractEx;

public class DogMonster implements Monster, MonsterInfo {

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("이빨로 물어서 공격!");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("땅을 달려서 이동!");
	}

	@Override
	public void energy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void health() {
		// TODO Auto-generated method stub
		
	}

}
