package com.dit.java.oops;

class Parent_ {
	public void display()
	{
		System.out.println("Parent Class");
	}
}

class Child_ extends Parent_ {
	
	@Override 
	public void display()
	{
		System.out.println("Child Class");
	}
	
}

public class UpcastingAndDowncasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Upcasting: child to parent
		Parent_ parent = new Child_();
		parent.display();
		
		//downcasting
		//Child_ child = new Parent_(); // compile time error
		
		Child_ child = (Child_)parent; // Explicit
		child.display();
		
	}

}
