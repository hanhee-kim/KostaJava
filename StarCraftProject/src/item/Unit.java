package item;

public class Unit {

	int healthPoint;	//각각 객체들이 가지고 있는 포인트(파워?)
	final int MAX_HP;	//최대치 파워
	
	public Unit(int hp){	//종족당 hp를 다르게 하기 위해서 생성자에서 final초기화
		MAX_HP = hp;
		healthPoint = MAX_HP;
	}
	//일부러 기본생성자를 안만듬
	
}
