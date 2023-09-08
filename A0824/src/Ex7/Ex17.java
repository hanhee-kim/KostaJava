package Ex7;
abstract class Unit {
	int x;
	int y;
	Unit(){
		this.x = 0;
		this.y = 0;
	}
	Unit(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	abstract void move(int x,int y);
	void stop() {
		
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
}
class Marine extends Unit{ // 보병 
	
	
	void move(int x, int y) {
		/* 지정된 위치로 이동 */ }

	void stimPack() {
		/* 스팀팩을 사용한다. */}
}

class Tank extends Unit{ // 탱크 
	void move(int x, int y) { 
		/* 지정된 위치로 이동 */ }

	void changeMode() {
		/* 공격모드를 변환한다. */}
}

class Dropship extends Unit{ // 수송선
	@Override
	void move(int x, int y) { 
		/* 지정된 위치로 이동 */ }

	void load() {
		/* 선택된 대상을 태운다. */ }

	void unload() {
		/* 선택된 대상을 내린다. */ }
}

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
