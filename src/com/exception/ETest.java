package com.exception;

import java.io.File;
import java.io.IOException;

public class ETest 
{
public static void main(String[] args)
{
	
	m1();
	
}
	public static void m1() 
	{
		
			//
			//
			//
			//
			//
		try
		{
			m2();
		}
		catch(Exception e )
		{
			
		}
			//
			
			//
			//
			//
		//
		//
		
		
		
	}
	
	public static void m2() throws IOException
	{
		File f = new File("\\test");
		f.createNewFile();
	}
}
