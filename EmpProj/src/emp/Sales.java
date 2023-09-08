package emp;

import company.BusinessTrip;

public class Sales extends Permanent implements BusinessTrip{

	private int incentive;
	
	public Sales() {}
	public Sales(int id,String name,int salary,int incentive) {
		super(id,name,salary);
		this.incentive = incentive;
	}
	
	
	
	//method
	@Override
	public String info() {
		return super.info();
	}

	@Override
	public int getPay() {
		return getSalary()+getIncentive();
	}
	
	@Override
	public void businessTripIncentive(BusinessTrip emp,int day) {
//		if (emp instanceof Sales) {
//			Sales sales = (Sales) emp;
//			sales.incentive += 300000*day;
//		}
		this.incentive += 300000*day;
		
	}
	
	
	
	//getter setter
	public int getIncentive() {
		return incentive;
	}
	public void setIncentive(int incentive) {
		this.incentive = incentive;
	}

	
}
