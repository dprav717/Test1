package com.encapuslation;

public class Tcat {

	public static void main(String[] args) {
		Cat obj = new Cat("play", "feed", "sleep");
		obj.getMood();
		obj.getHungry();
		obj.getEnergy();
		//obj.Meow();
		obj.Play();
		System.out.println("The output:"+ obj.getMood());
		obj.feed();
		System.out.println("The output:"+ obj.getEnergy());
		obj.sleep();
		System.out.println("The output:"+ obj.getHungry());
		
		
		

	}

}
