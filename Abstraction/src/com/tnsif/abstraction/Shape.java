package com.tnsif.abstraction;

abstract public class Shape {
	protected float area;
	
	abstract void calArea();
	
	//concrete method
	
	void show() {
		System.out.println("Area of shape is "+area);
	}
	

}
