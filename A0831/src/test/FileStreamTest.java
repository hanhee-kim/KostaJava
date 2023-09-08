package test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamTest {

	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream("cat1.jpg");
			fos = new FileOutputStream("cat2.jpg");
			
			//보조스트림
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			
			
//			int data;
//			while((data=fis.read())!= -1) { //-1은 파일을 모두 다 읽었을때 반환되는 값, 즉 -1이 아닐때까지 읽어오라는 뜻
//				fos.write(data);
//			}
			byte[] buff = new byte[1024];
			int len;
			while((len=fis.read(buff))> 0) { //읽어올때 len를 받아서
				bos.write(buff,0,len);			//쓸때 len만큼만 작성
			}
			
		} catch ( IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bis != null) bis.close();
				if(bos != null) bos.close(); //보조스트림만 닫으면 얘와 연결된 1차 스트림까지 닫힌다
			} catch(IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
	}

}
