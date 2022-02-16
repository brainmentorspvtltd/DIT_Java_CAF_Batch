package com.dit.java.stringhandling;

public class RemoveDuplicatesString {
	
	public static String removeDuplicates(String s)
	{
		String str  = new String();
		int length = s.length();
		
		for(int i = 0; i < length; i++)
		{
			char c = s.charAt(i);
			
			if(str.indexOf(c) < 0) // -1
			{
				str += c;
			}
		}
		
		return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Ammit";
		
		System.out.println(removeDuplicates(str));

	}

}
