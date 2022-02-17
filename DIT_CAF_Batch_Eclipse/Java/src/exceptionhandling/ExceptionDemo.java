package com.dit.java.exceptionhandling;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("DB Connection Open");
		System.out.println("DB Query");
		//try means guarded region
		try {
			String t = null;
			t.toLowerCase();
			
			int e = 10 / 0; // throw ArithmeticException
			
			int m[] = new int[10];
			m[11] = 100;
		}
		catch(ArithmeticException e) // exception handling
		{
			System.out.println("You divide a number by zero "+e);
			return;
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("More than Array Bound (size)");
			return;
		}
		
		catch(NullPointerException e)
		{
			System.out.println("Value is Null");
			return;
		}
		System.out.println("Get the Result of Query");
		System.out.println("Print the Result of the Query");
		System.out.println("Close the Connection");

	}

}
