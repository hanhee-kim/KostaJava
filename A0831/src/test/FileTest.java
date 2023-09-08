package test;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		File file = new File("C:\\khh\\java-workspace\\A0831\\cat1.jpg");
		File file2 = new File("C:\\khh\\java-workspace\\A0831","cat1.jpg");
		
		System.out.println(file.getName());
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());
		System.out.println(File.pathSeparator);
		System.out.println(File.pathSeparatorChar);
		System.out.println(File.separator);
		System.out.println(File.separatorChar);
		
		
	}

}
