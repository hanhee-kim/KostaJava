package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectStreamTest {

	static void write(List<Person> pers) {
		ObjectOutputStream oos = null;
		try {
			//훨씬 간편하지만 데이터가 길어지는(무거워지는) 단점이 있다.
			oos = new ObjectOutputStream(new FileOutputStream("pers.dat"));
			oos.writeObject(pers);
			
//			oos.writeInt(pers.size());
//			for(Person p : pers) {
//				oos.writeObject(p);
//			}
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
	
	static List<Person> read(){
//		List<Person> pers = new ArrayList<>();
		ObjectInputStream ois = null;
		List<Person> pers = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("pers.dat"));
			pers = (List<Person>)(ois.readObject());
//			int count = ois.readInt();
//			for(int i=0;i<count;i++) {
//				Person p = (Person)(ois.readObject());
//				pers.add(p);
//			}
			
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(ois != null)ois.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		return pers;
	}
	
	public static void main(String[] args) {
//		List<Person> pers = new ArrayList<>();
//		pers.add(new Person("koko", 35, 177.5, false));
//		pers.add(new Person("soso", 40, 183.4, false));
//		pers.add(new Person("nana", 20, 170.3, true));
//		write(pers);
		
//		읽기
		List<Person> pers =read();
		for(Person p : pers) {
			System.out.println(p);
		}
		
		
		
		
		
	}

}
