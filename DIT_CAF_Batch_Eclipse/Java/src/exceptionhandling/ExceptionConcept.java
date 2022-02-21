package com.dit.java.exceptionhandling;

public class ExceptionConcept {
	
	public static void DB() throws ArithmeticException
	{
		System.out.println("Connection Open");
		try {
			int e = 100 / 0;
			System.out.println("Query and Get result of the query");
			System.out.println("Send result to Helper");
		}
//		finally: It is a block which always execute
		finally {
			System.out.println("Connection Close");
		}
	}
	
	public static void helper() throws ArithmeticException
	{
		System.out.println("Call DB");
		DB();
		System.out.println("Get result from DB");
		System.out.println("Send result to View");
	}
	
	public static void view()
	{
		System.out.println("Call Helper");
		try {
			helper();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Please Enter Valid Input");
			System.exit(0);
		}
		System.out.println("Get result from the Helper");
		System.out.println("Print result to User");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		view();

	}

}
