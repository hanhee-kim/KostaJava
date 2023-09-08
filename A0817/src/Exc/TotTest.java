package Exc;

import java.util.Scanner;

public class TotTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sel = 0;
		int money = 0;
		int sum = 0;
		int[] coins = { 5000, 1000, 500 };
		int[] price = { 1500, 2500, 2500, 2000, 3000 }; // 각 메뉴에 대한 가격

		while (true) {
			System.out.println("[코스타 카페]");
			System.out.println("1. 아메리카노(1500원)");
			System.out.println("2. 카페라떼(2500원)");
			System.out.println("3. 카푸치노(2500원)");
			System.out.println("4. 에스프레소(2000원)");
			System.out.println("5. 카페모카(3000원)");
			System.out.println("0. 선택완료");
			System.out.print("선택 >");
			System.out.println();

			sel = sc.nextInt();
			if (sel == 0 || money > 0) {
				System.out.println("돈을 넣으세요 >");
				money = sc.nextInt();

				// 1. 입금이 가격보다 작을 경우
				if (sum > money) {
					System.out.println("돈이 부족합니다.");
					continue;
					// 다시 while문으로 가는 방법은..?
				}
				// 2. 잔돈 : 5000(1),1000(0),500(0)
				else {
					int cnt[] = new int[3];
					money -= sum;
					for (int i = 0; i < coins.length; i++) {
						cnt[i] = money / coins[i];
						if (money % coins[i] > 0) {
							money -= coins[i] * cnt[i];
						}

					}
					System.out.print("잔돈 : ");
					for (int i = 0; i < coins.length; i++) {
						System.out.print(coins[i] + "(" + cnt[i] + ") ,");
					}
				}
				break;
			}
			switch (sel) {
			case 1:
				sum += price[0];
				break;
			case 2:
				sum += price[1];
				break;
			case 3:
				sum += price[2];
				break;
			case 4:
				sum += price[3];
				break;
			case 5:
				sum += price[4];
				break;
			default:
				System.out.println("선택옵션을 확인해주세요");
				continue;
			}
//			System.out.println("sum :"+sum);
			
		} // while(true)종료
		

	}

}
