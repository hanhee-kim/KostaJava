package ex9;

public class Ex9 {
	static String delChar(String src, String delCh) {
		// 1. 내가 푼 방법
//		char[] del = new char[delCh.length()];
//		String res =src;
//		
//		for(int i=0;i<del.length;i++) {
//			del[i] = delCh.charAt(i);
//		}
//		
//		for(char c : del) {
//			res = res.replace(c,' ');
//		}
//		
//		return res.replaceAll(" ", "");
//		
//		// 2. 형섭씨 방법
//		String res = new String(src);
//		for(int i =0;i<delCh.length();i++) {
//			res = res.replace(String.valueOf(delCh.charAt(i)), "");
//		}
//		return res;

		// 3. 자바의 정석 풀이 방법
		StringBuffer sb = new StringBuffer(src.length());
		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);
			// ch delCh (indexOf() ) sb 가 에 포함되있지 않으면 로 못찾으면 에 추가
			if (delCh.indexOf(ch) == -1) // indexOf(int ch)를 호출
				sb.append(ch);
		}
		return sb.toString(); // StringBuffer String 에 저장된 내용을 으로 반환

	}

	public static void main(String[] args) {
		System.out.println("(1!2@3^4~5)" + " -> " + delChar("(1!2@3^4~5)", "~!@#$%^&*()"));
		System.out.println("(1 2 3 4\t5)" + " -> " + delChar("(1 2 3 4\t5)", " \t"));
	}
}
