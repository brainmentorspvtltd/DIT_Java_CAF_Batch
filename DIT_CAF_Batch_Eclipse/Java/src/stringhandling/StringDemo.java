package com.dit.java.stringhandling;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String Literal Style: 1 or 0
		String name = "Ram";
		String name2 = "Ram";
		// String Object Style: 1 or 2
		String name3 = new String("Ram").intern();
		String name4 = new String("Ram");
		
		System.out.println(name == name2);
		System.out.println(name == name3);
		System.out.println(name3 == name4);
		
		String t = "Hello";
		String y = t;
		System.out.println(y == t);
		
		t = t + "How are you";
		System.out.println(y == t);
	}

}
