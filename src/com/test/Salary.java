package com.test;


public class Salary extends AbstractA{
	private double salary;
	
	   public void mailCheck() {
		      System.out.println("Within mailCheck of Salary class "+ super.name);
		      System.out.println("Mailing check to " + getName() + " with salary " + salary);
		      System.out.println("Mailing check to " + getAddress() + " with salary " + salary);
		      
		   }
	
	public Salary(String name, String address, int number, double salary) {

		super(name, address, number);
		System.out.println("Within mailCheck of Salary class xxx:"+ super.name);
		
		//setSalary(salary);
		
	}
	}




