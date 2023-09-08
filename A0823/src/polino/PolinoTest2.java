package polino;

class AA {
	int a ;
	void methodA() {}	//1
	void method() {}	//2
	void info() {
		System.out.println(getPay());
	}
	int getPay() {
		return 0;
	}
	
}
class BB extends AA {
	int b;
	void methodB() {}	//3
	void method() {}	//4
	
	@Override
	int getPay() {
		return 100;
	}
}
public class PolinoTest2 {

	public static void main(String[] args) {

		AA aa = new BB();
		aa.methodA();   //1
//		aa.methodB();	//부모타입에 없는 자식 메소드를 호출 할 수 없음 ( 타입이 부모이기 때문 )
		aa.method(); 	//4
		aa.a = 10;
//		aa.b = 20;		//error
		
//		자식객체를 부모 변수에 넣을 경우 , 부모에는 없는 자식의 변수나 함수는 사용할 수 없다.
//		단, 오버라이딩등 한 함수는 부모 변수로 자식의 함수를 호출한다.
		aa.info();
		
	}

}
