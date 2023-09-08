package test;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetTest1 {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(100);
		ts.add(50);
		ts.add(30);
		ts.add(150);
		
		System.out.println(ts);
		
		
		TreeSet<Person> tsp = new TreeSet<>(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.age-o2.age;
			}
			//Comparator 의 우선순위가 더 높기 때문에 나이순 정렬이 됨
		});
		tsp.add(new Person("hong",20));
		tsp.add(new Person("koko",15));
		tsp.add(new Person("jojo",50));
		tsp.add(new Person("toto",50));
		tsp.add(new Person("무무",70));
		tsp.add(new Person("toto",35));
		tsp.add(new Person("popo",40));
		tsp.add(new Person("toto",35));
		
		System.out.println(tsp);
		
		SortedSet<Person> subList = 
		tsp.subSet(new Person("",20),new Person("",60));
		
		//20대 이하~ 60 미만
		System.out.println(subList);
		
		Set<Person> ss = tsp.tailSet(new Person("",20));
		
		System.out.println(ss);
	}

}
