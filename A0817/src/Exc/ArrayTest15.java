package Exc;

import java.util.Scanner;

public class ArrayTest15 {

	public static void main(String[] args) {
		/*
		 * 입력 데이터 수 : 5
		 * 95
		 * 100
		 * 85
		 * 77
		 * 60
		 * 
		 * 출력
		 * 최소값:60
		 * 최대값:100
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 데이터 수 : ");
		int cnt = sc.nextInt(); 
		int[] arr = new int[cnt];//입력받은 데이터 수만큼의 배열선언
		
		
		for(int i=0;i<cnt;i++) {
			arr[i]=sc.nextInt();
		}
		
		int min = arr[0];
		int max = arr[0];
		
		for(int i=0;i<arr.length;i++) {			
			
			if(arr[i]<min) {
				min = arr[i];
			}
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.printf("최소값 : %d\n최대값 : %d\n",min,max);
		
		
		
	}

}
