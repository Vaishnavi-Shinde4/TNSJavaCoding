package com.Java;

public class Conditional {

	public static void main(String[] args) {
		
		char x='l';
		
		switch(x)
		{
		case 'l':
		case 'L':
			System.out.println("This code contains letters");
			break;
		case 'd':
		case 'D':
			System.out.println("This code contains digits");
			break;
		case 's':
		case 'S':	
			System.out.println("This code contains symbols");
			break;
		case 'w':
		case 'W':
			System.out.println("This code contains whitspace");
			break;
		default:
			System.out.println("This code not contains letters, digits, symbols and whitspace.");
			break;
		}

	}

}
