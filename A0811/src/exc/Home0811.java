package exc;

public class Home0811 {

	public static void main(String[] args) {

//		[5-1] 다음은 배열을 선언하거나 초기화한 것이다. 잘못된 것을 고르고 그 이유를 설명하시오.
//		d - 배열을 초기화를 해주면서 크기를 동시에 설정하여 에러
//		e - 배열을 선언만 할 때 크기를 지정할 수 없다.
//		[5-2]다음과 같은 배열이 있을 때, arr[3].length의 값은 얼마인가?
//		4
//		[5-3]배열 arr에 담긴 모든 값을 더하는 프로그램을 완성하시오.
//		int[] arr = { 10, 20, 30, 40, 50 };
//		int sum = 0;
//		
//		for(int i=0;i<arr.length;i++) {
//			sum+=arr[i];
//		}
//		System.out.println("sum="+sum);
//		
		
//		[5-4]2차원 배열 arr2에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오.
//		int[][] arr = {
//				{5,5,5,5,5},
//				{10,10,10,10,10},
//				{20,20,20,20,20},
//				{30,30,30,30,30}
//		};
//		int total = 0;
//		float average = 0;
//		float cnt = 0;
//		
//		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				total+=arr[i][j];
//				cnt++;
//			}
//		}
//		average=total/cnt;
//		System.out.println(String.format("합계 : %d , 평균 : %.2f ", total,average));
		
//		[5-5]다음은 1과 9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램이다. (1)(2)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		//배열 ballArr 임의의 요소 2개를 골라서 위치를 바꾼다. 20번 반복
		for(int i=0;i<20;i++) {
			//x ,y 는 ballArr의 길이에 맞는 랜덤함수를 사용하여 인덱스 번호를 추출.
			int x = (int)(Math.random()*ballArr.length);
			int y = (int)(Math.random()*ballArr.length);
			int tmp = 0;
			
			tmp=ballArr[x];
			ballArr[x]=ballArr[y];
			ballArr[y]=tmp;
			
		}	
		//배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사
		for(int i=0;i<ball3.length;i++) {
			ball3[i]=ballArr[i];
		}
		
		
		for(int i = 0; i<ball3.length;i++) {
			System.out.print(ball3[i]);
			
		}
//		[5-6]다음은 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다.
//		변수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 계산해서 출력하라.
		
		
		
		
		
		
		
		
	}//main

}//class
