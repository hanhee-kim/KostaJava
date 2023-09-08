import java.util.Scanner;

public class B14681 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("x 입력: ");
		int x;
		int y;
		int quadrant;
		x = sc.nextInt();
		System.out.println("y 입력: ");
		y = sc.nextInt();
		if(x<0) {
			if(y<0) {
				quadrant = 3;
			}
			else {
				quadrant = 2;
			}
		}else if(x>0){
			if(y<0) {
				quadrant = 4;
			}
			else {
				quadrant = 1;
			}
		}else {
			quadrant = 0;
		}
		
		System.out.println("Quadrant : "+quadrant);
		
	}

}
