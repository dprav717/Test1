package com.test;

public class Test 
{
public static void main(String args[])
{
	//StaticMethod.m1();

	Student s1;
	//System.out.println("::after constructor :::"+s1.age);
	
	//s1.phno;
	//s1 = new Student("abc",18);
	//System.out.println("::after constructor :::"+s1.age);
	//System.out.println("::after constructor :::"+s1.name);
	
	
	s1 = new Student("abc",18);
	//s1.age = 19;
	System.out.println("::param constructor :::"+s1.age);
	System.out.println("::param constructor :::"+s1.name);
	
	//s1.age = 33323;
	//Student s2 = new Student("bbc",22);
	//s2.name ="ddadf";
	Student.collegename = "GOOD Unviersity";
	s1 = new Student();
	//s1.collegename = "changed";
	
	
	//s2.collegename = "S2Changed";
	//s1.
	//s1.m1();

	
	//s2.m1();
	
	
	}

}
