package com.dit.java.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Data to write in a file");
		String txt = sc.nextLine();
		
		FileOutputStream fo = new FileOutputStream("E:\\DIT_CAF_Batch\\DIT_CAF_Batch_Eclipse\\songs\\sample.txt");
		
		fo.write(txt.getBytes());
		
		fo.close();
		
		System.out.println("Data write in a file");

	}

}
