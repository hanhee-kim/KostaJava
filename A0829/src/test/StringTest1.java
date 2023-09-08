package test;

public class StringTest1 {

	public static void main(String[] args) {
		String a = "a";
		a = "b";
		
		int n = 10;
		n = 20;
		
		String s1 = null;
		String s2 = "";
		//둘은 다름 ""; 은 null 을 가르키는 주소값이 들어감
		
		char c1 = ' '; 
		//char는 무조건 비어있을 수 없다 스페이스바라도 들어가야함.
		
		String s3 = new String("abc");
		char[] carr = {'a','b','c'};
		String s4 = new String(carr);
		System.out.println(s3);
		System.out.println(s4);
		
		StringBuffer buffer = new StringBuffer("abcd");
		String s5 = new String(buffer);
		System.out.println(s5);
	}

}
