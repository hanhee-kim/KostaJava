
public class ClassTest1 {

	public static void main(String[] args) {
		//하나의 프로젝트당 main은 하나!
		//하나의 자바파일은 하나의 퍼블릭 클래스여야함!
		
		int n ;
		int[] arr = new int[3];
		//배열은 레퍼런스 타입.
		
		Student stu1 = new Student();
		//studen에 정의된 속성에 대한 메모리를 확보
		//class타입은 반드시 객체를 생성해주고 사용하여야한다.
		
		stu1.name = "홍길동";
		stu1.address = "서울시 금천구";
		stu1.grade = 4;
		stu1.num = 10001;

		System.out.println(stu1.info());
	}

}
