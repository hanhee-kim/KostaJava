package test;

import java.util.HashSet;

class Person{
	String name ;
	int age;
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public int hashCode() {
		return name.hashCode()+age;
	}
	
	@Override
	public String toString() {
		return name+","+age;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person == false) {
			return false;
		}
		Person p = (Person)obj;
		return name.equals(p.name) && age == p.age;
	}
}
public class HashCodeTest1 {

	public static void main(String[] args) {
		String str1 = "hong";
		String str2 = "hong";
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		//같은 값을 가르키는 주소값의 해시코드는 동일하다
		
		Person p1 = new Person("koko", 23);
		Person p2 = new Person("koko", 23);
//		Person p2 = new Person(str1, 30);
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p1.equals(p2));
		
		
		HashSet hs = new HashSet();
		hs.add(p1);
		hs.add(p2);
		for(Object o :hs) {
			System.out.println(o);
		}
		//HashSet이 내부적으로 추가할때 equals 와 HashCode를 비교하여 값을 추가한다
		//equals가 true라면 중복으로 추가하지 않는다.
		//Set은 동일한 데이터가 들어가지 않는다.
		
		//내부에서 같은 데이터인지의 여부를 입력되는 데이터의 hashCode()와 equals()함수로 판단한다.
		//내가 원하는 대로 사용하려면 오버라이딩을 꼭 해주어야함
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
