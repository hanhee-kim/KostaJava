
public class Student {
	String name;	//학생이름
	String address; //주소
	int grade;		//학년
	int num;		//학번

	
	String info() {
		return String.format("이름 : %s ,\n주소 : %s ,\n학년 : %d ,\n학번 : %d \n",name,address,grade,num);
	}
}
