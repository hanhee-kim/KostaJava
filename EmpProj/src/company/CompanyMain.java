package company;

import emp.Employee;
import emp.PartTime;
import emp.Permanent;
import emp.Sales;

public class CompanyMain {
	public static void main(String[] args) {
		
		Company com = new Company();
		
		Permanent emp1 = new Permanent(1001,"상부상조",5000000);
		Sales emp2 = new Sales(1002,"자바조",4000000,1000000);
		PartTime emp3 = new PartTime(1003,"커피조",160,30000);
		
		com.enter(emp1);	//upcasting
		com.enter(emp2);	//upcasting
		com.enter(emp3);	//upcasting
		
//		com.regBusinessTrip(emp1,1); error Permanent 출장 불가능
		com.regBusinessTrip(emp2,2); //Sales 출장 가능 하루당 30만원 incentive 지급
		com.regBusinessTrip(emp3,1); //PartTime 출장 가능 (출장시간(1일 8시간*pay원PerTime)원 incentive 지급
		
		
//		5000000 / 5600000 / 5520000 / 총 : 16120000
		
		com.allEmployeeInfo();
		System.out.println("총 급여액 : " + com.getTotalPay());
		
	}

}
