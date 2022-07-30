package com.test;

public class   
{
	public String name;
	public int age;
	public static String collegename;
	public final String phno="57576";
	
	
	public Student(String name, int age)

	{
		
		this.name = name;
		this.age = age;
		System.out.println("::inside constructor :::"+this.age);
	}
	
	/*
	public Student()
	{
		
		System.out.println("::my cons :::"+this.age);
	}

	*/
	public final void m1()
	{
		System.out.println(this.age+"  "+this.name+"  "+this.collegename);
	}
	
	

}
