package com.exception;

public class T1
{
	public static void main(String[] args) {
		
		
		int a =10;
		
		if (a>18)
		{
			
		System.out.println("eligible for voting");
		}
		else
		{
			System.out.println("not eligible for voting");
			throw new TooYoungException("you are not eligible for voting");
			
		}
	}
}
