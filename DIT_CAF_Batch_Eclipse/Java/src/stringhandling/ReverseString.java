package com.dit.java.stringhandling;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "Hello";
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(input);
		
		sb.reverse();
		
		System.out.println(sb);

	}

}
