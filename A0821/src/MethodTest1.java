class MyMath{
	int add(int x, int y) {
		int result = x + y;
		return result;
	}
	static int multi(int x,int y) {
		return x*y;
	}
}
public class MethodTest1 {

	public static void main(String[] args) {
		MyMath mm = new MyMath();
		
		
		System.out.println(mm.add(10, 20));
		
		System.out.println(MyMath.multi(10, 20));
	}

}
