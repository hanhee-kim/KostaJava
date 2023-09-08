package test;

import java.io.File;

public class FileTest2 {

	public static void main(String[] args) {
		File f = new File("C:\\\\khh\\\\java-workspace");
		
		if( ! f.exists() || ! f.isDirectory()) {
			return;
		}
		
//		String[] files = f.list();
//		for(String file : files) {
//			System.out.println(file);
//		}// file 이름을 줌
		
		
		File[] files = f.listFiles();	//이건 파일 객체
		int totLength = 0;
		for(File file : files) {
			totLength += file.length();
			if(file.isDirectory()) {
				System.out.println("["+file.getName()+"]");
			} else {
				System.out.println(file.getName());
			}
		}
		System.out.println(totLength);
		
		
	}

}
