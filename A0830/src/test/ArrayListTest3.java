package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Account {
	String id;
	int balance;
	Account(){}
	Account(String id,int balance){
		this.id = id;
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return String.format("계좌번호 : %s ,잔액 : %d", id,balance);
	}
}
//비교자체를 할 수 있는 클래스를 따로 Comparator<>를 상속받아 메서드를 구현해야함
class IdCompare implements Comparator<Account> {

	@Override
	public int compare(Account o1, Account o2) {
		return o1.id.compareTo(o2.id);
//		return o2.id.compareTo(o1.id); //desc
	}
	
}
public class ArrayListTest3 {

	public static void main(String[] args) {
		List<Account> accs = new ArrayList<>();
		accs.add(new Account("nana",100));
		accs.add(new Account("koko",300));
		accs.add(new Account("park",400));
		
		
		//비교하는 compare 함수를 호출할 수 있는 객체를 넣어주어야한다.
		Collections.sort(accs, new IdCompare());
		for(Account acc : accs) {
			System.out.println(acc);
		}
		for(int i=0;i<accs.size();i++) {
			System.out.println(accs.get(i));
		}
		
		//반복자 - ( 중간에 데이터를 삭제하거나 삽입할때 유용 )
		Iterator<Account> it = accs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
	}

}
