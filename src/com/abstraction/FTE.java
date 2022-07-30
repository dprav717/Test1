package com.abstraction;

/*public class FTE extends Employee{
	
	public FTE(String name, double paymentperhour, double workinghours) {
		super(name, paymentperhour);
	}
	
	public double calculateSalary(){
		
		 return getpaymentperhour()*8;
	}

}*/



public class FTE extends Contractor{
	
	
	public FTE(double paymentperhour, double workinghours) {
		super(paymentperhour, workinghours);
		
	}

	public double calculateSalary(){
		
		 return paymentperhour*8;
	}

}
