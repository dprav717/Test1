package com.test;

public class Multi {
	
	public int i;
	public int j;
	public int k;

	public static void main(String[] args) {
		
		Multi cation = new Multi();
		
		cation.j=8;
		
		for (int i=1; i<=10; i++) {
			
		    cation.k=cation.j*i;
			
			System.out.println("8 *"+ i +"=" + cation.k);
		}

	}
}
