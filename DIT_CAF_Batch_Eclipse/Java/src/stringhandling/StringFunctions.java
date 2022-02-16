package com.dit.java.stringhandling;

public class StringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String name = "    Amit    ";
		String name = "Ammit";
		
		System.out.println(name.length());
		System.out.println(name.charAt(0));
		System.out.println(name.substring(1, 3));
		// 1 - index (start from 0), 3 - position ( start from 1)
		
//		System.out.println(name.trim());
		System.out.println(name.replace('i', 'a'));
		
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.concat(" Kumar"));
		System.out.println(name+" Kumar");
		System.out.println(name.contains("mit"));
		System.out.println(name.indexOf("m"));
		System.out.println(name.lastIndexOf("m"));
	}

}
