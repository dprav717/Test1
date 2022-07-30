package com.encapuslation;

public abstract class Shapes {
	public String color;
	
	public Shapes (String color) {
		this.color=color;
		}
	
	 public void setColor() {
		  this.color = color;
	  }
	 public String getColor() {
		 return color;
	 }
	public abstract double area();

}
