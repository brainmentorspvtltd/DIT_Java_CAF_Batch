package com.dit.los.operation;

import java.util.ArrayList;

import com.dit.los.customer.Customer;
import com.dit.los.customer.PersonalInformation;

public interface DB {

	public static ArrayList<Customer> getNegativeCustomers()
	{
		ArrayList<Customer> negativeCustomers = new ArrayList<>();
		Customer customer = new Customer();
		
		customer.setId(1010);
		PersonalInformation pd = new PersonalInformation();
		pd.setFirstName("Tim");
		pd.setLastName("Jackson");
		pd.setPhone("8927468");
		pd.setPanCard("3209BM");
		pd.setVoterId("TY4387");
		pd.setEmail("tim@gmail.com");
		customer.setPersonal(pd);
		
		negativeCustomers.add(customer);
		
		pd = new PersonalInformation();
		pd.setFirstName("Tom");
		pd.setLastName("Bahl");
		pd.setPhone("283476987");
		pd.setPanCard("3459BM");
		pd.setVoterId("TY8387");
		pd.setEmail("tom@gmail.com");
		customer.setPersonal(pd);
		
		negativeCustomers.add(customer);
		
		return negativeCustomers;
	}
	
}
