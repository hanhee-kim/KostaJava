
public class ArrayTest7 {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4};
		int[] arr2 = arr1;	//주소끼리의 복사
		
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+",");
		}
		System.out.println();
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+",");
		}
		
//		arr 카피
		System.arraycopy(arr1, 0, arr2, 0, arr1.length); //deep copy
		arr2 = arr1; //shallow copy
	}

}
