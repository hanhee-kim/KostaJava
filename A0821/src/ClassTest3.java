class Tv{
	boolean power;
	int channel;
	int size = 50;
	
	void onOff() {
		power = !power;
	}
	void channelUp() {
		channel++;
	}
	void channelDown() {
		channel--;
	}
	String info() {
		return String.format("size:%d,channel:%d,power:%s", size,channel,power?"on":"off");
		
	}
}
public class ClassTest3 {

	public static void main(String[] args) {
		
		Tv tv = new Tv();
		System.out.println(tv.info());
		tv.onOff();
		System.out.println(tv.info());
		tv.channelUp();
		tv.channelUp();
		System.out.println(tv.info());
		tv.channelDown();
		System.out.println(tv.info());

	}

}
