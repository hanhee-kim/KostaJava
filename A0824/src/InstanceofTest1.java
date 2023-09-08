
public class InstanceofTest1 {

	public static void main(String[] args) {

		Base b1 = new Base();
		Base b2 = new Derived();
		
		if(b1 instanceof Base) {
			System.out.println("b1 is Base instance");
		}
		if(b1 instanceof Derived) {
			System.out.println("b1 is Derived instance");
		}
		if(b2 instanceof Base) {
			System.out.println("b2 is Base instance");
			//자식의 인스턴스 이지만 부모의 인스턴스 이기도 함
		}
		if(b2 instanceof Derived) {
			System.out.println("b2 is Derived instance");
		}
		
		
	}

}
