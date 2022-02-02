package com.dit.java.oops;

class People {
	
	private String name;
	private String phone;
	
	public People()
	{
		System.out.println("Parent Default Cons Call");
	}
	
	public People(String name, String phone)
	{
		this(); // Parent Default Cons Call
		this.name = name;
		this.phone = phone;
		//name = "Rahul";
	}
	
	public void printName()
	{
		System.out.println("Name of the Person is: "+name+" Phone is: "+phone);
	}
}

class Driver extends People{
	
	private String name;
	private int id;
	
	public Driver()
	{
		super("Rahul", "8324768768"); // parent param cons call
		System.out.println("Child Default Cons Call");
	}
	
	public Driver(String name, int id)
	{
		this(); // Driver Default Cons Call
		//super("Rahul", "8324768768"); // parent param cons call
		this.name = name;
		this.id = id;
		
//		name = "Ram";
//		id = 110;
	}
	
	public void display()
	{
		System.out.println("Name of Driver is: "+name+" id is: "+id);
	}
}

public class ISADemoConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Driver d = new Driver("Ram", 110);
		d.display();
		d.printName();

	}

}
