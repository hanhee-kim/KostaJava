package test;

import java.util.Scanner;

public class StringTest2 {

	public static void main(String[] args) {
		
		//indexOf
		String str = "Good Luck";
		int idx = str.indexOf('L');
		System.out.println(idx);
		//Overloading 된 indexOf
		int idx2 = str.indexOf("Good");
		System.out.println(idx2);
		//첫번째 문자가 시작되는 인덱스의 위치를 반환함
		
		String str2 = "apple place";
		int idx3 = str2.indexOf('p');
		
		//뒤에서부터 찾겠다
		int idx4 = str2.lastIndexOf('p');
		System.out.println(idx3);
		System.out.println(idx4);
		
		//replace
		String str3 = str2.replace('p', 't');
		System.out.println(str3);
		System.out.println(str2); 	//원래의 str2는 바뀌지 않음
		
		String str4 = str2.replace("place","world");
		System.out.println(str4);
		
		//split
		String fruitStr = "apple,banana,fineapple,melon,strawberry";
		String[] fruitArr = fruitStr.split(",");
		for(int i =0 ;i<fruitArr.length ;i++) {
			System.out.println(fruitArr[i]);
		}
		
		//substring
		String strFruit = fruitStr.substring(13);
		System.out.println(strFruit);
		String strFruit2 = fruitStr.substring(13, 22);
		System.out.println(strFruit2);
		
		
		//toLowerCase / toUpperCase
//		System.out.print("Y/N를 선택하세요.");
//		Scanner sc = new Scanner(System.in);
//		String answer = sc.nextLine();
//		if(answer.toLowerCase().equals("y")) {
//			// 위의 친구는 주소값을 가지고 있지 않기 때문에 ==을 사용할 수 없다.
//			System.out.println("Yes 선택");
//		} else if(answer.toUpperCase().equals("N")) {
//			System.out.println("No 선택");
//		}else {
//			System.out.println("잘못입력");
//		}
//		
		//trim
		String str5 = "Hello         ";
		System.out.println(str5);
		String str6 = str5.trim();
		System.out.println(str6);
		
		
	
		
		
		
	}

}
