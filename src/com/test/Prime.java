package com.test;


import java.util.Scanner;
public class Prime {

	public static void main(String[] args)
	{

              Scanner scanner = new Scanner(System.in);
              System.out.println("Enter the n value");

              int n=scanner.nextInt();
		
              for(int i=2; i<n; i++) 
              {
				  int c = 0;
				  	for(int j=2; j<i; j++)
				  	{
						if(i%j==0)
						{
							c++;
						}
								
				  	}
					if(c==0) 
					{
						System.out.println(i);
					}
			}
	}
}





