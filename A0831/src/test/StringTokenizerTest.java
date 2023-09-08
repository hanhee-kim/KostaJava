package test;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		//기본 구분자를 주지 않으면 스페이스를 기준으로 구분
		StringTokenizer st 
		= new StringTokenizer("apple#banana$orange, kiwi ",",#$ ",true);
								//여러 구분자를 넣어 사용할 수 있다.( 스플릿은 한개의 구분자 )
		
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
		
		
		
		
	}

}
