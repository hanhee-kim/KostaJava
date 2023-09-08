package Ex6;

public class Ex20 {

	static int[] shuffle(int[] arr) {
		
//		int[] res = original.clone();
		int[] res = new int[arr.length];
		System.arraycopy(arr, 0, res, 0, arr.length);
		
		for(int i=0;i<100;i++) {
			int idx1 = (int)(Math.random()*arr.length);
			int idx2 = (int)(Math.random()*arr.length);
			int temp = res[idx1];
			res[idx1] = res[idx2];
			res[idx2] = temp;
		}
		return res;
	}
	public static void main(String[] args) {

		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println("original : "+java.util.Arrays.toString(original));
		
		
		int[] result = shuffle(original);
		System.out.println("result : "+java.util.Arrays.toString(result));
		System.out.println("original : "+java.util.Arrays.toString(original));
		
		System.out.println(original==result);
	
	}

}
