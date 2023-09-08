package Exc;

import java.util.Scanner;

public class ArrayTest11 {
/*
 * 100미만의 양의 정수들이 주어진다
 * 입력받다가 0이 입력되면 마지막에 입력된 0을 제외하고
 * 그 때까지 입력된 정수의 십의 자리 숫자가 각 몇 개인지
 * 작은 수 부터 출력하는 프로그램을 작성하시오 (0개인 숫자는 출력하지 않는다)
 * 입력 : 10 55 3 63 85 61 85 0
 * 출력:
 * 0:1
 * 1:1
 * 5:1
 * 6:2
 * 8:2
 */
	public static void main(String[] args) {
		int[] cnt = new int [10]; //0~9까지를 카운팅하는 배열
		
		Scanner sc = new Scanner(System.in);		
		while(true) {
			int number = sc.nextInt();
			if(number<0 || 100<=number) {
				System.out.println("100미만의 양의 정수를 입력하세요.");
				continue;
			}
			else if(number == 0) {
				for(int i =0;i<cnt.length;i++) {
					if(cnt[i]!=0) {
						System.out.printf("%d : %d",i,cnt[i]);
						System.out.println();
					}
				}
				
				break;
			}
			else{		
				cnt[number/10]++;
				for(int i=0;i<cnt.length;i++) {
					
				}
			}
			
		}
		
	}

}
