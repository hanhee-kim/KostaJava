
public class A0813 {

   public static void main(String[] args) {

//      [5-6] 다음은 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다. 
//      변수 money의 금액을 동전으로 바꾸었을 때 각각 몇 개의 동전이 필요한지 계산해서 출력하라.
//      단, 가능한 한 적은 수의 동전으로 거슬러 주어야한다. 
//      (1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.?
//      
//      
////      [연습문제]/ch5/Exercise5 6.java
//         // 큰 금액의 동전을 우선적으로 거슬러 줘야한다.
//      
//      int[] coinUnit = {500, 100, 50, 10};
//      int money = 2680;
//      int[] cnt = new int [4];      
//      System.out.println("money="+money);
//      for(int i=0;i<coinUnit.length;i++) {
//         cnt[i] = money/coinUnit[i];
//         money = money%coinUnit[i];               
//      }
//      for(int i = 0;i<cnt.length;i++) {
//         System.out.println(coinUnit[i]+"원 :"+cnt[i]);
//         
//      }

//      [5-7] 문제 5-6에 동전의 개수를 추가한 프로그램이다.
//      커맨드라인으로부터 거슬러 줄금액을 입력받아 계산한다. 
//      보유한 동전의 개수로 거스름돈을 지불할 수 없으면, ‘거스름 돈이 부족합니다.’라고 출력하고 종료한다. 
//      지불할 돈이 충분히 있으면, 거스름돈을 지불한 만큼 가진 돈에서 빼고 남은 동전의 개수를 화면에 출력한다. 
//      (1)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
//
//      if (args.length != 1) {
//         System.out.println("USAGE: java Exercise5_7 3120");
//         System.exit(0);
//      }
//
//      // 문자열을 숫자로 변환한다. 입력한 값이 숫자가 아닐 경우 예외가 발생한다.
//      int money = Integer.parseInt(args[0]);
//
//      System.out.println("money=" + money);
//      int[] coinUnit = { 500, 100, 50, 10 };
//      // 동전의 단위
//      int[] coin = { 5, 5, 5, 5 };
//      // 단위별 동전의 개수
//      for (int i = 0; i < coinUnit.length; i++) {
//         int coinNum = 0;
//         
//         coinNum = money/coinUnit[i];
//         
//         if(coinNum>coin[i]) {
//            money = money-(coinUnit[i]*coin[i]);
//            coinNum = coin[i];
//            coin[i] = 0 ;
//         }
//         else {         
//            money = money - (coinUnit[i]*coinNum);   
//            coin[i] = coin[i]-coinNum;
//         }
//         
//         System.out.println(coinUnit[i] + "원: " + coinNum);
//      }
//
//      if (money > 0) {
//         System.out.println("거스름돈이 부족합니다.");
//         System.exit(0); // 프로그램을 종료한다.
//      }
//      System.out.println("=남은 동전의 개수 =");
//
//      for (int i = 0; i < coinUnit.length; i++) {
//         System.out.println(coinUnit[i] + "원:" + coin[i]);
//      }
//
//      [5-8] 다음은 배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 ‘*’
//      을 찍어서 그래프를 그리는 프로그램이다. (1)~(2)에 알맞은 코드를 넣어서 완성하시오.
//
//      int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 }; // 1-3 , 2-2 , 3-2 , 4-4
//      int[] counter = new int[4];
//
//      for (int i = 0; i < answer.length; i++) {
//         int cnt = 0;
//         int target = i + 1;
//         for (int j = 0; j < answer.length; j++) {
//            if (answer[j] == target) {
//               cnt++;
//            }
//         }
//         if (target > 4)
//            break;
//         counter[i] = cnt;
//      }
////      for(int i : counter) {
////         System.out.println(i);
////      }
//
//      for (int i = 0; i < counter.length; i++) {
//         System.out.print(counter[i]);
//         
//         for(int j = 0;j<counter[i];j++) {
//            System.out.print("*");
//         }
//         System.out.println();
//      }

//    [5-9] 주어진 배열을 시계방향으로 90도 회전시켜서 출력하는 프로그램을 완성하시오.
      char[][] star = {   { '*', '*', ' ', ' ', ' ' }, 
                     { '*', '*', ' ', ' ', ' ' }, 
                     { '*', '*', '*', '*', '*' },
                     { '*', '*', '*', '*', '*' } };  // [4][5]
      char[][] result = new char[star[0].length][star.length]; //[5][4]
      
      for (int i = 0; i < star.length; i++) {
         for (int j = 0; j < star[i].length; j++) {
            System.out.print(star[i][j]);
         }
         System.out.println();
      }   //star배열 출력      
      System.out.println();
      
      for (int i = 0; i < star.length; i++) { //4
         for (int j = 0; j < star[i].length; j++) { //5
            int a = 0;
            if(a == 4);
            result[j][i] = star[star.length - 1 - i][j];
            
         }
      }
      for (int i = 0; i < result.length; i++) {
         for (int j = 0; j < result[i].length; j++) {
            System.out.print(result[i][j]);
         }
         System.out.println();
      }

//      [5-10] 다음은 알파벳과 숫자를 아래에 주어진 암호표로 암호화하는 프로그램이다.
//      (1)에 알맞은 코드를 넣어서 완성하시오.
//
//      char[] abcCode = 
//         { '`', '~', '!', '@', '#', '$', '%', '^', '&', '*',
//               '(', ')', '-', '_', '+', '=', '|', '[',
//            ']', '{', '}', ';', ':', ',', '.', '/' };
//      // 0 1 2 3 4 5 6 7 8 9 
//      char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
//      
//      
//      String src = "abc123"; // a=97 0=48 a-z =97~122 0-9 = 48~57
//      String result = "";
//      // 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
//      for (int i = 0; i < src.length(); i++) {
//         char ch = src.charAt(i);
//         
//         if(97<=ch && ch<=122) { //a-z 면
//            result+=abcCode[ch-97];
//         }
//         else if(48<=ch && ch<=57) { //0-9면
//            result+=numCode[ch-48];
//         }
//         else {
//            System.out.println("변환불가");
//         }
//         
//      }
//      System.out.println("src:" + src);
//      System.out.println("result:" + result);

//      [5-11] 주어진 2차원 배열의 데이터보다 가로와 세로로 1이 더 큰 배열을 생성해서 
//      배열의 행과 열의 마지막 요소에 각 열과 행의 총합을 저장하고 출력하는 프로그램이다.
//      (1) 에 알맞은 코드를 넣어서 완성하시오.
//      
//      int[][] score = {   {100, 100, 100} , 
//                     {20, 20, 20} , 
//                     {30, 30, 30} , 
//                     {40, 40, 40} , 
//                     {50, 50, 50} };
//      int[][] result = new int[score.length + 1][score[0].length + 1];
//      
//      for (int i = 0; i < score.length; i++) {
//         for (int j = 0; j < score[i].length; j++) { //score[i+1][j+1]
//            result[i][j]=score[i][j];
//            result[i][score[0].length]+=result[i][j]; //행의 합
//            result[score.length][j]+=result[i][j];   //열의 합
//            result[score.length][score[0].length]+=score[i][j];
//            
//         }
//         
//      }
//      for (int i = 0; i < result.length; i++) {
//         for (int j = 0; j < result[i].length; j++) {
//            System.out.printf("%4d", result[i][j]);
//         }
//         System.out.println();
//      }

      
   }

}