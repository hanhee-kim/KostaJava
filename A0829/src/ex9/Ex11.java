package ex9;

public class Ex11 {

	public static void main(String[] args) {
		if(args.length<2) {
			System.out.println("시작 단과 끝 단, 두 개의 정수를 입력해주세요.\nUSAGE : GugudanTest 3 5");
		}
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		for(int i = num1;i<= num2;i++) {
			for(int j = 1 ;j<10;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}System.out.println();
		}
	}

}
