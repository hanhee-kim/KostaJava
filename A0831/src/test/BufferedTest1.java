package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BufferedTest1 {

	static void write (Person person) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try{
			fw = new FileWriter("person.txt");
			bw = new BufferedWriter(fw);
			String perStr = person.getName()+", "+person.getAge()+", "+person.getHeight()+", ";
			perStr += person.isMarried()?"Y":"N";
			bw.write(perStr);
			bw.newLine();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bw != null) bw.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	static Person read() {
		Person person = null;
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("person.txt");
			br = new BufferedReader(fr);
			String perStr = br.readLine();
			String[] perProp = perStr.split(", ");
			String name = perProp[0];
			int age = Integer.parseInt(perProp[1]) ;
			double height = Double.parseDouble(perProp[2]);
			boolean married = perProp[3].charAt(0) == 'Y'? true : false;
			person = new Person(name,age,height,married);
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) br.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		return person;
		
		
	}
	//여러명이면?
	static void write(List<Person> pers) {
		BufferedWriter bw = null;
		try {
			bw =new BufferedWriter(new FileWriter("person.txt"));
			for ( Person person : pers) {
				String perStr = person.getName()+", "+person.getAge()+", "+person.getHeight()+", ";
				perStr += person.isMarried()?"Y":"N";
				bw.write(perStr);
				bw.newLine();
			}		
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bw != null) bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	static List<Person> readList(){
		List<Person> pers = new ArrayList<>();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("person.txt"));
			String perStr = null;
			while((perStr = br.readLine()) != null) {
				String[] perProp = perStr.split(", ");
				String name = perProp[0];
				int age = Integer.parseInt(perProp[1]) ;
				double height = Double.parseDouble(perProp[2]);
				boolean married = perProp[3].charAt(0) == 'Y'? true : false;
				pers.add(new Person(name,age,height,married));
			}
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return pers;
	}
	
	
	public static void main(String[] args) {
//		Person person = new Person("koko", 30, 178.5, false);
//		write(person);
//		Person person2 = read();
//		System.out.println(person2);
		//
		
//		List<Person> pers = new ArrayList<>();
//
//		pers.add(new Person("koko", 35, 177.5, false));
//		pers.add(new Person("soso", 40, 183.4, false));
//		pers.add(new Person("nana", 20, 170.3, true));
//		
//		write(pers);
		List<Person> list = readList();
		for(Person p :list) {
			System.out.println(p);
		}
		
		
		
	}

}
