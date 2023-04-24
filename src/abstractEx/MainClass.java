package abstractEx;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monster monster;//인터페이스(부모)
		
		BirdMonster birdMonster = new BirdMonster();
		DogMonster dogMonster = new DogMonster();
		SpiderMonster spiderMonster = new SpiderMonster();
		
		birdMonster.attack();
		birdMonster.move();
		
		dogMonster.attack();
		dogMonster.move();
		
		spiderMonster.attack();
		spiderMonster.move();
		
		monster = new BirdMonster();
		monster.attack();
		monster.move();
		
		monster = new DogMonster();
		monster.attack();
		monster.move();
		

	}

}
