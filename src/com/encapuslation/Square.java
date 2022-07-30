package com.encapuslation;

public class Square extends Shapes {
	
	public int l;
	public int b;
	
	public double AreaS;
	
	public Square(int l, int b, String color) {
		super(color);
		
		this.l=l;
		this.b=b;
		
		this.AreaS = AreaS;
	}
	
	public double area() {
		
	AreaS=l*l;
	return AreaS;
	}
	public String CColor() {
		return "The Square color is::" + super.color + "area is::" + area();
		
	}

}


