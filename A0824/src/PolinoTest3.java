class Base {
	int x;
	void method() {
		System.out.println("Base method");
	}
}

class Derived extends Base {
	int y;
	void method() {	//override
		System.out.println("Derived method");
	}
}
public class PolinoTest3 {

	public static void main(String[] args) {
		Base base1 = new Derived();	//upcasting
		base1.method();//다형성
		base1.x = 10;
//		base1.y = 20;
		
		Base base2 = new Base();
		base2.method();
		
		if(base1 instanceof Derived) {
			
		Derived derived1 = (Derived)base1; //downcasting
		derived1.y = 20;
		}
		
		if(base1 instanceof Derived) {
		Derived derived2 = (Derived)base2;
		derived2.y = 30;
		//base2는 실제로 new Base해주었기 때문에 y를 쓸 수 없다.
		//이런경우 오류가 나므로 instanceof를 사용하여 판별후에 사용한다.
		
		}
		
	}

}
