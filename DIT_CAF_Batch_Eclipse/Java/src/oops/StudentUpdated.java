package com.dit.java.oops;

public class StudentUpdated {
	
	int id;
	String name;
	double fees;
	String collegeName;
	
	public StudentUpdated()
	{
		this(10000.0);
		collegeName = "DIT";
	}

	public StudentUpdated(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public StudentUpdated(double fees) {
		this(101, "Rahul Sharma");
		this.fees = fees;
	}
	
	public void print()
	{
		System.out.println("Id is: "+id);
		System.out.println("Name is: "+name);
		System.out.println("Fees is: "+fees);
		System.out.println("College Name is: "+collegeName);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentUpdated rahul = new StudentUpdated();
		rahul.print();

	}

}
