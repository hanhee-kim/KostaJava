package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest2 {
	
	static void print(List<Integer> list) {
		for(Integer n : list) {
			System.out.print(n+",");
		}
		System.out.println();
	}
	static void print2(List<Person> list) {
		for(Person n : list) {
			System.out.println(n+",");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		
		ArrayList<Integer> list2 = new ArrayList<>(list1);
		
//		list2.add(list1.get(0));
		print(list1);
		print(list2);
		
		
		List<Integer> subList = list1.subList(2, 4);
		print(subList);
		
		Collections.sort(list1);
		//원본을 정렬해줌
		print(list1);
		
		ArrayList<Person> list3 = new ArrayList<>();
		list3.add(new Person("koko",30));
		list3.add(new Person("kim",20));
		list3.add(new Person("nana",25));
		
		Collections.sort(list3); //ArrayListTest1 에서 Person class에 정렬기준을 정해놓음
		print2(list3);
		
		
		
		
	}

}
