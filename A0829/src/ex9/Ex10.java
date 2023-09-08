package ex9;

public class Ex10 {
	static String format(String str,int length,int alignment) {
						//변환할 문자열,	변환된 문자열의 길이,	변환된 문자열의 정렬조건)
						//0:왼쪽정렬 1:가운데정렬 2:오른쪽정렬
		if(length < str.length()) {
			return str.substring(0, length);
		}
//		str.toCharArray(); => 문자열을 char배열로 변환
		char[] carr = new char[length];
		char[] res = new char[str.length()];
		for(int i=0;i<carr.length;i++) {
			carr[i]=' ';
		}
		for(int i=0;i<str.length();i++) {
			res[i] = str.charAt(i);
		}
		switch(alignment) {
		case 0 : System.arraycopy(res, 0, carr, 0, str.length()); break;
		case 1 : System.arraycopy(res, 0, carr, (length-str.length())/2, str.length()); break;
		case 2 : System.arraycopy(res, 0, carr, length-str.length(), str.length()); break;		
		}
		//String으로 변환
		return new String(carr);
		
		/* 
		 (1) format메서드를 작성하시오.
		1. length의 값이 str의 길이보다 작으면 length만큼만 잘라서 반환한다.
		2. 1의 경우가 아니면, length크기의 char배열을 생성하고 공백으로 채운다.
		3. 정렬조건(alignment)의 값에 따라 문자열(str)을 복사할 위치를 결정한다.
		 (System.arraycopy()사용)
		4. 2에서 생성한 char배열을 문자열로 만들어서 반환한다.
		*/
	}
	
	public static void main(String[] args) {
		String str = "가나다";
		System.out.println(format(str,7,0)); // 왼쪽 정렬
		System.out.println(format(str,7,1)); // 가운데 정렬
		System.out.println(format(str,7,2)); // 오른쪽 정렬
		}
}
