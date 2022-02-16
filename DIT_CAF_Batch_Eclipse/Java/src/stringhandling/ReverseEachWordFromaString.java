package com.dit.java.stringhandling;

public class ReverseEachWordFromaString {
	
	public static void reverseEachWord(String input)
	{
		String words[] = input.split(" ");
		String revString = "";
		
		for(int i = 0; i < words.length; i++)
		{
			String word = words[i];
			
			String revWord = "";
			for(int j = word.length() - 1; j >= 0; j--)
			{
				revWord += word.charAt(j);
			}
			
			revString = revString + revWord + " ";
		}
		
		System.out.println(input);
		System.out.println(revString);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		reverseEachWord("Java Example");

	}

}
