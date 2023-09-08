package ex9;

class SutdaCard {
	int num;
	boolean isKwang;

	SutdaCard() {
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}

	public boolean equals(Object obj) {
		if (obj instanceof SutdaCard) {
			SutdaCard card = (SutdaCard) obj;
			if(num == card.num && isKwang == card.isKwang) {
				return true;
			}return false;
		}
		return false;
		/*
		if(obj == null || !(obj) instanceof SutdaCard)return false;
		SutdaCard card = (SutdaCard) obj;
		return num==card.num && isKwang==card.isKwang;
		 */
		
		
	}

	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}

public class Ex1 {
	public static void main(String[] args) {
		SutdaCard c1 = new SutdaCard(3, true);
		SutdaCard c2 = new SutdaCard(3, true);
		System.out.println("c1=" + c1);
		System.out.println("c2=" + c2);
		System.out.println("c1.equals(c2):" + c1.equals(c2));
	}
}
