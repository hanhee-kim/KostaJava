package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest3 {

	public static void main(String[] args) {
		Properties prop1 = new Properties();
		
		try {
			prop1.load(new FileInputStream("settings.txt"));
			System.out.println(prop1);
			System.out.println("title : "+prop1.getProperty("title"));
			System.out.println("content : "+prop1.getProperty("content"));
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
