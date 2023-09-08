package first;

public class OperTest3 {

	public static void main(String[] args) {

		System.out.println(10/4.0);
		
		//이항 연산자의 특징
		int kor = 99, eng = 88, math = 100;
		int total = kor+eng+math;
		double avergrage = total/3.0;
		System.out.println("총 점수 : "+total+"\n 평균 : "+avergrage);
		
		
		int mod = 10%3;
		System.out.println(mod);
		
		
		byte a=10;
		byte b=20;
		byte c=(byte)(a+b);
		
		
		int i1=100000;
		int i2=200000;
		int res = i1*i2;	
//		결과를 계산할때 int*int = int 이므로 오버플로우 => 
//		int의 범위를 벗어나기때문에 음수가 나옴
		
		System.out.println(res);
		
		long i3 = 100000*100000L;
		System.out.println(i3);
		
		int i4=1000000*100000/100000;
		System.out.println(i4);		
		int i5=1000000/100000*100000;
		System.out.println(i5);
		
		
		
	}

}
