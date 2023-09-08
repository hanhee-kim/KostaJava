package Ex6;
class Marine{
	int x=0, y=0;	//Marine의 위치좌표(x,y)
	int hp = 60;	//현재 체력
	static int weapon = 6;	//공격력
	static int armor = 0;	//방어력
	
	//모든 병사의 공격력과 방여력이 같아야 하기 때문에 static을 붙여준다.
	
	void weaponUp() {
		weapon++; //공격력 증가
	}
	void armorUp(){
		armor++; //방어력 증가
	}
	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}

public class Ex9 {
	public static void main(String[] args) {

		//6-10  	b
		//6-11 		b
		//6-12		c,d
		//6-13		b,c,d
		//6-14		c,e
		//6-15		a ( instance변수)
		//6-16		a,e
		//6-17		b,f
		//6-18		B : static메소드에서 변수가 존재하지않음 , 
		//			C : 
		//			D : static메소드에서 instance메소드 호출 불가능
		//6-19		ABC123
//					After change:ABC123
	}

}
