import java.util.Scanner;

public class DoWhileTest1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int input;
		
		do {
			input = sc.nextInt();
			sum += input;
		}while(input!=0);
		
		System.out.println(sum);
		
//		--------------------------------
		input = sc.nextInt();
		while(input != 0) {
			sum += input;
			input = sc.nextInt();
		}
		System.out.println(sum);
//		---------------------------------
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
