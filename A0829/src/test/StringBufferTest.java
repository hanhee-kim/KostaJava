package test;

public class StringBufferTest {

	public static void main(String[] args) {
		//StringBuffer 메소드
		StringBuilder builder = new StringBuilder(100);
		builder.append("abcdefg");
		System.out.println(builder.capacity());
		System.out.println(builder.length());
		builder.insert(1, 'p');
		System.out.println(builder);
		System.out.println(builder.length());
		builder.delete(2, 5);
		System.out.println(builder); 	//aperfg
		
		builder.replace(0, 2, "ta");
		System.out.println(builder);
		builder.reverse();
		System.out.println(builder);
		//원본이 바뀜
		builder.setCharAt(2, 'E');
		System.out.println(builder);
		//원래보다 짧게하면 잘리고 길게하면 공백이 추가됨
		builder.setLength(10);
		System.out.println(builder);
		
		
	}

}
