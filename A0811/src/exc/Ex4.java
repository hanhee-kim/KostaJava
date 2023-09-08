package exc;

public class Ex4 {

	public static void main(String[] args) {
//		[5-4]2차원 배열 arr2에 담긴 모든 값의 총합과 평균을 구하는 프로그램을 완성하시오.
		int[][] arr = {
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
		};
		int total = 0;
		float average = 0;
		float cnt = 0;
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				total+=arr[i][j];
				cnt++;
			}
		}
		average=total/cnt;
		System.out.println(String.format("합계 : %d , 평균 : %.2f ", total,average));
		
	}

}
