package exc;

public class Ex9 {

	public static void main(String[] args) {
//	    [5-9] 주어진 배열을 시계방향으로 90도 회전시켜서 출력하는 프로그램을 완성하시오.
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
	}

}
