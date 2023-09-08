
public class ArrayTest3 {

	public static void main(String[] args) {

		char[] hex = new char[] { 'C', 'A', 'F', 'E', '2', '0', '2', '3' };
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

		for (int i = 0; i < hex.length; i++) {
			char ch =hex[i];
			if(ch>='0' && ch<='9') {
				result += binary[ch-'0'];
			}else {
				result += binary[9+ch-'A'+1];
			}
		}
		System.out.println("hex : "+new String(hex));
		System.out.println("binary : "+result);

	}// end main
}// end class
