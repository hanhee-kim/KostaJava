package Ex6;
class PlayingCard {
	int kind;
	int num;
	
	static int width;
	static int height;
	
	PlayingCard(int k, int n){
		kind = k;
		num = n;
	}
}
public class Ex8 {

	public static void main(String[] args) {
		PlayingCard card = new PlayingCard(1, 1);
		
		
		/*
		 * 클래스변수(static변수) : width ,height
		 * 인스턴스변수 :  kind , num
		 * 지역변수(local) : k,n ,args,card
		 */
		
	}

}
