package ex11_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Human implements Comparable<Human>{
	String id;
	String name;
	int age;
	String addr;
	Human (String id,String name,int age,String addr){
		this.id = id;
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		return String.format("%s,%s,%d,%s", id,name,age,addr);
	}

	@Override
	public int compareTo(Human o) throws NumberFormatException{
			int intId = Integer.parseInt(id);
			int intId2 = Integer.parseInt(o.id);
			return intId-intId2;
//			return id.compareTo(o.id);
	}
	
	
}
public class Ex11_5_2 {

	public static void main(String[] args) {
		ArrayList<Human> list = new ArrayList<>();
		list.add(new Human("000123","홍길동",24,"서울시 금천구"));
		list.add(new Human("931216","김코코",32,"경기도 광명시"));
		list.add(new Human("880505","강나나",37,"서울시 강서구"));
		list.add(new Human("991101","기리깃",27,"경기도 과천시"));
		list.add(new Human("021213","자바바",22,"서울시 송파구"));
		
		Collections.sort(list);
		Iterator<Human> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
