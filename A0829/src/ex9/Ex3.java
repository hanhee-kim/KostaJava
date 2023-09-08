package ex9;

public class Ex3 {
	public static void main(String[] args) {
		String fullPath = "c:\\jdk1.5\\work\\PathSeparateTest.java"; //36
		String path = "";
		String fileName = "";
		//
		int idx = (fullPath.lastIndexOf("\\"));
		path = fullPath.substring(0,idx);
		fileName = fullPath.substring(idx+1);
		//
		System.out.println("fullPath:"+fullPath);
		System.out.println("path:"+path);
		System.out.println("fileName:"+fileName);
		}
}
