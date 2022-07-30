package com.test;

public abstract class AbstractA {
	public String name;
	public String address;
	public int number;
	
	public AbstractA(String name, String address, int number) {
		this.name=name;
		this.address=address;
		this.number=number;
	}
    public double computepay() {
	 return 0.0;
	 }
   public void mailcheck() {
	   System.out.println("Mailing a check to " + this.name + " " + this.address);
   }
   
   public String getName() {
	      return name;
	   }
	 
	   public String getAddress() {
	      return address;
	   }
}
