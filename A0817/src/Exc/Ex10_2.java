package Exc;


public class Ex10_2 {

   public static void main(String[] args) {
//      [5-10] 다음은 알파벳과 숫자를 아래에 주어진 암호표로 암호화하는 프로그램이다.
//      (1)에 알맞은 코드를 넣어서 완성하시오.
//
      //a-z
      char[] abcCode = 
         { '`', '~', '!', '@', '#', '$', '%', '^', '&', '*',
               '(', ')', '-', '_', '+', '=', '|', '[',
            ']', '{', '}', ';', ':', ',', '.', '/' };
      // 0 1 2 3 4 5 6 7 8 9 
      char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
      
      
      String src = "`~!wer"; 
      String result = "";//abc123
      
      for (int i = 0; i < src.length(); i++) {
         char ch = src.charAt(i);
         for(int j=0;j<abcCode.length;j++) {
            if(ch == abcCode[j]) {
               result+=(char)(j+'a');
            }
         }
         for(int k=0;k<numCode.length;k++) {
            if(ch == numCode[k]) {
               result+=k;
            }
         }
      }
      System.out.println("src:" + src);
      System.out.println("result:" + result);
   }

}
