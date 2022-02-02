package com.dit.java.oops;

class PersonNew {
	private String name;
	
	public PersonNew()
	{
		name = "Amit";
	}
	
	public void printName()
	{
		System.out.println("Name is: "+name);
	}
	
	public void contNumber()
	{
		System.out.println("Contact Number of Person");
	}
}

class StudentNew extends PersonNew {
	
	private int id;
	
	public StudentNew()
	{
		id = 101;
	}
	
	public void printId()
	{
		System.out.println("Id is: "+id);
	}
	
	@Override
	public void contNumber()
	{
		System.out.println("Contact Number of Student");
	}
}

public class OverridingConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentNew student = new StudentNew();
		student.printId();
		student.printName();
		student.contNumber();
	}

}
