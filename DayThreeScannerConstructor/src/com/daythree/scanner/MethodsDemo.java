package com.daythree.scanner;

public class MethodsDemo {
//	Non-parameterized method
	public void addition()
	{
		int x = 10; //local variable
		int y = 20;
		int add = x+y;
		System.out.println("Addition of x and y = "+ add);
		
	 }
	
//	Parameterized method
	public void multiplication(int a , int b)
	{
		int multiply = a * b;
		System.out.println("Multiplication of the A and B is = "+multiply);
		
	}

	public static void main(String[] args) {
		
		MethodsDemo obj1 = new MethodsDemo(); //object creation
		obj1.addition(); //calling the methods
		obj1.multiplication(20, 3);
		
				

	}

}
