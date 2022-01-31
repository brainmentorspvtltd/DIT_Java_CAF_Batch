package com.dit.java.oops;

public class Student { // Encapsulation + Data Hiding = Good Encapsulation
	
	//Class variables, instance variables, Data members
	
	//private member variables
	//Private: Data Security - Data Hiding
	private int rollno; 
	private String name;
	private String phone;
	private String course;
	private double fees;
	private String collegeName;

	//getter
	public String getPhone() {
		return phone;
	}
	//setter
	public void setPhone(String phone) {
		this.phone = phone;
	}

	//default constructor
	Student()
	{
		//call to the parameterized Cons
		this(1001, "Ram Kumar", "8763488723", "BCA", 10000.0);
		collegeName = "DIT";
	}
	
	//Parameterized Constructor
	Student(int rollno, String name, String phone, String course, double fees)
	{
		//this(); // Call to the default constructor
		this.rollno = rollno;
		this.name = name;
		this.phone = phone;
		this.course = course;
		this.fees = fees;
	}
	
	
	//r, n, p, c, f - local variables
	// scope is with in the function
	
	//public void takeInput(int r, String n, String p, String c, double f)
	/*
	public void takeInput(int rollno, String name, String phone, String course, double fees)
	{
		
//		instance variables = local variables
		
		this.rollno = rollno;
		this.name = name;
		this.phone = phone;
		this.course = course;
		this.fees = fees;	
		
//		rollno = r;
//		name = n;
//		phone = p;
//		course = c;
//		fees = f;		
	}*/
	
	public void print() {
	
		System.out.println("Rollno is: "+this.rollno);
		System.out.println("Name is: "+name);
		System.out.println("Phone is: "+phone);
		System.out.println("Course is: "+course);
		System.out.println("Fees is: "+fees);
		System.out.println("College Name is: "+collegeName);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// called parameterized Cons
		//Student ram = new Student(1001, "Ram Kumar", "8763488723", "BCA", 10000.0);
		Student ram = new Student(); // Call to the default cons
		
		// ram: reference variable
		//ram.takeInput(1001, "Ram Kumar", "8763488723", "BCA", 10000.0);
		ram.print();
		
		System.out.println("****************************************************");
		
		ram.setPhone("8724687874");
		System.out.println(ram.getPhone());
		ram.print();
		
//		Student shyam = new Student();
//		shyam.print();
		
//		System.out.println("Roll no: "+ram.rollno);
//		System.out.println("Name is: "+ram.name);
//		System.out.println("Course is: "+ram.course);
//		System.out.println("Phone is: "+ram.phone);
//		System.out.println("Fees is: "+ram.fees);
		
//		ram.rollno = -1001;
//		ram.name = "Ram Kumar";
//		ram.phone = "7823687786";
//		ram.course = "MCA";
//		ram.fees = 10000.0;
		
//	System.out.println("****************************************************");
//		
//		System.out.println("Roll no: "+ram.rollno);
//		System.out.println("Name is: "+ram.name);
//		System.out.println("Course is: "+ram.course);
//		System.out.println("Phone is: "+ram.phone);
//		System.out.println("Fees is: "+ram.fees);
	}

}
