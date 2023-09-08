package Ex7;

public class Ex18 {

	static void action(Robot ro) {
		
		if (ro instanceof DanceRobot) {
			DanceRobot danceRo = (DanceRobot) ro;
			danceRo.dance();
		}else if (ro instanceof SingRobot) {
			SingRobot singRo = (SingRobot) ro;
			singRo.sing();
		}else if (ro instanceof DrawRobot) {
			DrawRobot drawRo = (DrawRobot) ro;
			drawRo.draw();
		}
	}
	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };
		for (int i = 0; i < arr.length; i++)
			action(arr[i]);
	} // main
}

class Robot {
}

class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 합니다.");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}
