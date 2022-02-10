package com.dit.java.stringhandling;

public class StringBufferConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer();
		
		System.out.println(sb.capacity()+" "+sb.length());
		sb.append("Hello");
		System.out.println(sb.capacity()+" "+sb.length());
		sb.append("How are you I am Fine");
		System.out.println(sb.capacity()+" "+sb.length());
		sb.append("How are iuwegilfuwgtiruefylfkdjbgjkdbgjkeqirybliety*zw");
		System.out.println(sb.capacity()+" "+sb.length());

	}

}
