package com.exception;

public class CheckClass {

	 static void Check(int height, int weight) {
		
	if (height<=20 && weight<=40) {
			
		throw new Ck("applicable for registartion");
			
		}
	else {
		System.out.println("eligible for process");
	}

	}
	
	public static void Main(String[] args) {
		
		Check(10,20);
		
		System.out.println("welcome to the process");
		
	}

}
