package Ex6;

public class Ex6 {
	static double getDistance(int x, int y, int x1, int y1) {
		int xDistance = x1 - x;
		int yDistance = y1 - y;
				
		
		return Math.sqrt(xDistance*xDistance+yDistance*yDistance);
	}
	public static void main(String[] args) {
		System.out.println(getDistance(1,1,2,2));
	}

}
