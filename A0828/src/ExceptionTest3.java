
public class ExceptionTest3 {

	public static void main(String[] args) {

		try {
			throw new Exception("예외 발생");
			//throw : 예외를 생성해서 발생시켜줌
			//
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
