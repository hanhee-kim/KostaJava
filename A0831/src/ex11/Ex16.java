package ex11;

public class Ex16 {
 public static void main (String[] args) {
	 String data = "123,456,789.5";
	 
	 String n =  data.replaceAll(",","");
	 double dd = Double.parseDouble(n);
	 System.out.println(dd);
	 
	 
	
 }
}
