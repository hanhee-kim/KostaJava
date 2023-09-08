import emp.Employee;

public class Company {
	
	Employee[] emps = new Employee[100];
	int empCnt ;
	
	public static void main(String[] args) {

		Company com = new Company();
		Employee emp1 = new Employee(10001,"홍길동","홍보부",5000000);
		Employee emp2 = new Employee(10002,"고길동","총무부",3500000);
		Employee emp3 = new Employee(10003,"중길동","개발부",4000000);
		Employee emp4 = new Employee(10004,"하길동","개발부",4500000);
		
		com.enter(emp1);
		com.enter(emp2);
		com.enter(emp3);
		com.enter(emp4);
		com.setBonus(10001,1000000);
		
		com.allEmployeeInfo();
		System.out.println("총급여액 : "+ com.getTotalPay());
		
		
		
	}
//	emp객체 추가
	private void enter(Employee emp) {		
		emps[empCnt++] = emp;
//				new Employee(emp.idx,emp.name,emp.bpt,emp.sal);
//		System.out.println(emp.idx);
//		System.out.println(empCnt);
	}
	
//	sal 을 bonus 만큼 추가
	private void setBonus(int idx, int bonus) {
		int salary;
		if(findByIdx(idx)==null) {
			System.out.println("해당 회사원을 찾을 수 없습니다.");
			return;
		}else {
			salary = findByIdx(idx).getSal();
			salary += bonus;
//			findByIdx(idx).payBonus(bonus);
		}
		
	}

	//총급여액 알아내기
	private int getTotalPay() {
		int salSum=0;
		for(int i=0;i<empCnt;i++) {
			salSum += emps[i].getSal();
			//emps[i].getPay();
		}
		return salSum;
	}
	//전체 사원정보 출력
	private void allEmployeeInfo() {
		for(int i = 0; i<empCnt; i++) {
			System.out.println(emps[i].info());
		}
	}
	// idx 찾아서 Employee 객체 넘겨
	Employee findByIdx(int idx) {
		for(int i = 0; i<empCnt;i++) {
			if(idx == (emps[i].getIdx())) {
				return emps[i];
			}
		}
		return null;
	}
	

}
