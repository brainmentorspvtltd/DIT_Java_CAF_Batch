package com.dit.java.oops;

abstract class Person_ {
	
	private String name;
	private int age;
	
	public Person_(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public void print()
	{
		System.out.println(name+" "+age);
	}
	
	public abstract void contNumber(); // only declared here
	
}

class Student_ extends Person_ {
	
	private int id;
	
	public Student_(int id)
	{
		super("Ram Kumar", 25);
		this.id = id;
	}
	
	public void printId()
	{
		System.out.println(id);
	}

	@Override
	public void contNumber() {
		
		System.out.println("Student's Contact Number");
	}
}

public class AbstractConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student_ student = new Student_(100);
		student.printId();
		student.print();
		student.contNumber();
		
		//Person_ person = new Person_(); // error
	
	}
}
