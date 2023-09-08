package polino;
class Shape {
	String color;
	
	void draw() {
		System.out.println("shape");
	}
}
class Circle extends Shape {
	int x;
	int y;
	int r;
	@Override
	void draw() {
		System.out.println("circle");
	}
}
public class PolinoTest1 {

	public static void main(String[] args) {

		Circle c = new Circle(); 
		c.color = "green";
		c.x = 10;
		c.y = 10;
		c.r = 20;
		c.draw();
		
		
		
		Shape s = new Circle(); //upcasting
		s.color = "red";
//		s.x = 10; 
		s.draw();	//다형성
		//아무리 부모타입이라하더라도, 실제로 new 한 자식이 메소드를 오버라이딩을 한 경우 자식의 메소드가 호출된다
		//상속 업캐스팅 오버라이딩을 전제로함
		

		
		
	}

}
