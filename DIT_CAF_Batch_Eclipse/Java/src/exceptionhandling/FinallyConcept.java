package com.dit.java.exceptionhandling;

import java.util.Scanner;

public class FinallyConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Numerator:");
		int a = sc.nextInt();
		
		System.out.println("Enter Denominator:");
		int b = sc.nextInt();
		
		try {
			
			int c = a / b;
			
			System.out.println("Division is: "+c);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("You divide a  number by zero");
			return;
		}
		
		finally {
			System.out.println("Division Done");
		}

	}

}
