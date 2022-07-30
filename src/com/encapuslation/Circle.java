package com.encapuslation;

public class Circle extends Shapes{
	
	public int r;

	public double AreaC;
	
	public Circle(int r,  String color) {
		super(color);
		this.r=r;
		this.AreaC=AreaC;
	}
	
	public double area() {
		
	AreaC=3.14*r*r;
	return AreaC;
	}
  
public String CColor() {
	return "The circle color is::" + super.color + "area is::" + area();
	
}
}
