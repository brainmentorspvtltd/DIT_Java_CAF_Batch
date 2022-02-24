package com.dit.java.filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	
	private int id;
	private String name;
	private double salary;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	Employee(int id, String name, double salary)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
		System.out.println("Employee Param Cons");
	}	
}

public class ObjectDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Employee ram = new Employee(1001, "Ram Kumar", 10000);
		FileOutputStream fo = new FileOutputStream("E:\\DIT_CAF_Batch\\DIT_CAF_Batch_Eclipse\\songs\\sample.txt");

//		Object transfer into byte file: Serialization
		
		ObjectOutputStream os = new ObjectOutputStream(fo);
		os.writeObject(ram);
		
		os.close();
		fo.close();
		
		System.out.println("Object Write Done");
		
		//Byte file transfer into Object Data: Deserialization
		
		FileInputStream fs = new FileInputStream("E:\\DIT_CAF_Batch\\DIT_CAF_Batch_Eclipse\\songs\\sample.txt");
		ObjectInputStream oi = new ObjectInputStream(fs);
		
		Employee e = (Employee)oi.readObject();
		
		System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
		
		oi.close();
		fs.close();
		
		System.out.println("Object Read Done");
		
	}

}
