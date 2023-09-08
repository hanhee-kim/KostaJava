
public class ExceptionTest2 {

	public static void main(String[] args) {

		int[] arr1 = {10,20,30,40,50,60};
		int[] arr2 = {2,4,6,0,10};
		int tot = 0;	
		int count = arr1.length;
		double avg = 0;
			
		for(int i = 0; i<arr1.length; i++) {
			try {
			tot += arr1[i] / arr2[i];
			System.out.println(arr1[i]/arr2[i]);
		
		}catch (ArithmeticException e) {
//			System.out.println(e.getMessage());
			count--;
		}catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println(e.getMessage());
			count--;
		}catch (Exception e) {
			count--;
		}
		}
		System.out.println(tot);
		System.out.println(tot/(double)count);
		System.out.println("program Exit");
	}

}
