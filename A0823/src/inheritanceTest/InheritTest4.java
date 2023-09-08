package inheritanceTest;
class A {
	int m;
//	A(){}
	A(int m){
		this.m = m;
	}
}

class B extends A {
//	B(){}
	B(int m){
		super(m);
	}
}
public class InheritTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
