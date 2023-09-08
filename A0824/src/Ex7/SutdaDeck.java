package Ex7;

class SutdaDeck {
	/*
	 * [7-1] 섯다카드 20장을 포함하는 섯다카드 한 벌(SutdaDeck클래스)을 정의한 것이다. 섯다카드 20장을 담는
	 * SutdaCard배열을 초기화하시오. 단, 섯다카드는 1부터 10까지의 숫자 가 적힌 카드가 한 쌍씩 있고, 숫자가 1, 3, 8인경우에는
	 * 둘 중의 한 장은 광(Kwang)이 어야 한다. 즉, SutdaCard의 인스턴스변수 isKwang의 값이 true이어야 한다.
	 * 
	 * [실행결과] 1K,2,3K,4,5,6,7,8K,9,10, 1,2,3,4,5,6,7,8,9,10,
	 */

	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];

	SutdaDeck() {
		for (int i = 0; i < cards.length / 2; i++) {

//				cards[i].num = (i+1);
//				cards[10+i].num = (i+1);

			if ((i + 1) == 1 || (i + 1) == 3 || (i + 1 == 8)) {
				cards[i] = new SutdaCard(i + 1, true);
			} else {
				cards[i] = new SutdaCard(i + 1, false);
			}
			cards[10 + i] = new SutdaCard(i + 1, false);
		}
	}

	void shuffle() {
		SutdaCard tmp;
		for (int i = 0; i < 1000; i++) {
			int randomNum1 = (int) (Math.random() * 20);
			int randomNum2 = (int) (Math.random() * 20);
			tmp = cards[randomNum1];
			cards[randomNum1] = cards[randomNum2];
			cards[randomNum2] = tmp;
		}
	}

	SutdaCard pick(int idx) {
		return cards[idx];
	}

	SutdaCard pick() {
		int randomNum = (int) Math.random() * 20;
		return cards[randomNum];
	}
}

class SutdaCard {
	final int num;
	final boolean isKwang;

	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	} // new SutdaCard(num,isKwang);

	// info()대신 Object클래스의 toString()을 오버라이딩했다.
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

class Exercise7_1 {
	public static void main(String args[]) {

		SutdaDeck deck = new SutdaDeck();

		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		for (int i = 0; i < deck.cards.length; i++) {
			System.out.print(deck.cards[i] + ",");
		}
		System.out.println();
		System.out.println(deck.pick(0));

	}

}
