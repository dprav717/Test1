package com.exception;

public class Test
{
	public static void main(String[] args) {
		
		int a =0;
		int b = 10;
		 int c = a +b;
		 
		 System.out.println(c);
		 System.out.println(b*b);
		 try
		 {
			 System.out.println("I am from Try start");
			 //System.out.println(a);
			System.out.println("I am from try end");
		 }
		
		 catch(ArithmeticException e)
		 {
			// System.out.println("I am from Catch");
			// e.printStackTrace();
		 }
		 catch(Exception e)
		 {
			// System.out.println("I am from Catch");
			// e.printStackTrace();
		 }
		 finally
		 {
			 System.out.println("I am from Finally");
		 }
			// System.out.println("::Befroe Programme completed:::");
			 //System.out.println(":: completed:::");
		 
		 
	}

}
