package test;

import java.util.ArrayList;

class Person implements Comparable<Person>{
	String name;
	int age;
	Person(){
		
	}
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		
		return name.hashCode()+age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person == false) {
			return false;
		}
		Person p = (Person)obj;
		return name.equals(p.name) && age == p.age;
	}
	
	@Override
	public String toString() {
		return "("+name+""+age+")";
	}
	//sort함수를 사용하기위해서 기준점을 만들어줌
	//Comparble<>을 상속받아 메서드를 구현함
	@Override
	public int compareTo(Person person) {
		//이름순
		return name.compareTo(person.name);
		//나이순
//		return age-person.age;
	}
}
public class ArrayListTest1 {

	public static void main(String[] args) {
		ArrayList arrList = new ArrayList();
		arrList.add(100);
		int n = (Integer)arrList.get(0);
		//Object -> 다운캐스팅해줘야함
		
		ArrayList al2 = new ArrayList();
		al2.add(new Person());
		Person p = (Person)al2.get(0);
		
		
		//////////////////////////////////////
		
		//제네릭 안에는 클래스만 올 수 있음
		//1.컴파일 시점에 클래스를 만들고
		//2.문법이 맞는지 확인
		ArrayList<Person> al3 = new ArrayList<>();
		al3.add(new Person());
		Person p2 = al3.get(0);
		
		
		
		
		
	}

}
