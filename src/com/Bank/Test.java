package com.Bank;

public class Test {

	public static void main(String[] args) {
		Customer customerobj1 = new Customer();
		
		customerobj1.id=10000;
		customerobj1.name="abc";
		customerobj1.salary=10000.0;
		
		System.out.println("obj1:"+customerobj1.hashCode());
		
		
		/*System.out.println(customerobj1.id);
		//System.out.println(customerobj.getid());
		System.out.println(customerobj1.name);
		System.out.println(customerobj1.salary);*/
		
		Customer customerobj2 = new Customer();
		System.out.println("obj2:"+customerobj2.hashCode());
		
		Customer customerobj3 = customerobj1;
		System.out.println("obj3:"+customerobj3.hashCode());
		
		Customer customerobj4 = customerobj3;
		System.out.println("obj4:"+customerobj4.hashCode());
		
		customerobj2.id=10000;
		customerobj2.name="abc";
		customerobj2.salary=10000.0;
		
		if(customerobj3 == customerobj1) {
			System.out.println("yes");
		}
		else{ 
			System.out.println("No");
		}
	}

}

