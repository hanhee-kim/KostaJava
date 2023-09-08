
public class ArrayTest9 {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		int[] arr2 = arr.clone();	//배열을 생성하여 값을 복사하여 리턴(복제)
		//복제
		
		arr[0] = 100;
		
		System.out.println("arr");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println();
		System.out.println("arr2");
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+",");
		}
		
	}

}
