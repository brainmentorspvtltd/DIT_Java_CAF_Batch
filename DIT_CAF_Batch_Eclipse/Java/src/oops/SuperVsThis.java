package com.dit.java.oops;

class A {
	private int x;
	
	A()
	{
		this(99);
		System.out.println("A Default Cons Call");
	}	
	A(int x)
	{
		this.x = x;
		System.out.println("A Param Cons Call "+x);
	}	
}
class B extends A {
	private int y;
	
	B()
	{
		System.out.println("B Default Cons Call");
	}	
	B(int y)
	{
		this();
		this.y = y;
		System.out.println("B Param Cons Call "+y);
	}
}

public class SuperVsThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B(10);

	}

}
