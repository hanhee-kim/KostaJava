package Exc;

import java.util.Scanner;

public class ArrayTest14 {

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
 * 60 75 85 95 100
 */
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 데이터 수 : ");
		int cnt = sc.nextInt();	
		
		int[] arr = new int [cnt];
		int tmp=0;
		
		for(int i=0;i<cnt;i++) {
			int num = sc.nextInt();
			arr[i]=num;				
		}
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {				
				if(arr[j]>arr[j+1]) {
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}				
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}		
	}

}
