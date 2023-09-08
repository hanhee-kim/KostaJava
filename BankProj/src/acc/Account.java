package acc;

import java.io.Serializable;

import exc.BankError;
import exc.BankException;

public class Account implements Serializable{
	private String id;
	String name;
	int balance;
	
	
	public Account(){}
	public Account(String id,String name,int money){
		this.id = id;
		this.name = name;
		this.balance = money;
	}

	
	@Override
	public String toString() {
		return String.format("계좌번호:%s,이름:%s,잔액:%d", this.id, this.name, this.balance);
	}
	

	public void deposit(int money) throws BankException{
		if(money <= 0) {
			throw new BankException("입금오류",BankError.MINUS);	
		}
		this.balance += money;
	}

	public void withdraw(int money) throws BankException{ //Bank의 withdraw 한테 던짐
		if(balance<money) {
			throw new BankException("출금오류", BankError.LACK);
		}
		if (balance >= money) {
			this.balance -= money;
		}
//		else {
//			System.out.println("잔액이 부족합니다.");
//		}
	}
	
	
	
	//getter setter
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	
	


}
