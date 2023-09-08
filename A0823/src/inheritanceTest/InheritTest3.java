package inheritanceTest;
class Parent {
	int n;
//	Parent(){
//		System.out.println("Parent() 기본생성자");
//	}
	Parent(int n){
		this.n = n;
		System.out.println("Parent(int n)");
	}
	
}

class Child extends Parent {
	int m;
	
	Child(){
		super(5);
		System.out.println("Chile() 기본생성자");
		//부모의 기본생성자가 아닌 다른 생성자를 호출하고 싶을때는 무조건 super를 사용하여 호출
	}
	Child(int n , int m) {
		super(n);
		this.m = m ;
	}
}
public class InheritTest3 {

	public static void main(String[] args) {
//		Parent p = new Parent();
		System.out.println("-------구분선-------");
		Child c = new Child();
		Child c2 = new Child(10,20);
		
	}

}
