package com.dit.java.oops;

interface Printing {
	void print(); // abstract method
}

interface Display {
	void show();
}

class Child implements Printing, Display {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("This is Show Method");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("This is Print Method");
	}	
}

public class MultipltInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child child = new Child();
		child.print();
		child.show();
		

	}

}
