
public class ExceptionTest4 {

	public static void method1() throws Exception{
		String str = null;
		try {
			
		System.out.println(str.toString());
		}catch(NullPointerException e) {
			System.out.println("method1에서 처리");
//			throw e; 	//처리 후 이렇게 처리하기도 함
			//호출한 애가 나의 예외에 대해서 처리를 해야할 일이 있다면
			throw new Exception("예외 다시 생성");
		}
	}
	public static void main(String[] args) {

		try {
			method1();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("main 나머지 처리");
		}
		System.out.println("main 나머지 처리");
	}

}
