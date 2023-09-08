package test;
class Point implements Cloneable{
	
	int x;
	int y;
	Point(){}
	Point(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return x+","+y;
	}
	@Override
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		}catch(CloneNotSupportedException e) {
			//실제 클론을 호출한 객체자체(클래스가??)가 Cloneable 인터페이스로 받아야한다
			//clone()을 사용하기위한 약속 같은것
			//Cloneable을 implements하지 않으면 예외처리되어
			//null을 반환.
		}
		return obj;
	}
}
public class CloneTest {

	public static void main(String[] args) {
		Point p = new Point(10,20);
		
		Object obj = p.clone();
		Point cp = (Point)obj;
		System.out.println(p);
		System.out.println(cp);
	}

}
