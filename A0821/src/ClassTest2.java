class Person {
	String name;
	int age;
	
	String info() {
		return String.format("이름 : %s , 나이 : %d", name,age);
	}
	
}
public class ClassTest2 {

	public static void main(String[] args) {

		Person per1 = new Person();
		per1.name = "김한희";
		per1.age = 29;
		
		System.out.println(per1.info());
		
		Person[] parr = new Person[5];// 객체 5개가 아닌 레퍼런스 5개를 생성한것!!!!
		
		for(int i=0;i<parr.length;i++) {
			parr[i]=new Person();
		}
		
		System.out.println(parr[0].info());
		
		
	}

}
