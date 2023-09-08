package Ex6;
class MyPoint{
	int x;
	int y;
	
	MyPoint(int x,int y){
		this.x = x;
		this.y = y;
	}
	double getDistance(int x, int y){
		
		return Math.sqrt((x-this.x)*(x-this.x)+(y-this.y)*(y-this.y));
		//
	}
}
public class Ex7 {

	public static void main(String[] args) {
		MyPoint p = new MyPoint(1, 1);
		
		//p(1,1) 과 (2,2)의 거리를 구한다
		System.out.println(p.getDistance(2, 2));
	}

}
