class TempClass{
	final int x ;
	static final int fx = 100;
	TempClass(){
		x=30;
	}
	TempClass(int a){
		x=20;
	}
	//객체마다 서로 다른 인스턴스 값을 가질 수 있도록 초기화 ( 이후 변경은 불가능)
	void method (int x) {
		
	}
}
public class FinalTest1 {

	public static void main(String[] args) {
		final int n=10;;
		
		System.out.println(n);
//		n=20;	//
		System.out.println(n);
	}

}
