package com.dit.java.oops;

interface Addition {
	int add(int a, int b);
}

public class LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Lambda Expression
		Addition sum = (a, b)->(a + b);
		System.out.println(sum.add(100, 200));
		
		Addition sum2 = (int a, int b)->(a + b);
		System.out.println(sum2.add(10, 20));
	}

}
