class Person1{
	int age;
	String name;
	
	Person1(){		
		this("none",0); //생성자에서 다른 생성자 호출, 반드시 생성자 맨 처음에 호출해야 함
	}
	Person1(String name,int age){
		this.age= age;
		this.name = name;
	}//파라미터가 있는 생성자가 하나라도 있을 경우 기본생성자를 반드시 작성해주어야함
	Person1(String name){
		this(name,0);
	}
	Person1(int age){
		this("none",age);
	}
	Person1(Person1 p){
		name = p.name;
		age = p.age;
	}
//	String info(Person1 this) {
//		return "이름:"+this.name+"나이:"+this.age;
//	}
}
public class ConstructorTest1 {

	public static void main(String[] args) {

		Person1 per1 = new Person1("홍길동",20);
		Person1 per2 = new Person1();
		per2.name = "고길동";
		per2.age = 30;
		Person1 per3 = new Person1("차길동");
		Person1 per4 = new Person1(40);
		Person1 per5 = new Person1(per1);
		//per1과 같은 값을 가지고있는 per5를 생성
		
	}

}
