package com.tnsif.overloading;

public class Operation {
	
	public static boolean isPalindrome(int num) {
		int rev = 0;
		int dummyNumber = num;
		
		while(num != 0) {
			rev = rev*10 + num %10;
			num /= 10;
		}
		return dummyNumber == rev;
	}
	
	public static boolean isPalindrome(String str)
	{
		String rev;
		rev = new StringBuffer(str).reverse().toString();
		return str.equals(rev);
	}

}
