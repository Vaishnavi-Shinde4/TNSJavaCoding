package com.methodoverridding;

public class ShapeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shapes[] = new Shape[2];
		
		shapes[0] = new Circle(5.0);
		shapes[1] = new Square(6.0);
		
		for(Shape s:shapes)
		{
			s.draw();
			s.Erase();
			System.out.println("------------------");
		}
		

	}

}
