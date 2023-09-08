package ex9;

public class Ex8 {
	static double round(double d, int n) {
		double result = Math.round(d*Math.pow(10, n))/(10.0*Math.pow(10, n-1));
		return result;
		
//		double p = Math.pow(10, n);
//		return Math.round(d*p)/p;
	}
	public static void main(String[] args) {
		System.out.println(round(3.1415,1));	//Math.round(3.1415*Math.pow(10,n))/10.0
		System.out.println(round(3.1415,2));
		System.out.println(round(3.1415,3));
		System.out.println(round(3.1415,4));
		System.out.println(round(3.1415,5));
		}
}
