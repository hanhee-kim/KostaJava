package first;
import java.util.Scanner;

public class Home0810 {

   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      /*
      
      //[4-1] 다음의 문장들을 조건식으로 표현하라.
//      1. int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
      
      
      int x;
      System.out.print("정수입력 :");
      x= sc.nextInt();   
      if (10 < x && x < 20) {
         System.out.println("true");
      }
      
//      2. char형 변수 ch가 공백도 탭이 아닐 때 true인 조건식
      char ch;
      System.out.print("char입력 :");
      ch = sc.next().charAt(0);
      
      if(ch!= ' ' && ch!='\t') {
         System.out.println("true");
      }
      else {
         System.out.println("false");
      }
      
      //다르게 적을 경우
      if(!(ch == ' ' || ch == '\t')) {System.out.println("true");}

//      3. char형 변수 ch가 ‘x' 또는 ’X'일 때 true인 조건식
      if(ch=='x' || ch=='X') {
         System.out.println("true");
      }
      else {
         System.out.println("false");
      }
      
//      4. char형 변수 ch가 숫자(‘0’~‘9’)일 때 true인 조건식
      switch(ch) {
      case 0:
         System.out.println("true");
         break;
      case 1:
         System.out.println("true");
         break;
      case 2:
         System.out.println("true");
         break;
      case 3:
         System.out.println("true");
         break;
      case 4:
         System.out.println("true");
         break;
      case 5:
         System.out.println("true");
         break;
      case 6:
         System.out.println("true");
         break;
      case 7:
         System.out.println("true");
         break;
      case 8:
         System.out.println("true");
         break;
      case 9:
         System.out.println("true");
         break;
      default:
         System.out.println("false");

      }
      //if문으로 변경했을때 
      if(ch>='0' && ch<='9') {
    	  System.out.println("true");
      }
      
      
      
//      5. char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
      if((ch>=65 && ch<=95) || (ch>=97 && ch<=122) ) {
         System.out.println("true");
      }
//      6. int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지
//       않을 때 true인 조건식
      int year;
      System.out.print("정수입력 : ");
      year = sc.nextInt();
      
      if(year%400==0 || (year%4==0 && year%100!=0)) {
         System.out.println("true");
      }
//      7. boolean형 변수 powerOn가 false일 때 true인 조건식
      boolean powerOn;
      System.out.println("true or false 입력 :");
      powerOn = sc.nextBoolean();
      
      if(!powerOn) {
         System.out.println("true");
      }
      else {
         System.out.println("false");
      }
      
      
//      8. 문자열 참조변수 str이 “yes”일 때 true인 조건식
      String str=sc.next();
      if(str.equals("yes")) {
         System.out.println("true");
      }
      */
      
      /*
//      [4-2] 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
      int sum=0;
      for(int i=1;i<21;i++) {
         if(i%2!=0 && i%3!=0) {
            sum=sum+i;
         }
      }
      System.out.println(sum);
      
      
//      ---------------------------------------------
//      continue를 사용
      
      for(int i=1;i<21;i++) {
    	  
    	  if(i%2==0 || i%3==0) {
    		  continue;
    	  }
    	  
    	  sum+=i;
      }
      System.out.println(sum);
    		  
      */
      
      
      
      /*
//      [4-3] 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과를 계산하시오.
      
      int sum=0;
      for(int i=1; i<11; i++) {
         for(int j=1; j<=i;j++) {
            sum+=j;
         }
      }
      System.out.println(sum);
      */
      
//      [4-4] 1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 
//      100이상이 되는지 구하시오.
      
//      //for문
//      int sum=0;
//      for(int i =1;;i++) {
//         if(i%2==0) {
//            sum-=i;
////            System.out.println("2"+sum+" "+i);
//         }
//         else {
//            
//                  sum+=i;
////            System.out.println(sum+" "+i);
//         }
//         if(sum>=100) {
//            System.out.println("i : "+i);
////            System.out.println(sum);
//            break;
//         }
//      }
      /*
//      선생님 풀이
      int sum = 0,i;
      for(i =1;;i++) {
//    	  if(i%2==0) sum+=-i;
//    	  else sum+=i;
    	  sum+=(i%2==0)?-i:i;	//삼항조건연산자 활용
    	  
    	  if(sum>=100)break;
      }
      System.out.println("sum : "+sum+" , i : "+i);
      
      */
      
      
//      //while문
//      int i =1;
//      while(true) {
//         if(i%2==0) {
//            sum-=i;
//         }
//         else {
//         sum+=i;
//         }
//         if(sum>=100) {
//            System.out.println("합계 : "+sum+", i : "+i);
//            break;
//         }
//         i++;
//      }
      
      
      
//      [4-5] 다음의 for문을 while문으로 변경하시오.
      
//      for(int i=0; i<=10; i++) {
//         for(int j=0; j<=i; j++){
//            System.out.print("*");
//            }
//         System.out.println();
//         }
//      
//      int i=0;
//      while(i<=10) {
//    	 int j=0;
//         while(j<=i) {
//            System.out.print("*");
//            j++;
//         }
//         System.out.println();
//         i++;
//      }
      
      
//      [4-6] 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프
//      로그램을 작성하시오.
//      
//      int sum=0;
//      for(int i =1; i<7; i++) {
//         for(int j=1; j<7; j++) {
//            if((i+j)==6) {
//               System.out.println("첫번째 주사위 : "+i+" 두번째 주사위 : "+j);
//               //format 
//               System.out.println(String.format("(%d,%d)", i,j));
//            }
//         }
//      }
      
      
      
//      [4-7] Math.random()을 이용해서 1부터 6사이의 임의의 정수를 변수 value에 저장하는 
//      코드를 완성하라. (1)에 알맞은 코드를 넣으시오.
//      
//      int value = (int)(Math.random()*6)+1;
//      System.out.println("value:"+value);
      
//      [4-8] 방정식 2x+4y=10의 모든 해를 구하시오. 단, x와 y는 정수이고 각각의 범위는 
//            0<=x<=10, 0<=y<=10 이다.
      

//      for(int x=0;x<=10;x++) {
//         for(int y=0;y<=10;y++) {
//            if(2*x+4*y==10) {
//               System.out.println("x : "+x+", y : "+y);
//               
//               //format 사용
//               System.out.println(String.format(("(x : %d,y : %d)"),x,y));
//            }
//         }
//      }
      
      
//      [실행결과]
//            x=1, y=2
//            x=3, y=1
//            x=5, y=0
//      
//      [4-9] 숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코
//      드를 완성하라. 만일 문자열이 "12345"라면, ‘1+2+3+4+5’의 결과인 15를 출력이 출력되
//      어야 한다. (1)에 알맞은 코드를 넣으시오.
//      [Hint] String클래스의 charAt(int i)을 사용
//      [연습문제]
//	      String str = "12345";
//	      int sum = 0;
//	
//	      for(int i=0; i < str.length(); i++) {
//	         System.out.println(str.charAt(i));
//	         sum+=(str.charAt(i)-'0');                  
//	      }
//	      System.out.println("sum="+sum);
//      [실행결과]
//         15
      
//      [4-10] int타입의 변수 num 이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 
//      완성하라. 만일 변수 num의 값이 12345라면, ‘1+2+3+4+5’의 결과인 15를 출력하라. (1)
//      에 알맞은 코드를 넣으시오.
//      [주의] 문자열로 변환하지 말고 숫자로만 처리해야 한다.
//      int num = 12345;
//      int sum = 0;
//
//      while(num>0) {
//         sum += num%10;
//         num/=10;
//      }
//      System.out.println("sum="+sum);
//      

//      [실행결과]
//            15
//      [4-11] 피보나치(Fibonnaci) 수열(數列)은 앞을 두 수를 더해서 다음 수를 만들어 나가
//      는 수열이다. 예를 들어 앞의 두 수가 1과 1이라면 그 다음 수는 2가 되고 그 다음 수는 
//      1과 2를 더해서 3이 되어서 1,1,2,3,5,8,13,21,... 과 같은 식으로 진행된다. 1과 1부터 
//      시작하는 피보나치수열의 10번째 수는 무엇인지 계산하는 프로그램을 완성하시오.
//      [연습문제]
//            // Fibonnaci 수열의 시작의 첫 두 숫자를 1, 1로 한다.
      /*
             int num1 = 1; 
             int num2 = 1; 
             int numList []= new int [10];
             int num3 = 0; // 세번째 값 
             
             //1.
             System.out.print(num1+","+num2); 
             for (int i = 0 ; i < 8 ; i++ ) { 
               num3=num1+num2;
               System.out.print(","+num3);
               
               num1=num2;
               num2=num3;
             }
               
                    
               
          	//2.
            numList[0]=num1;
            numList[1]=num2;
           for (int i = 0; i < 8; i++) {
               num3 = num1 + num2; // 현재 항 
               numList[i+2] = num3;
               num1 = num2;
               num2 = num3;
           }
           for(int i=0;i<numList.length;i++) {
              System.out.print(numList[i]+",");
           }
           System.out.println(" 10번째 값 : "+numList[9]);
      		
      	*/
             
//      [실행결과]
//       1,1,2,3,5,8,13,21,34,55
           
           
           
//      [4-12] 구구단의 일부분을 다음과 같이 출력하시오.
//      [실행결과]
          
//      2*1=2    3*1=3    4*1=4
//      2*2=4    3*2=6    4*2=8
//      2*3=6    3*3=9    4*3=12
//      5*1=5    6*1=6    7*1=7
//      5*2=10    6*2=12    7*2=14
//      5*3=15    6*3=18    7*3=21
//      8*1=8    9*1=9
//      8*2=16    9*2=18
//      8*3=24    9*3=27
      
      //강사님 풀이...
//      for(int i=1;i<=3;i++) {
//    	  for(int dan=2; dan<=4;dan++) {
//    		  System.out.print(String.format("%d*%d=%d\t", dan,i,dan*i));
//    	  }
//    	  System.out.println();
//      }
//      System.out.println();
//      for(int i=1;i<=3;i++) {
//    	  for(int dan=5; dan<=7;dan++) {
//    		  System.out.print(String.format("%d*%d=%d\t", dan,i,dan*i));
//    	  }
//    	  System.out.println();
//      }
//      System.out.println();
//      for(int i=1;i<=3;i++) {
//    	  for(int dan=8; dan<=9;dan++) {
//    		  System.out.print(String.format("%d*%d=%d\t", dan,i,dan*i));
//    	  }
//    	  System.out.println();
//      }
//      System.out.println();
//      
//      강사님 다른 풀이
//      for(int i=0,dan=2; i < 3; i++,dan+=3) {  
//    	  for(int j =1; j<=3 ;j++) {
//    		  for(int k = dan; k<=((dan+2<10)?dan+2:9);k++) {
//        		  System.out.print(String.format("%d*%d=%d\t", k,j,k*j));
//    		  }
//    		  System.out.println();
//    	  }
//    	  System.out.println();
//      }
      
      
//      //자바의 정석 풀이
//         for(int i=1; i<10; i++) {
//            for(int j=1; j<4;j++) {
//            	//i와 j 를 바로 사용할 수 없기 때문에  x,y변수를 따로 설정해줌
//            	//패턴을 i와j를 사용하여 변수 x,y를 이용하여 식을 만든다.
//               int x = j+1+(i-1)/3*3;
//               int y = i%3==0? 3:i%3;
//               if(x>9) {	//9단까지만 출력한다. 이 코드가 없으면 10단까지 출력된다.
//                  break;
//               }
//               System.out.print(x+"*"+y+"="+x*y+"\t");
//            }
//            System.out.println();
//            if(i%3==0) {
//               System.out.println();
//            }
//         }
         
          
      
//      [4-13] 다음은 주어진 문자열(value)이 숫자인지를 판별하는 프로그램이다. (1)에 알맞
//      은 코드를 넣어서 프로그램을 완성하시오.
//      String value = "12o34"; 
//       char ch = ' '; 
//       boolean isNumber = true; 
//       // 반복문과 charAt(int i)를 이용해서 문자열의 문자를 // 하나씩 읽어서 검사한다. 
//       for(int i=0; i < value.length() ;i++) { //48~57 ,'0' , '9'로 입력가능
//          
//          if(value.charAt(i)>=48 && value.charAt(i)<=57) {
//             
//             isNumber = true;
//          }
//          else {
//             
//             isNumber = false;
//             break;
//          }
//       } 
//       if (isNumber) { 
//       System.out.println(value+"는 숫자입니다."); 
//       } else { 
//       System.out.println(value+"는 숫자가 아닙니다."); 
//       }
//      [실행결과]
//            12o34는 숫자가 아닙니다.
      
      
//      [4-14] 다음은 숫자맞추기 게임을 작성한 것이다. 1과 100사이의 값을 반복적으로 입력
//      해서 컴퓨터가 생각한 값을 맞추면 게임이 끝난다. 사용자가 값을 입력하면, 컴퓨터는 자
//      신이 생각한 값과 비교해서 결과를 알려준다. 사용자가 컴퓨터가 생각한 숫자를 맞추면 
//      게임이 끝나고 몇 번 만에 숫자를 맞췄는지 알려준다. (1)~(2)에 알맞은 코드를 넣어 프
//      로그램을 완성하시오.
//       //1~100사이의 임의의 값을 얻어서 answer에 저장한다. 
//      int answer =(int)(Math.random()*100)+1; 
//      int input = 0; // 사용자입력을 저장할 공간 
//      int count = 0; // 시도횟수를 세기위한 변수 
//      // 화면으로 부터 사용자입력을 받기 위해서 Scanner클래스 사용
//      java.util.Scanner s = new java.util.Scanner(System.in);
//      do { 
//      count++;
//      System.out.print("1과 100사이의 값을 입력하세요 :");
//      input = s.nextInt(); // 입력받은 값을 변수 input에 저장한다.
//      if(input<answer) {
//         System.out.println(input+"보다 큽니다.");
//      }
//      else if(input>answer) {
//         System.out.println(input+"보다 작습니다.");
//      }
//      else if(input==answer) {
//          System.out.println("정답입니다.\n시도 횟수는 "+count+"번 입니다.");
//          break;
//       }
//      } while(true); // 무한반복문 
      
//      [실행결과]
//            1과 100사이의 값을 입력하세요 :50
//            더 큰 수를 입력하세요.
//            1과 100사이의 값을 입력하세요 :75
//            더 큰 수를 입력하세요.
//            1과 100사이의 값을 입력하세요 :87
//            더 작은 수를 입력하세요.
//            1과 100사이의 값을 입력하세요 :80
//            더 작은 수를 입력하세요.
//            1과 100사이의 값을 입력하세요 :77
//            더 작은 수를 입력하세요.
//            1과 100사이의 값을 입력하세요 :76
//            맞췄습니다. 시도횟수는 6번입니다.
      
//      [4-15] 다음은 회문수를 구하는 프로그램이다. 회문수(palindrome)란, 숫자를 거꾸로 읽
//      어도 앞으로 읽는 것과 같은 수를 말한다. 예를 들면 ‘12321’이나 ‘13531’같은 수를 말한
//      다. (1)에 알맞은 코드를 넣어서 프로그램을 완성하시오. [Hint] 나머지 연산자를 이용하시오.
      
//      [연습문제]
//      int number = 12321; 
//      int tmp = number; 
//      int result =0; // 변수 number를 거꾸로 변환해서 담을 변수
//      int cnt =1;
//      while(tmp !=0) {
//         if(tmp%10 != 0) {
//            result+=tmp%10*cnt;
//            //cnt 1 ->10 cnt 2 ->100 cnt 3 -> 1000
//            tmp=tmp/10;
//            System.out.println(result);
//            System.out.println(tmp);
//            cnt*=10;           
//         }        
//      } 
//      if(number == result) 
//      System.out.println( number + "는 회문수 입니다."); 
//      else 
//      System.out.println( number + "는 회문수가 아닙니다.");
//      
//      [실행결과]
//            12321는 회문수 입니다.
       
//         System.out.println("회문 문자열 체크");
//         System.out.println(solution(sc.nextLine().toUpperCase()));
//      }
//
//      public static boolean solution(String input) {
//         return input.equals(new StringBuilder(input).reverse().toString());

//      int number = 12311; 
//    int tmp = number; 
//    int result =0; // 변수 number를 거꾸로 변환해서 담을 변수
//    
////    (((((1*10)+2)*10+3)*10+2)*10+1 
//    
////    result = 1 : 1
////    result = 1*10+2 : 12
////    result = (1*10+2)*10+3 : 123
////    result = ((1*10+2)*10+3)*10+2 : 1234
////    result = (((((1*10)+2)*10+3)*10+2)*10+1 : 12321
//    		
//
//    while(tmp !=0) {
//    	result = result*10+tmp%10;
//    	tmp /= 10;
//    } 
//    if(number == result) 
//    System.out.println( number + "는 회문수 입니다."); 
//    else 
//    System.out.println( number + "는 회문수가 아닙니다.");
      
      
      
      
      
   }

}