package com.encapuslation;

public class Cat {
	private String mood;
	private String hungry;
	private String energy;
	private String meow;
	
	public Cat(String mood, String hungry, String energy) {
		this.mood = mood;
		this.hungry= hungry;
		this.energy = energy;
		//System.out.println("the cat is play full mood");
	}
	public void Play() {
		System.out.println("Playing");
		}
	public void feed() {
		System.out.println("Feeding");
	}
	public void sleep() {
		System.out.println("sleeping");
	}
		
	public void setMood() {
		//this.mood = mood;
		//System.out.println("the cat is play full mood");
	}
	public String getMood() {
		return mood;
		}
	
	public void setHungry() {
		//this.hungry = hungry;
		System.out.println("the cat is hungry feed it");
	}
		
		public String getHungry() {
			return hungry;	
		}
		
    public void setEergy() {
		this.energy = energy;
		  System.out.println("the cat is sleepy,no energy");
    }
    public String getEnergy() {
		return energy;
  }
    
    private void Meow() {
		System.out.println("Meow)");
  }
}