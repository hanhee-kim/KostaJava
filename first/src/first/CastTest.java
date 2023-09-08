package first;

public class CastTest {

	public static void main(String[] args) {
		byte bt = 10;
		int i = bt;
		// 자동형변환

		byte bt2 = (byte) i;
		// 강제로 형변환을 해주어야 작은 족으로 들어간다

		float f = i;
		int i2 = (int) f; 	//소숫점 잘림

		double d1 = 2.33;
		float ff = (float) d1;

	}

}
