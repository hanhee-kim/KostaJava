package emp;

public class Permanent extends Employee{

	private int salary;
	
	public Permanent() {
		super(); //자동으로 호출되기 때문에 생략가능함
	}
	public Permanent(int id,String name,int salary) {
		super(id,name);
		this.salary = salary;
	}
	
	//method
	@Override
	public String info() {
		// TODO Auto-generated method stub
		return super.info()+", 급여 : "+this.getPay();
	}
	
	@Override
	public int getPay() {
		return getSalary();
	}
	
	
	
	
	//getter setter
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
}
