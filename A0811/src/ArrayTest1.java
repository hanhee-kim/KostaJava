
public class ArrayTest1 {

	public static void main(String[] args) {
		int[] arr1 = new int[5];
		double[] arr2 = new double[5];

		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		arr1[3] = 4;
		arr1[4] = 5;
		
		int sum = 0;
		for(int i=0; i<arr1.length;i++) {
			sum+=arr1[i];
		}
		System.out.println(sum);

	}

}
