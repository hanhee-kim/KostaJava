package Exc;

import java.util.Scanner;

public class ArrayTest16 {

	public static void main(String[] args) {
		/* 파스칼 위의 값 + 위의 왼쪽 값
		 * 행렬크기 :5
		 * 1
		 * 1  1	
		 * 1  2  1		// [2][1] = [1][1]+[1][0]
		 * 1  3  3  1
		 * 1  4  6  4  1
		 * 1  5 10 10  5  1
		 */

		
		Scanner sc = new Scanner(System.in);
		System.out.print("행렬 크기 : ");
		int size = sc.nextInt();
		int[][] matrix = new int[size][size];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i == j) {
					matrix[i][j] = 1;
				}
//				matrix[i][0] = 1;
			}
		}

		//더한값 입력
		for(int i=1;i<size;i++) {
			for(int j=0;j<i;j++) {
				matrix[i][j] = matrix[i-1][j]; //현재 인덱스 위치에 위의 값을 넣는다
				if(j>0) {
					matrix[i][j] += matrix[i-1][j-1]; //3째줄부터 위-왼쪽 값을 추가로 더한다.
				}
			}
		}
		//출력
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(matrix[i][j]+"  ");
			}
			System.out.println();
		}
		

	}

}
