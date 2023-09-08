package test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest1 {

	public static void main(String[] args) {
//		FileInputStream fis = null; 
		// 생성은 try안에서 해줘야하지만 finally에서 닫아주어야 하기 때문에 밖에 선언하고 try 안에서 생성해준다
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
//			fis = new FileInputStream("news.txt");	//byte단위 글자가 캐릭터형태로 깨져서 나옴
			fr = new FileReader("news.txt");		//문자단위 한글 잘나옴
			br = new BufferedReader(fr);
			int data;
//			while((data=fis.read())!=-1) {
			while((data=br.read())!=-1) {
				System.out.print((char)data);
			}
		} catch ( IOException e) {
			e.printStackTrace();
		} finally {
			try {
//				if(fis != null) fis.close();
				if(br != null) br.close();
			} catch ( IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
