class MyArray {		//singleton object : 하나만 생성해서 공유
	private int[] arr = new int[10];
	private static MyArray myArray;	//static method에서 사용하기 위하여 static
	private MyArray() {}	//메모리 생성을 못하게함
	
	//객체 생성없이 호출하기 위해서 static
	public static MyArray getMyArrayReference() {
		if(myArray == null) {
			myArray = new MyArray();
		}
		return myArray;  // 싱글톤 객체
	}
	public void setData(int idx,int data) {
		arr[idx] = data;
	}
	public int getData(int idx) {
		return arr[idx];
	}
}
public class PrivateConstructor {

	public static void main(String[] args) {
		MyArray ma = MyArray.getMyArrayReference();
		MyArray ma2 = MyArray.getMyArrayReference();
		System.out.println(ma == ma2);
		ma.setData(0, 100);
		System.out.println(ma2.getData(0));
		
	}

}
