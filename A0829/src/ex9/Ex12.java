package ex9;

public class Ex12 {
	static int getRand(int from,int to) { //from 시작, to 끝
		//2~8 중에 정수형태의 랜덤값
//		int r = (int)(Math.random()*(8-2+1))+2;
		//(int)(Math.random()*(최대값-최소값+1))+최소값
		if( from > to) {
			int tmp = from;
			from = to;
			to = tmp;
		}
		int r = (int)(Math.random()*(to-from+1))+from;
		
		return r;
	}
	
	
	public static void main(String[] args) 
	{
	for(int i=0; i< 20; i++)
	System.out.print(getRand(1,-3)+",");
	}
}
