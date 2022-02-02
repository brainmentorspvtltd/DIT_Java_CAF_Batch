package com.dit.java.oops;

class Pers {
	//private String name;
	protected String name;
	
	public void setData()
	{
		name = "Ravi";
	}
}

class Studt extends Pers {
	
	public void print()
	{
		System.out.println("Name is: "+name);
	}
}

public class ProtectedUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Studt student = new Studt();
		student.setData();
		student.print();

	}

}
