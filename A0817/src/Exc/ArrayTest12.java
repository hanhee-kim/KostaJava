package Exc;

import java.util.Scanner;

public class ArrayTest12 {

	public static void main(String[] args) {
		/*
		 * 학생 3명의 국어, 영어, 수학 점수를 입력받아 학생별 총점과 과목별 합계를
		 * 아래와 같이 출력하는 프로그램을 작성하시오.
		 * 입력
		 * <1번째 학생의 점수>
		 * 국어:95
		 * 영어:100
		 * 수학:88
		 * <2번째 학생의 점수>
		 * 국어:85
		 * 영어:60
		 * 수학:93
		 * <3번째 학생의 점수>
		 * 국어:66
		 * 영어:99
		 * 수학:88
		 * 
		 * 출력
		 * 		국어	영어	수학	총점
		 * 1번	95	100	88	283
		 * 2번	85	60	93	238
		 * 3번	66	99	88	253
		 * 평균	
		 */

		int[][] grade = new int [4][4];
		String[] subject = {"국어","영어","수학"};
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<grade.length-1;i++) {
			System.out.println("<"+(i+1)+"번째 학생의 점수>");
			for(int j=0;j<grade[i].length-1;j++) {
				System.out.print(subject[j]+" : ");			
				grade[i][j]=sc.nextInt();	
				grade[i][grade.length-1]+=grade[i][j];
				grade[grade.length-1][j]+=grade[i][j];
			}
		}//성적 입력 받고 합계 구함
		for(int i=0;i<grade.length-1;i++) {
			grade[grade.length-1][i]/=(grade.length-1);
		}//열의 합을 평균으로 나눠주기
		
		System.out.println("\t국어\t영어\t수학\t총점");
		for(int i =0;i<grade.length;i++) {
			if(i==3) {
				System.out.print("평균\t");
			}else {				
				System.out.print(i+1+"번\t");
			}
			for(int j=0;j<grade[i].length;j++) {
				if(grade[i][j] != 0) {
					System.out.print(grade[i][j]);
					System.out.print("i"+i+"j"+j);
				}
				System.out.print("\t");
			}
			System.out.println();
		}
		
	}

}
