package first;

public class MuInfo {

	public static void main(String[] args) {
		
//		이름을 저장할 변수 선언하여 본인 이름 할당
//		나이를 저장할 변수 선언하여 본인 나이 할당
//		키를 저장할 변수 선언하여 본인 키 소숫점까지 할당
//		남녀 구분을 저장할 변수를 선언하여 본인 성별 할당 'F' or 'M'
		
		String name;
		name = "김한희"; //실제 메모리의 주소값을 저장하는 참조형 변수.
		int age;
		age = 29;
		double height;
		height = 165.4;
		char gender;
		gender = 'F';
		
		System.out.println("안녕하세요. 제 이름은 "+name+" 입니다.");
		System.out.println("나이는 만"+age+"살, 키는 "+height+" 성별은 "+gender+" 입니다.");

		String consol = String.format("%s, %d, %.2f %c",name,age,height,gender);
		System.out.println(consol);
		
		final double pi = 3.14;
		//상수는 변경불가능 
		
		
		
	}

}
