package Ex6;

public class Ex22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "123";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
		str = "1234o1";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
	}

	static Boolean isNumber(String str) {
		if(str.equals(null) || str.length()==0) return false;
		for(int i=0;i<str.length();i++) {
			char[] ch = new char[str.length()];
			ch[i] = str.charAt(i);
			
			if(!(ch[i] >= '0' && ch[i] <= '9')) {
				return false;
			}// if문을 통해 false가 반한되지 않고 for문을 전부 돈다면 전부 숫자
		}
		return true;
	}

}
