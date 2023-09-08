abstract class Unit{
	public abstract void move();
}

class Fighter extends Unit implements Fightable {

	@Override
	public void fight() {
		System.out.println("Fighter fight()");
	}

	@Override
	public void move() {
		System.out.println("Fighter move()");
	}
	
}

class Helper extends Unit implements Helping {

	@Override
	public void help() {
		System.out.println("Helper help()");
	}

	@Override
	public void move() {
		System.out.println("Helper move()");
	}
	
}

class Comber extends Unit implements Fightable, Helping {

	@Override
	public void help() {
		System.out.println("Comber help()");
	}

	@Override
	public void fight() {
		System.out.println("Comber fight()");
	}

	@Override
	public void move() {
		System.out.println("Comber move()");
	}
	
}
public class InterfaceTest1 {

	public static void main(String[] args) {

//		Fightable fighter = new Fighter(); //업캐스팅
//		fighter.fight();
//		fighter.move();		//레퍼런스 타입에 없는 메소드 호출은 불가능
		
		Fighter fighter = new Fighter(); 
		Fightable fighter1 = fighter; 
		fighter1.fight();
		Unit unit1 = fighter;
		unit1.move();
//		Object obj = fighter;
		
		Helper helper = new Helper();
		Helping helping = helper;
		helping.help();
		Unit unit2 = helper;
		unit2.move();
		
		Comber comber = new Comber();
		Fightable fighter3 = comber;
		Helping helping2 = comber;
		Unit unit3 = comber;
		
		System.out.println("======================================");
		System.out.println("method1");
		
		method1(fighter);
		method1(comber);
//		method1(helper);	//error

		System.out.println("======================================");
		System.out.println("method2");
		
//		method2(fighter);	//error
		method2(comber);
		method2(helper);	

		System.out.println("======================================");
		System.out.println("method3");
		
		
		method3(fighter);	//error
		method3(comber);
		method3(helper);	
	}
	
	static void method1(Fightable unit) {
		unit.fight();
	}
	static void method2(Helping unit) {
		unit.help();
	}
	static void method3(Unit unit) {
		unit.move();
		
	}

}
