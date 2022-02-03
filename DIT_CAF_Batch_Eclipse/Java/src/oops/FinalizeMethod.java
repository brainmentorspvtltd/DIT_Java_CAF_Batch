package com.dit.java.oops;

public class FinalizeMethod {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinalizeMethod obj = new FinalizeMethod();
		
		obj = null;
		
		//Request to JVM to call garbage collector
		System.gc();
		System.out.println("Main Method Complete");
	}
	
	//override
	public void finalize()
	{
		System.out.println("Finalize Method");
	}

}
