class MyButton {
	String title;
	
	void click() {
		System.out.println("쏙 들어갔다 나옴");
	}

	
	//setter getter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}

class LoginButton extends MyButton {

	@Override
	void click() {
		super.click();
		System.out.println("로그인처리");
	}
	
}
public class InterfaceTest2 {

	public static void main(String[] args) {
		MyButton loginBtn = new MyButton();
		loginBtn.setTitle("로그인");
		loginBtn.click();
		
	}

}
