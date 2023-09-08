class Account {
	String id;
	String name;
	int balance;
	Account(){}
	Account(String id,String name,int money){
		this.id = id;
		this.name = name;
		this.balance = money;
	}
	String info() {
		return String.format("계좌번호:%s,이름:%s,잔액:%d", this.id, this.name, this.balance);
	}

	void deposit(int money) {
		this.balance += money;
	}

	void withdraw(int money) {
		if (balance >= money) {
			this.balance -= money;
		} else {
			System.out.println("잔액이 부족합니다.");
		}
	}
}

class Bank {
	Account[] accs = new Account[100];	//하나의 클래스가 클래스의 속성으로 들어가있는 구조
	int accCnt;		//생성된 계좌의 개수를 관리하는 변수

	void makeAccount(String id, String name, int money) {
		Account acc = new Account(id,name,money);
		accs[accCnt++] = acc;

	}
	void allAccountInfo() {
		
		for(int i=0;i<accCnt;i++) {
			System.out.println(accs[i].info());
		}
		
	}
	void accountInfo(String id) {
		Account acc = findAccount(id);
		if(acc==null) {
			System.out.println("계좌번호가 틀립니다.");
			return;
		}
		acc.info();
	}
	void deposit(String id,int money) {
		Account acc = findAccount(id);
		if(acc==null) {
			System.out.println("계좌번호가 틀립니다.");
			return;
		}
		acc.deposit(money);
	}
	void withdraw(String id,int money) {
		Account acc = findAccount(id);
		if(acc==null) {
			System.out.println("계좌번호가 틀립니다.");
			return;
		}
		acc.withdraw(money);
	}
	
	Account findAccount(String id) {
		Account acc = null;
		for(int i=0;i<accCnt;i++) {
			if(accs[i].id.equals(id)) {
				return accs[i];
			}
		}
		return null;

	}
	
	
	
	
	
	
	
}

public class ClassTest5 {

	public static void main(String[] args) {

		Bank bank = new Bank();
		bank.makeAccount("10001", "고길동", 100000);
		bank.makeAccount("10002", "김길동", 200000);
		
		bank.allAccountInfo();
//		계좌번호:10001,이름:고길동,잔액:100000
//		계좌번호:10002,이름:김길동,잔액:200000
		
		bank.accountInfo("10001");
//		계좌번호:10001,이름:고길동,잔액:100000
		
		bank.deposit("10001",10000);
		bank.accountInfo("10001");
//		계좌번호:10001,이름:고길동,잔액:110000
		
		bank.withdraw("10001",5000);
		bank.accountInfo("10001");
//		계좌번호:10001,이름:고길동,잔액:105000

		
//		Account acc1 = new Account();
//		acc1.id = "10001";
//		acc1.name = "고길동";
//		acc1.balance = 100000;
//		
//		System.out.println(acc1.info());
//		
//		acc1.deposit(10000);
//		System.out.println(acc1.info());
//		
//		acc1.withdraw(20000);
//		System.out.println(acc1.info());

	}

}
