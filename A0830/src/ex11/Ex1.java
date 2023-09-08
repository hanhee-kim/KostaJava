package ex11;

import java.util.ArrayList;

public class Ex1 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		ArrayList kyo = new ArrayList(); // 교집합 ( 중복되는거 )
		ArrayList cha = new ArrayList(); // 차집합 ( 합 - 중복 )
		ArrayList hap = new ArrayList(); // 합집합 ( 두개 합친거 )
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);
		/*
		 * (1) 알맞은 코드를 넣어 완성하시오.
		 */
		kyo.addAll(list1);		//1,2,3,4	(llist1 을 추가해조~~)
		kyo.retainAll(list2);	//3,4 ( list2에 있는 것만 남겨조~~)
		
//		cha.addAll(list1);		//1,2,3,4
//		cha.removeAll(list2);	//1,2
		
		cha.addAll(list1);		//1,2,3,4
		cha.addAll(list2);		//1,2,3,4,3,4,5,6
		cha.removeAll(kyo);		//1,2,5,6	( kyo 지워조~~~~~~~~)
		
		hap.addAll(list1);		//1,2,3,4
		hap.remove(kyo);		//1,2
		hap.addAll(list2);		//1,2,3,4,5,6
		
		
		System.out.println("list1=" + list1);
		System.out.println("list2=" + list2);
		System.out.println("kyo=" + kyo);
		System.out.println("cha=" + cha);
		System.out.println("hap=" + hap);
	}
}
