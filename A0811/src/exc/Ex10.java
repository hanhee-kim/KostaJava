package exc;

public class Ex10 {

	public static void main(String[] args) {
//      [5-10] 다음은 알파벳과 숫자를 아래에 주어진 암호표로 암호화하는 프로그램이다.
//      (1)에 알맞은 코드를 넣어서 완성하시오.
//
		char[] abcCode = { '`', '~', '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '=', '|', '[',
				']', '{', '}', ';', ':', ',', '.', '/' };
		// 0 1 2 3 4 5 6 7 8 9
		char[] numCode = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' };

		String src = "abc123"; // a=97 0=48 a-z =97~122 0-9 = 48~57
		String result = "";
		// 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);

			if (97 <= ch && ch <= 122) { // a-z 면
				result += abcCode[ch - 97];
			} else if (48 <= ch && ch <= 57) { // 0-9면
				result += numCode[ch - 48];
			} else {
				System.out.println("변환불가");
			}

		}
		System.out.println("src:" + src);
		System.out.println("result:" + result);

	}

}
