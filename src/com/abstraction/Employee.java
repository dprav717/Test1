package com.abstraction;

public abstract class Employee {
	public String name;
	public double paymentperhour;
	
	  public Employee(String name, double paymentperhour) {
		  this.name=name;
		  this.paymentperhour=paymentperhour;
		  }
	  
	 
	 public void setName() {
		  this.name= name;
	  }
	 public void setPaymentperhour() {
		  this.paymentperhour=paymentperhour;
	  }
	  
	 public abstract double calculateSalary();
	  
	 public String getName() {
		  return name;
	  }
	  
	  public double getpaymentperhour() {
		  return paymentperhour;
	  }
	  
}
