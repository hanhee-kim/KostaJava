package test;

class Data<T> {
	T data;
	//data의 타입을 정하지 않았음 : T 혹은 E 로 작성
	void setData(T data) {
		this.data = data;
	}
	T getData() {
		return data;
	}
}

public class GenericTest1 {

	public static void main(String[] args) {
		//실제 사용할 때
		Data<String> d = new Data<>();		//1클래스를 만들고 2생성해줌
		d.setData("hong");
		String s = d.getData();
		System.out.println(s);
		
		Data<Integer> d2 = new Data<>();
		d2.setData(200);
		int n = d2.getData();
		System.out.println(n);
		
		Data<Person> d3 = new Data<>();
		d3.setData(new Person("koko",30));
		Person p = d3.getData();
		System.out.println(p);
		
		//d2 = d;	X
		//다른 타입으로 생성된 제네릭 객체는 동일한 클래스가 아님
		//상속관계 또한 아님
		Data<Person> d4 = new Data<>();
		//d3 = d4;  O
		//같은 타입으로 생성된 제네릭 객체는 동일한 클래스다.
		
		
	}

}
