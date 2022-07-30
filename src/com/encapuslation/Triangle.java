
package com.encapuslation;



public class Triangle extends Shapes {
	
	public int bb;
	public int hh;
	public double AreaT;
	
	public Triangle(int bb, int hh, String color) {
		super(color);
		this.bb=bb;
		this.hh=hh;
		this.AreaT = AreaT;
	}
	
	public double area() {
		
	AreaT=bb*hh*0.5;
	return AreaT;
	}
	public String CColor() {
		return "The triangle color is::" + super.color + "area is::" + area();
	}	

}


