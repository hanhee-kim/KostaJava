package emp;
public class Employee {

		private int idx;
		private String name;
		private String department;
		private int sal;
//		int bonus;
		
		public Employee(){}
		
		public Employee(int idx,String name,String department,int salary){
			this.idx = idx;
			this.name = name;
			this.department = department;
			this.sal = salary;
			
		}
//		public void payBonus(int money) {
//			bonus += money;
//		}
		public String info() {
			return ("사원번호 : "+this.idx+", 사원이름 : "+this.name+", 소속부서 : "+this.department+", 급여 : "+this.sal);
		}
//		public int getPay() {
//			return sal+bonus;
//		}

		public int getIdx() {
			return idx;
		}

		public void setIdx(int idx) {
			this.idx = idx;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public int getSal() {
			return sal;
		}

		public void setSal(int sal) {
			this.sal = sal;
		}
		
		
		
	}

