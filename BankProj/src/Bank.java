import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;

import acc.Account;
import acc.SpecialAccount;
import exc.BankError;
import exc.BankException;

public class Bank {
	Map<String,Account> accs = new TreeMap<>();
	Scanner sc = new Scanner(System.in);
//	Account[] accs = new Account[100];	//하나의 클래스가 클래스의 속성으로 들어가있는 구조
//	
//	int accCnt;		//생성된 계좌의 개수를 관리하는 변수
//	List<Account> accs = new ArrayList<>();
//	
	int menu() throws BankException {
		System.out.println("[KOSTA BANK]");
		System.out.println("1. 계좌개설");
		System.out.println("2. 입금");
		System.out.println("3. 출금");
		System.out.println("4. 계좌조회");
		System.out.println("5. 전체계좌조회");
		System.out.println("0. 종료");
		System.out.print("선택>>");
		int	select = Integer.parseInt(sc.nextLine());
		try {
			if(!(select >= 0 && select <=5)) {
				throw new BankException("메뉴오류",BankError.MENU);
			}
		}catch(BankException e) {
			System.out.println(e);
			menu();
		}
		return select;
	}
	
	void selAccMenu() throws BankException {
		System.out.println("[계좌개설]");
		System.out.println("1.일반계좌");
		System.out.println("2.특수계좌");
		System.out.print("선택 >>");
		int sel = Integer.parseInt(sc.nextLine());
		switch(sel) {
		case 1 : makeAccount(); break;
		case 2 : makeSpecialAccount(); break;
		default :
//			try {
			throw new BankException("메뉴오류",BankError.MENU);
//		}catch(BankException e) {
//			System.out.println(e);
//			selAccMenu();
//		}
		}
//		if(sel == 1 ) {
//			makeAccount();
//		}
//		else {
//			makeSpecialAccount();
//		}
	}
	
	//1.1 계좌 개설
	private void makeAccount() throws BankException{
		System.out.println("[일반계좌 개설]");
		System.out.print("계좌번호:");
		String id = sc.nextLine();
		try { 
			if( accs.containsKey(id) ) {
				throw new BankException("계좌오류", BankError.EXISTID);
			}
		} catch ( BankException e) {
			System.out.println(e);
			makeAccount();
		}
		System.out.print("이름:");
		String name = sc.nextLine();
		System.out.print("입금액:");
		int money = Integer.parseInt(sc.nextLine());
		accs.put(id,new Account(id,name,money));	//
	}
	//1.2 특수 계좌 개설
	void makeSpecialAccount() throws BankException{
		System.out.println("[특수계좌 개설]");
		System.out.print("계좌번호:");
		String id = sc.nextLine();
		try {
			if( accs.containsKey(id)) {
				throw new BankException("계좌오류", BankError.EXISTID);
			}			
		} catch ( BankException e) {
			System.out.println(e);
			makeSpecialAccount();
		}
		System.out.print("이름:");
		String name = sc.nextLine();
		System.out.print("입금액:");
		int money = Integer.parseInt(sc.nextLine());
		System.out.print("등급 ( VIP-V,Gold-G,Silver-S,Normal-N ) :");
		String grade = sc.nextLine();
		//추가
		accs.put(id,new SpecialAccount(id,name,money,grade));
		
	}
	//2.입금
	private void deposit() throws BankException {
		System.out.println("[입금]");
		System.out.print("계좌번호");
		String id = sc.nextLine();
		if(!accs.containsKey(id)) {
			try {
				throw new BankException("계좌오류", BankError.NOID);
			} catch(BankException e) {
				System.out.println(e);
				deposit();
			}
		}
		System.out.print("입금액");
		int money = Integer.parseInt(sc.nextLine());
		accs.get(id).deposit(money);
	}
	//3.출금
	private void withdraw() throws BankException{
		System.out.println("[출금]");
		System.out.print("계좌번호");
		String id = sc.nextLine();
		try {
			if(!accs.containsKey(id)) {
				throw new BankException("계좌오류",BankError.NOID);
			}	
		} catch ( BankException e) {
			System.out.println(e);
			withdraw();
		}
		System.out.print("출금액");
		int money = Integer.parseInt(sc.nextLine());
		accs.get(id).withdraw(money);
	}
	//4.계좌 조회
	private void accountInfo() throws BankException{
		System.out.print("[계좌조회]");
		System.out.print("계좌번호");
		String id = sc.nextLine();
		try {
			if(!accs.containsKey(id)) {
				throw new BankException("계좌번호 오류",BankError.NOID);
			}
		} catch ( BankException e) {
			System.out.println(e);
			accountInfo();
		}
		
		
//		if(acc == null) {
//			System.out.println("계좌번호가 틀립니다.");
//			return;
//		}		
		System.out.println(accs.get(id));
	}
	
	
	//5.전체 계좌 조회
	private void allAccountInfo() {
//		for(int i = 0;i<accs.size();i++) {
//			System.out.println(accs.get(i).toString());//toString()을 써주지 않아도 됨.
//		}
		Iterator<Account> it = accs.values().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

//계좌 써서 accs.bin파일로 저장~
	public void store_b() {
		DataOutputStream dao = null;	//왜 dao..? dos 아니고?
		try {
			dao = new DataOutputStream(new FileOutputStream("accs.bin"));
			
			dao.writeInt(accs.size());	//계좌 갯수 저장
			for(Account acc : accs.values()) {
				if(acc instanceof SpecialAccount) {	//계좌 종류 구분값
					dao.writeChar('S');
				} else {
					dao.writeChar('N');
				}
				
				dao.writeUTF(acc.getId()); 			//계좌번호
				dao.writeUTF(acc.getName());		//이름
				dao.writeInt(acc.getBalance());		//잔액
				
				
				if(acc instanceof SpecialAccount) {
					dao.writeUTF(((SpecialAccount)acc).getGrade().charAt(0)+""); //다운캐스팅 후 등급
													//저장시 0번인덱스의 하나의 캐릭터만 저장( Vip => V만)
				}
			}
			
		} catch ( IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(dao != null) dao.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	

	//accs.bin 읽기
	public void load_b() {
		DataInputStream dis = null;
		try {
			dis = new DataInputStream(new FileInputStream("accs.bin"));
			int count = dis.readInt();
			for(int i =0;i<count;i++) {
				char sect = dis.readChar();		//계좌 종류 구분값
				String id = dis.readUTF(); 		//계좌번호
				String name = dis.readUTF();	//이름
				int balance = dis.readInt(); 	//잔액
				
				if(sect == 'S') {
					String grade = dis.readUTF(); 	//등급
					accs.put(id, new SpecialAccount (id,name,balance,grade));
					
				} else {
					accs.put(id, new Account(id,name,balance));
				}
				
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("해당파일이 존재하지 않아효");
		} finally {
			try {
				if(dis != null) dis.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

	
	public void store_t() {
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("account.txt"));
			for(Account acc : accs.values()) {
				String accStr = acc.getId();
				accStr += ","+acc.getName();
				accStr += ","+acc.getBalance();
				
				if(acc instanceof SpecialAccount) {
					accStr += ","+((SpecialAccount)acc).getGrade().charAt(0)+"";
				}
				
				bw.write(accStr);
				bw.newLine();
			}
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {	//io스트림을 생성하거나 이미 생성된 객체를 사용하려면 예외처리를 반드시 해줘야 컴파일 에러가 나지 않는다.
				if(bw != null) bw.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	public void load_t() {
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("account.txt"));
			String accStr = null;
			while((accStr = br.readLine())!=null) {
				
				StringTokenizer st =new StringTokenizer(accStr,",");
				String id = st.nextToken();
				String name = st.nextToken();
				int balance = Integer.parseInt(st.nextToken());
				if(st.countTokens() != 0) {
					String grade = st.nextToken();
					accs.put(id, new SpecialAccount(id,name,balance,grade));
					} else {
						accs.put(id, new Account(id,name,balance));
					}
				
			}
				
				
//		BufferedReader br = null;
//				
//		try {
//			br = new BufferedReader(new FileReader("account.txt"));
//			String accStr = null;
//			while((accStr = br.readLine())!=null) {				
//				String[] accProp = accStr.split(",");
//				String id = accProp[0];
//				String name = accProp[1];
//				int balance = Integer.parseInt(accProp[2]);
//				if( accProp.length == 4) {
//					String grade = accProp[3];
//					accs.put(id, new SpecialAccount(id,name,balance,grade));
//				} else {
//					accs.put(id, new Account(id,name,balance));
//				}
//			}
			
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) br.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	
	}
	
	public void store_s() {
		ObjectOutputStream oos =null;
		try {
			//훨씬 간편하지만 데이터가 길어지는(무거워지는) 단점이 있다.
			oos = new ObjectOutputStream(new FileOutputStream("accs.dat"));
			oos.writeObject(accs);
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
				try {
					if(oos != null ) oos.close();
				} catch(IOException e){
					e.printStackTrace();
				}
			}
	}
	public void load_s() {
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("accs.dat"));
			accs = (Map<String,Account>)ois.readObject();
		}catch(IOException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
				try {
					if(ois != null ) ois.close();
				} catch(IOException e){
					e.printStackTrace();
				}
			}
	}
	
	

//메인
	public static void main(String[] args) throws BankException {
		
		Bank bank = new Bank();
		bank.load_s(); 			//읽어오는건 반복문 밖에서 한번만 읽어야 하기 때문에 이 위치가 적절
		int sel;
		while(true) {
			try {
				
			sel = bank.menu();
			
			if(sel == 0) {
				bank.store_s(); 	//종료시점에 작성해서 저장
				break;
			}
			switch(sel) {
			case 1:bank.selAccMenu(); break;
			case 2:bank.deposit(); break;
			case 3:bank.withdraw();break;
			case 4:bank.accountInfo();break;
			case 5:bank.allAccountInfo(); break;
				}
			}catch(NumberFormatException e) {
				System.out.println("입력형식이 맞지 않습니다. 다시 선택하세요.");
			} catch(BankException e) {
				System.out.println(e);
			}
			//위코드 안에서 발생하는 예외처리를 다 처리함
			
		}
		
		
		
	}

}
