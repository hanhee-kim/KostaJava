package test;

public class StringTest3 {

	public static void main(String[] args) {
		
		//문자열과 기본형간의 변환
		String str1 = 100+""; 	
		String str2 = String.valueOf(100); 	//더 빠름
		
		int i = Integer.parseInt(str1);
		int i2 = Integer.valueOf(str2);	//JDK1.5이후
		char c = "A".charAt(0); //문자열 "A"를 문자 'A'로 변환
		
		
	}

}
