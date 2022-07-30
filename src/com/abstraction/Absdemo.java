/*package com.abstraction;

public class Absdemo {

	public static void main(String[] args) {
		FTE j = new FTE("abc" , 60, 10 );
		Contractor x =new Contractor ("xyz", 60, 20);
		j.calculateSalary();
		x.calculateSalary();
	System.out.println("the valueFTE:'"+ x.calculateSalary());
	System.out.println("the valueFTE:'"+ j.calculateSalary());

	}

}*/

package com.abstraction;

public class Absdemo {

	public static void main(String[] args) {
		FTE j = new FTE(60, 10 );
		//Contractor x =new Contractor(60, 20);
		j.calculateSalary();
		//x.calculateSalary();
	//System.out.println("the valueFTE:'"+ x.calculateSalary());
	System.out.println("the valueFTE:'"+ j.calculateSalary());

	}

}


