package emp;

import company.BusinessTrip;

public class PartTime extends Employee implements BusinessTrip{

	private int time;
	private int payPerTime;
	
	public PartTime() {}
	public PartTime(int id,String name,int time,int payPerTime) {
		super(id,name);
		this.time = time;
		this.payPerTime = payPerTime;
	}
	
	//method
	@Override
	public int getPay() {
		return getTime()*getPayPerTime();
	}
	
	@Override
	public String info() {
		return super.info()+", 급여 : "+getPay();
	}
	
	@Override
	public void businessTripIncentive(BusinessTrip emp,int day) {
//		if (emp instanceof PartTime) {
//			PartTime partTime = (PartTime) emp;
//			partTime.time += 24*day ;
//		}
		this.time += (day*24);
		
	}
	
	//getter setter
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getPayPerTime() {
		return payPerTime;
	}
	public void setPayPerTime(int payPerTime) {
		this.payPerTime = payPerTime;
	}
	
	
	
}
