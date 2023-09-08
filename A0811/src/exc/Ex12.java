package exc;

public class Ex12 {

	public static void main(String[] args) {
		/*
		 3m 짜리 우물 바닥에 달팽이가 있다.-300cm
		 달팽이는 낮동안 55cm 올라올 수 있다. +55
		 하지만 날이 지면 잠을 자야 한다. 자는 동안 3cm를 미끄러져 내려온다. -3
		 달팽이가 우물 밖으로 나오는데 몇일이 걸릴까?
		 하루동안 자고 올라오는 +55-3 ==52
		 */
		int day=1;
		int gap=300/(55-3);
		int well = (-300);
		for(int i=0;i<=gap;i++) {
			if(day==1) {
				well+=55;
				well-=3;
			}
			
			
		}
		
		
//		int[] well =new int[300];
//		for(int i=0;i<well.length;i++) {
//			if(day==1) {
//				well
//			}
//		}
		
		
	}

}
