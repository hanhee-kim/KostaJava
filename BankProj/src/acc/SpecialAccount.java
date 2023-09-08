package acc;

import java.io.Serializable;

import exc.BankException;

public class SpecialAccount extends Account implements Serializable{

	String grade;
	double interest = 0.01; //Normal 기본
	
	public SpecialAccount(){
		
	}
	public SpecialAccount(String id,String name, int money,String grade){
		super(id,name,money);
		this.grade = grade;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+" , 등급 : "+grade;
	}
	
	@Override
	public void deposit(int money) throws BankException{ 
		super.deposit((int)(money+money*interest));
		
		
	}
		
	
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		switch(grade) {
		case "V" : 
		case "v" : this.grade = "VIP"; interest = 0.04; break;
		case "G" :
		case "g" : this.grade = "GOLD"; interest = 0.03; break;
		case "S" : 
		case "s" : this.grade = "Silver"; interest = 0.02; break;
		case "N" : 
		case "n" : this.grade = "Normal"; interest = 0.01; break;
		}
		
		this.grade = grade;
	}
	
	
}
