package inheritanceTest;
class Base {
	int bnum;
	void method1() {}	//1
	void method2() {}	//2
	
}

class Derived extends Base {
	int dnum;
	void method1(int n) {}	//5
	void method2() {		//6
		method1();	//1번호출
		method2();	//재귀호출함수(잘못 사용 확률 매우 높음)
		super.method2();	//2번호출
	}		
	void method2(int n) {}	//3 	//Overload
	void method3() {}	//4
	
}
public class InheritTest2 {

	public static void main(String[] args) {
		Base base = new Base();
		base.bnum = 10;
		base.method1();	//1
		base.method2();	//2

		Derived der = new Derived();
		der.dnum = 20;
		der.dnum = 30;
		der.method1();	//1
		der.method2();	//3 **
		der.method3();	//4
		

		
		
		
	}

}
