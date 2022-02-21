package com.dit.java.exceptionhandling;

import java.io.File;
import java.io.IOException;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("DB Connection Open");
		System.out.println("DB Query");
		//try means guarded region
		try {
			
			String path = "E:\\DIT_CAF_Batch\\DIT_CAF_Batch_Eclipse\\File123\\abc.txt";
			
			File file = new File(path);
			
			if(file.exists())
			{
				System.out.println("Yes this file is exist");
				file.delete();
			}
			else {
				file.createNewFile();
				System.out.println("File Created");
			}
			
//			String t = null;
//			t.toLowerCase(); // throw NullPointerException
//			
//			int e = 10 / 0; // throw ArithmeticException
//			
//			int m[] = new int[10];
//			m[11] = 100;
		}
		
		catch(Exception e)
		{
			System.out.println("System Error. Please connect to System Admin");
			//return;
			System.exit(0);
		}
//		catch(IOException e)
//		{
//			System.out.println("File can't be Create");
//			return;
//		}
//		catch(ArithmeticException e) // exception handling
//		{
//			System.out.println("You divide a number by zero "+e);
//			return;
//		}
//		
//		catch(ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println("More than Array Bound (size)");
//			return;
//		}		
//		catch(NullPointerException e)
//		{
//			System.out.println("Value is Null");
//			return;
//		}
		System.out.println("Get the Result of Query");
		System.out.println("Print the Result of the Query");
		System.out.println("Close the Connection");

	}

}
