package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Vector;

public class SequenceStreamTest {

	public static void main(String[] args) {
		FileInputStream fis1 = null ;
		FileInputStream fis2 = null ;
		FileOutputStream fos = null;
		SequenceInputStream sis = null;
		
		Vector<InputStream> v = new Vector<>();	//vector를 사용하면 여러 파일을 합칠때 용이하다
		
		try {
			fis1 = new FileInputStream("news.txt");
			fis2 = new FileInputStream("news2.txt");
			
			sis = new SequenceInputStream(v.elements());	//백터의 반복자 이너멀레이션에 접근하는 엘레먼츠를 사용
			fos = new FileOutputStream("total.txt");
			byte[] buffer = new byte[1024];
			int len = 0;
			while((len = sis.read(buffer)) >0) {
				fos.write(buffer,0,len);
			}
		} catch ( Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(sis != null) sis.close();
				if(fos != null) fos.close();
				
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
