package inheritanceTest;

class Person{
	int age;
	String name;
	
	Person(){}
	Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	String info() {
		return "이름 : "+this.name+", 나이 : "+this.age;
	}
}
class Student extends Person{
	String major;
	int grade;
	
	Student(){}
	Student(String name, int age){
//		this.name = name;
//		this.age = age;
		super(name,age);
	}
	Student(String name , int age, String major, int grade){
		super(name,age);
		this.major = major;
		this.grade = grade;
	}
	@Override		//상속이 전제조건, 재정의
	String info() {	//부모의 메서드를 재정의 한다.
		return super.info()+" ,전공 : "+this.major+", 학년 : "+this.grade;
	}
}
public class InheritTest1 {

	public static void main(String[] args) {

		Student stu1 = new Student("안녕히",20);
		System.out.println(stu1.info());
		
		stu1.name = "열심히";
		stu1.age = 20;
		stu1.major = "산업공학";
		stu1.grade = 3;
		// 자식 객체를 통해 부모 클래스의 속성과 메서드를 사용할 수 있다.
		
		Student stu2 = new Student ( "돈많은", 40 , "금융", 3);
		
		System.out.println(stu2.info());
		
		
		
		
		
		Person per1 = new Person();
		per1.name = "내로남불";
		per1.age = 30;
//		per1.major = "얌채과";
//		per1.grade = 3;
		System.out.println(per1.info());
		
		
		
		
		
	}

}
