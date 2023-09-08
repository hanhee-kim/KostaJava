package emp;

public abstract class Employee {
	
	private int id;
	private String name;
	
	public Employee() {}
	public Employee(int id,String name) {
		this.id = id;
		this.name = name;
	}
	//method
	public String info() {
		return "사번:"+this.id+",이름:"+this.name;
	}
	
	//getPay
	public abstract int getPay();
	
	//getter setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
