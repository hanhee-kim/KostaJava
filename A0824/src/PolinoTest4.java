class Car {
	String color;
	int door;
	void drive() {
		System.out.println("dirve Brrrr");
	}
	void stop() {
		System.out.println("stop!!!!!!");
	}
}
class FireEngine extends Car {
	void water() {
		System.out.println("water!");
	}
}
class Ambulance extends Car {
	void siren() {
		System.out.println("BBBBBBBBBBBBBIIIIIIIIIIIIIIIIIII");
	}
}
public class PolinoTest4 {

	public static void main(String[] args) {

		FireEngine fe = new FireEngine();	
		fe.water();
		
		Car car = fe;		//upcasting 
//		car.water(); 부모타입이라 안됨
		
		if (car instanceof FireEngine) {
			FireEngine fe2 = (FireEngine)car;	//downcasting
			fe2.water();
			
		}
		
	}

}
