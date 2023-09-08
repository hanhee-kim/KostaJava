package first;

public class StringPlus {

	public static void main(String[] args) {

		int v1 = 10;
		int v2 = 20;
		int res = v1+v2; //피연산자 
		System.out.println(res);
		
		String str1 = "abc";
		String str2 = "def";
		String stres = str1+str2;
		System.out.println(stres);
		
		System.out.println(str1+res);
		
		
		String seven ="7";
		char seven1 ='7';
		int seven2 = 7;
		double seven3 = 7.0;
		
		System.out.println(seven+seven1+seven2+seven3);
		System.out.println(seven1+seven2);//문자열 포함이 되어있지 않아 char형 7이 아스키코드로 변환되어 계산됨
		
		
		
	}

}
