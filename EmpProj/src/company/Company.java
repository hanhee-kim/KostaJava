package company;

import emp.Employee;

public class Company {
	 Employee[] emps = new Employee[100];
	 int empCnt = 0;
	public  void enter (Employee emp) {	//Employee emp = emp1
		emps[empCnt++] = emp;
	}
	public  void allEmployeeInfo() {
		for(int i=0;i<empCnt;i++) {
			System.out.println(emps[i].info()); 	//Override되어있어야지 가능
		}
	}
	public  int getTotalPay() {
		int tot=0;
		for(int i=0;i<empCnt;i++){
			tot += emps[i].getPay();
		}
		return tot;
	}
	
	//출장
	public void regBusinessTrip(BusinessTrip emp,int day) {//sales .pratTime만 출장 가능(비용이 다름)
		emp.businessTripIncentive(emp,day);
	}
//	
}
