package Exc;

public class ArrayTest13 {

	public static void main(String[] args) {
		/*
		 * 규칙은 첫 번째 행은 모두 1로 초기화 다음 행부터는 바로 위의 값과 바로 왼쪽의 값을 더한것 1 1 1 1 1 1 2 3 4 5 1 3
		 * 6 10 15 1 4 10 20 35 1 5 15 35 70
		 * 
		 */
		// 1.배열 생성 int 5*6
		int[][] fibo = new int[5][6];
		// 인덱스에 -를 사용하기위해 열을 하나 더 만듬
		// 2.첫 행을 1로 초기화
//		fibo[0] = {1,1,1,1,1,1};
		for (int i = 0; i < fibo[0].length; i++) {
			fibo[0][i]++;
		}
		// 3.더한 값 넣어주기
		for (int i = 1; i < fibo.length; i++) { // 행 - 시작1행부터
			for (int j = 1; j < fibo[i].length; j++) { // 열 - 1열부터
				fibo[i][j] = fibo[i - 1][j] + fibo[i][j - 1];

			}
		}
		// 4.출력 (행은 0부터 열은 1열부터 출력)
		for (int i = 0; i < fibo.length; i++) {
			for (int j = 1; j < fibo[i].length; j++) {
				System.out.print(fibo[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
