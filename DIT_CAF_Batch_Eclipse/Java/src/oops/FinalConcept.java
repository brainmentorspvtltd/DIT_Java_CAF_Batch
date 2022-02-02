package com.dit.java.oops;

final class Base {
	public final void showData()
	{
		System.out.println("Base Class Method");
	}
}

class Derived extends Base {
	@Override
	public void showData()
	{
		System.out.println("Derived Class Method");
	}
}


public class FinalConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//final float PI = 3.14f;
		
		//pi = 34.6f; // error
		
		//System.out.println(PI);

	}

}
