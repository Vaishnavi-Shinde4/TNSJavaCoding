package com.methodoverridding;

public class Square extends Shape {
	
	private double side;
	
	public Square(double side) {
		super();
		this.side = side;
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing a Square with side "+ side);
	}
	
	@Override
	public void Erase() {
		System.out.println("Erasing a Square with side "+ side);
		
	}

}
