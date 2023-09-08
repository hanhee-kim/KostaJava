
public class Lotto {

	public static void main(String[] args) {

		//int 타입 45개 배열 선언 -> 배열이름 ball
		int[] ball = new int[45];
		//ball 배열에 1~45까지ㅣ 값으로 초기화
		for(int i=0;i<ball.length;i++) {
			ball[i]=i+1;
		}
		//0~44 까지의 정수중 하나의 랜덤 정수 가져오기 -> 변수이름 idx1
		//0~44 까지의 정수중 하나의 랜덤 정수 가져오기 -> 변수이름 idx2
		for(int i=0;i<1000;i++) {
			
			int idx1 = (int)(Math.random()*45);
			int idx2 = (int)(Math.random()*45);
			
			int temp = ball[idx1];
			ball[idx1] = ball[idx2];
			ball[idx2] = temp;
		}
		
		
		for(int i=0;i<6;i++) {
			System.out.print( ball[i]+",");
		}
	}

}
