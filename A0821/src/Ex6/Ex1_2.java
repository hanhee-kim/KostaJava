package Ex6;
class SutdaCard{
	int num = 1;;
	boolean isKwang = true ;
	String Kwang;
	
	String info() {
		

		return num+(isKwang?"k":"");
	}
}
public class Ex1_2 {
	public static void main(String[] agrs) {
		SutdaCard card1 = new SutdaCard();
		card1.num = 3;
		card1.isKwang = false;
		SutdaCard card2 = new SutdaCard();
		System.out.println(card1.info());
		System.out.println(card2.info());
		
	}

}
