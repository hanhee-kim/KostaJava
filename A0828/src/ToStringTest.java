class Person {
	String name;
	int age;
	Person(String name , int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "이름 : "+name+", 나이 : "+age;
	}
	public String info() {
		return "이름 : "+name+", 나이 : "+age;
	}

	@Override
	public boolean equals(Object obj){
		if(obj instanceof Person == false) return false;
		Person person = (Person) obj;
		return (name.equals(person.name)) && (age == person.age);
	}
}
public class ToStringTest {

	public static void main(String[] args) {
		Person p1 = new Person("hong",30);
		Person p2 = new Person("hong",30);
		System.out.println(p1.info());
		System.out.println(p1);
		String str = "!!!"+p1;

		System.out.print(p1.equals(p2));


	}

}
