class Data{
	int x;
	
}
public class MethodTest2 {
	static void increment(int x) {
		x += 1;
		System.out.println(x);
	}
	static void increment2(Data d) {	
		d.x += 1;	//주소를 가지고 원본을 가지고있음
		System.out.println(d.x);
	}
	
	public static void main(String[] args) {
		Data data = new Data();
		data.x = 10;
		
		increment(data.x);
		System.out.println(data.x); //10
		
		increment2(data);	//레퍼런스를 넘김
		System.out.println(data.x); //11
	}
}
