
public class Lotto2 {

	public static void main(String[] args) {

		int[] ball = new int[6];
		int count = 0;
		boolean same = false;

		while (true) {
			int randomNumber = (int) (Math.random() * 45) + 1; // 1~44
			// ball 배열에서 randomNumber와 같은 값이 있는지 체크
			for (int i = 0; i < count; i++) {
				if (ball[i] == randomNumber) {
					same = true;
					break;
				}
			}
			if (same == false) {
				ball[count++] = randomNumber;
			}
			if (count == 6) {
				break;
			}
		}
		for (int i = 0; i < ball.length; i++) {
			System.out.print(ball[i]+",");
		}

	}

}
