package Exc;

public class Ex_snail {

	   public static void main(String[] args) {

	      int well = 300;
	      int day;
	      int distance =55-3;
	      
	      day = (well/distance);
	      if(well%distance>0) {
	         day+=1;
	      }
	      System.out.println(day);
	      
	      //2번째
	      int day2 = 0;
	      while(true) {
	         day2++;
	         well-=55;
	         if(well<=0) {
	            break;
	         }
	         well+=3;      
	      }
	      System.out.println(day2);
	   
	      //강사님 풀이
	      int depth = 3*100;
	      int height = 0;
	      final int up = 55;
	      final int down = 3;
	      int days = 0;
	      
	      while(true) {
	    	  height += up;
	    	  days++;
	    	  if(depth<=height)break;
	    	  height -=down;
	      }
	      
	   }

	}
