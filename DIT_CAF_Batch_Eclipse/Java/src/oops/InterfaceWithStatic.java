package com.dit.java.oops;

interface Practice {
	static void show()
	{
		System.out.println("Interface's Static Method");
	}
	
	void display(); // abstract method
}

class Demo implements Practice {
	public void display()
	{
		System.out.println("This is Display Method of Inteface");
	}
}

public class InterfaceWithStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Demo obj = new Demo();
		obj.display();
		Practice.show();

	}

}
