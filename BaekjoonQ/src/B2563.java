import java.util.Scanner;

public class B2563 {

	public static void main(String[] args) {

		//첫째 줄에 색종이의 수가 주어진다
		//둘째 줄부터 한줄에 하나씩 색종이를 붙인 위치가 주어진다
		// 색종이를 붙인 위치는 두 개의 자연수로 주어지는데 
		//첫 번째 자연수는 색종이의 왼쪽 변과 도화지의 왼쪽 변 사이의 거리이고,
		//두 번째 자연수는 색종이의 아래쪽 변과 도화지의 아래쪽 변 사이의 거리이다. 
		//색종이의 수는 100 이하이며, 색종이가 도화지(가로세로 100) 밖으로 나가는 경우는 없다
		//색종이는 가로 세로 10, 
		
		Scanner sc = new Scanner(System.in);
		int number;
		int x;
		int y;
		int cnt = 0;
		boolean[][] background = new boolean [100][100];
		
		
		System.out.print("색종이의 수 :");
		number = sc.nextInt();
		if(number<=100) {
			
			for(int i=0;i<number;i++) {
				System.out.println("색종이의 x위치 :");
				x = sc.nextInt();
				System.out.println("색종이의 y위치 :");
				y = sc.nextInt();
				
				for(int j=x;j<x+10;j++) {
					for(int k=y;k<y+10;k++) {
						background[j][k] = true;
					}
				}
				
				if(x>=90 || y>=90) {
					System.out.println("도화지 밖으로 붙일 수 없습니다.");
					break;
				}				
			}
			for(int i=0;i<background.length;i++) {
				for(int j=0;j<background[i].length;j++) {
					System.out.println(background[i][j]);
					if(background[i][j]==true) {
						cnt++;
					}
				}
			}
			System.out.println("검은 영역 : "+cnt);
		}else {
			System.out.println("색종이의 수는 100을 넘길 수 없다.");
		}
		
	}

}
