package dbConnectPack;

import java.sql.Connection;
import java.util.List;

public class AccountService {
	//계좌 정보 출력
	public void accountInfo(String id) {
		Connection conn = Dao.getConnection();
		Account acc = Dao.selectAccount(conn,id);	//있는지 먼저 체크
		if(acc == null) {
			System.out.println("없는 계좌입니다.");
		} else {
			System.out.println(acc);
		}
		Dao.close(conn);
	}
	//계좌 만들기
	public void makeAccount(Account acc) {
		Connection conn = Dao.getConnection();
		Account racc = Dao.selectAccount(conn, acc.getId());	//있는지 먼저 체크
		if(racc != null) {
			System.out.println("중복계좌번호입니다.");
		} else {
			int cnt = Dao.insertAccount(conn,acc);
			if(cnt>0) {
				System.out.println(cnt+"계좌가 개설되었습니다.");
			}
		}
		Dao.close(conn);
	}
	//입금
	public void deposit(String id,Integer money) {
		Connection conn = Dao.getConnection();
		Account acc = Dao.selectAccount(conn, id);
		if(acc == null) {
			System.out.println("계좌번호가 틀립니다.");
			return;
		}
		acc.deposit(money);		//class (객체)계좌에 입금을 한것
		if(Dao.updateAccount(conn,acc)>0) {
			System.out.println(String.format("%s님의 계좌의 잔액은 %d원 입니다.", acc.getName(),acc.getBalance()));
		}
		Dao.close(conn);
	}
	
	//출금
	public void withdraw(String id,Integer money) {
		Connection conn = Dao.getConnection();
		Account acc = Dao.selectAccount(conn, id); //계좌 조회
		if(acc == null) {
			System.out.println("계좌번호가 틀립니다.");
			return;
		}
		if(acc.getBalance()<=money) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		acc.withdraw(money);		//class (객체)계좌에 입금을 한것
		if(Dao.updateAccount(conn,acc)>0) {
			System.out.println(String.format("%s님의 계좌의 잔액은 %d원 입니다.", acc.getName(),acc.getBalance()));
		}
		Dao.close(conn);
	} 
	
	public static void allAccountInfo() {
		Connection conn = Dao.getConnection();
		List<Account> accs = Dao.selectAccountList(conn);
		for(Account acc : accs) {
			System.out.println(acc);
		}
	}
	
	
	
}
