class Person{//1
	int age;
	String name;
}
class Number{//2
	int inum;
	static int snum;
	
	void imethod() {
		inum = 10;
		snum++;
		//static 변수 , instance 변수 둘다 사용가능
		//method도 마찬가지
		//간접적인 접근을 허용하지 X
	}
	static void smethod() {
	//static 메소드에서는 인스턴스 변수를 사용할 수 없다.
		snum = 100;	//static 변수 사용가능
//		inum = 10;	
	}
}
public class StaticTest1 {

	public static void main(String[] args) {
		//1.
		Person per = null;
		System.out.println(per.age);	// new연산자를 통해 Person클래스의 객체생성 전 -> 에러
		per = new Person();
		
		//2.
		Number n = new Number();
		System.out.println(n.inum);
		
		
		//static(class) 변수는 객체 생성없이 사용 가능(프로그램 시작시 이미 변수가 생성되었기 때문)
		//static 변수는 레퍼런스를 통해서도 접근 가능
		System.out.println(Number.snum);
		Number.smethod();
		
		//instatce 변수와 메소드는 객체 생성해야만 사용가능 , class명으로 접근 불가
//		System.out.println(Number.inum); 	
//		Number.imethod(); 
		
	}

}
