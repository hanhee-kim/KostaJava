package exc;

public class Ex8 {

	public static void main(String[] args) {
//      [5-8] 다음은 배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 ‘*’
//      을 찍어서 그래프를 그리는 프로그램이다. (1)~(2)에 알맞은 코드를 넣어서 완성하시오.
//
      int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 }; // 1-3 , 2-2 , 3-2 , 4-4
      int[] counter = new int[4];

      for (int i = 0; i < answer.length; i++) {
         int cnt = 0;
         int target = i + 1;
         for (int j = 0; j < answer.length; j++) {
            if (answer[j] == target) {
               cnt++;
            }
         }
         if (target > 4)
            break;
         counter[i] = cnt;
      }
//      for(int i : counter) {
//         System.out.println(i);
//      }

      for (int i = 0; i < counter.length; i++) {
         System.out.print(counter[i]);
         
         for(int j = 0;j<counter[i];j++) {
            System.out.print("*");
         }
         System.out.println();
      }

	}

}
