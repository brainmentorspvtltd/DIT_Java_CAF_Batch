package com.dit.java.oops;

//Parent Class
class Human {
	
	private String name;
	
	public Human()
	{
		name = "Ram Kumar";
	}
	
	public void printName()
	{
		System.out.println("Name of the Person is: "+name);
	}
}

//Child Class
class Employee extends Human
{
	private int empId;
	
	public Employee()
	{
		empId = 101;
	}
	
	public void printId()
	{
		System.out.println("Id of the Employee is: "+empId);
	}
}

public class ISADemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee();
		e.printId();
		e.printName();

	}

}
