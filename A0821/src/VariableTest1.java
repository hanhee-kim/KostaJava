class MyClass{
	int num;
	static int snum;
	
	void setNum(int n) {
		
	}
}
public class VariableTest1 {

	public static void main(String[] args) {
		int n; //지역변수
		
		MyClass mc = new MyClass(); //new(힙영역에 생성) MyClass가 생성되는 시점에 num변수가 생성됨.
		
//		System.out.println(n); 	// 초기화 하지 않고 사용시 에러발생
		System.out.println(mc.num); //초기화 하지 않고 사용 가능 ( 왜? MyClass객체가 생성되면서 변수가 생성되어 초기화 되기 때문)
		
		
	}

}
