package test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest4 {

	static void print(List<Integer> list) {
		for(Integer n : list) {
			System.out.print(n+",");
		}
		System.out.println();
	}
	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<>(10);
		list1.add(5);
		list1.add(4);
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(3);
		
		List<Integer> list2 = list1.subList(1, 4);
		print(list1);
		print(list2);
		System.out.println(list1.containsAll(list2)); //포함하고 있는지 true false 반환
		System.out.println("======================");
		list1.retainAll(list2); 	//list1에 list2만 남기고 삭제
		print(list1);
		System.out.println("======================");
		list1.add(0,6); 	//add = insert 0번째에 6삽입
		print(list1);
		list1.set(0,7); 	//set 0번째에 7로 변경
		print(list1);
		list1.add(7);
		print(list1);
		list1.remove(new Integer(7)); 	//Integer를 작성하지 않으면 index7번재라고 인식해서 작성함
		print(list1);					//첫번째에 있는 7을 삭제함
		
		
		
	}

}
