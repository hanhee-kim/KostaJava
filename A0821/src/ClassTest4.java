class TClass1{
	//같은 클래스 안에 있는 메소드들끼리는 서로 호출 가능(레퍼런스 변수 없이)
	void method1() {
		int num1;
		method2();
	}
	void method2() {
		int num2;
		method3();
	}
	void method3() {
		int num3;
	}
}
public class ClassTest4 {

	public static void main(String[] args) {
		
		TClass1 tc = new TClass1();
		tc.method1();
	}

}
