
public class ArrayTest4 {

	public static void main(String[] args) {
		
		String hex = "13A0C";
		String[] binary = new String[] {
				"0000", "0001", "0010", "0011",
				"0100", "0101", "0110", "0111", 
				"1000", "1001", "1010", "1011",
				"1100", "1101", "1110", "1111" }; // 16진수로 표현
		
		// 0 1 2 3
		// 4 5 6 7
		// 8 9 A B
		// C D E F
		
		String result = "";
		for(int i = 0; i<hex.length();i++) {		
			char ch = hex.charAt(i);
//			System.out.println(ch);
			if(ch>='0' && ch<='9') {
				result += binary[ch-'0'];
				//ch를 기준으로 result가 담겨야함
			}
			else {
				result += binary[9+ch-'A'+1];
			}
		}
		System.out.println("hex : "+hex);
		System.out.println("result : "+result);
		
		
	}

}
