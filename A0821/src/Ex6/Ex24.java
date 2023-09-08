package Ex6;

public class Ex24 {

	public static void main(String[] args) {
		int value = 5;
		System.out.println(value+"의 절대값:"+abs(value));
		value = -10;
		System.out.println(value+"의 절대값:"+abs(value));
	}
	static int abs(int value) {
		value = (int)(Math.sqrt(value*value));
		return value;
//		return Math.abs(value);
//		return value >= 0 ? value : -value;
	}
}
