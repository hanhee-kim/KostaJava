package importTest;

import java.sql.Date;

import pac.MyClass;

public class ImportTest1 {

	public static void main(String[] args) {
		//다른 패키지에 있는 클래스를 쓰려면 public 클래스만 가능
		MyClass mc = new MyClass();
		mc.date1 = new Date(123456);

		
		
	}

}
