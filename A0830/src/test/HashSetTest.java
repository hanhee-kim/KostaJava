package test;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>(Arrays.asList(111,22,366,4755,52));
		//중복 데이터 들어가지 않음
		hs.add(234);
		hs.add(20);
		hs.add(10);
		hs.add(8);
		hs.add(10);
		for(Integer n : hs) {
			System.out.println(n);
		}
		System.out.println("===================");
		
		HashSet<Person> phs = new HashSet<>();
		phs.add(new Person("홍길동",23));
		phs.add(new Person("홍길동",30));
		phs.add(new Person("고길",33));
		phs.add(new Person("하동",40));
		phs.add(new Person("고길",33));
		
		for(Person p : phs) {
			System.out.println(p);
		}
		
		
		//TreeSet : Compare를 반드시 구현해야 값을 집어 넣을 수 있기 때문에 필수!!
		
	}

}
