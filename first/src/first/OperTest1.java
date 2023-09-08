package first;

public class OperTest1 {

	public static void main(String[] args) {

		int i = 10;
		i++;
		System.out.println(i);	//11
		++i;
		System.out.println(i);	//12
		
		int m =100;
		int res = ++m;	//증가도니 값을 연산의 결과로 줌.
		System.out.println(res);
		res = m++;	//증가되기 이전의 값을 연산의 결과로 줌.
		System.out.println(res); 
	}

}
