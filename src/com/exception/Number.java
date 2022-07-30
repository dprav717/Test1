package com.exception;

public class Number {
	
	

	public static void main(String[] args) {
		
		 int num1=10;
	     int num2=0;
		 int num3;
		 int num4=0;
		 int num5;
		 
		 int a[] =  new int[5];
		
		try {
			//num3=num1/num2;
			
            System.out.println(a[5]);
            
            System.out.println("wrongly divided");
		}
		
		catch(ArrayIndexOutOfBoundsException z) {
			
			System.out.println("Dont divide by zero");
		}
			
		catch(Exception z) {
				System.out.println("Catcched");
			
		}
			  try {
				//num5=num4/num4;
				
				  //System.out.println(num5);
		            
		            System.out.println("wrongly susbstracted");
			     }
			
			  catch(ArithmeticException y) {
				
				System.out.println("Dont substract zero");
			
			    }
			
			   //catch(Exception y) {
				//System.out.println("Catcched");
			    //}
			
			
		finally {
				
				System.out.println("infinite values");
				
				try {
					num5=num4-(num1/num2);
					
					   System.out.println(num5);
			            
			            System.out.println("wrong AE");
				}
				catch(ArithmeticException x) {
					
					System.out.println("Dont write wrong AE");
				
				}
			}
			
			

}
}
