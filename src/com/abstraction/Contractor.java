package com.abstraction;

/*public  class Contractor extends Employee{
	
	public double workinghours;
	
	
	
    public Contractor(String name, double paymentperhour, double workinghours) {
    	super(name,  paymentperhour);
    	this.workinghours=workinghours;
    	
    	}
    

     
    public double calculateSalary() {
		
		 return getpaymentperhour()*workinghours;
	}
}*/


public  class Contractor{
	
	public double workinghours;
	public double paymentperhour;
	
	
	
    public Contractor( double paymentperhour, double workinghours) {
    	
    	this.workinghours=workinghours;
    	this.paymentperhour = paymentperhour;
    	
    	}
    

     
    public double calculateSalary() {
		
		 return paymentperhour*workinghours;
	}
}
