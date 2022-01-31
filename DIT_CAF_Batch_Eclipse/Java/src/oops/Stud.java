package com.dit.java.oops;

class Person {
	
	private int id;
	private String name;
	private String companyName;
	
	public Person()
	{
		this(101, "Ram Kumar"); // call to the param cons
		companyName = "TCS";
	}
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void display()
	{
		System.out.println("Id is: "+id);
		System.out.println("Name is: "+name);
		System.out.println("Company Name is: "+companyName);
	}
}

public class Stud { // class student

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person ram = new Person();
		ram.display();
		
	}

}
