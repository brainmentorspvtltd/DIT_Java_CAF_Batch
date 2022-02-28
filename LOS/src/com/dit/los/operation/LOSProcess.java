package com.dit.los.operation;

import com.dit.los.customer.Customer;
import com.dit.los.customer.LoanDetails;
import com.dit.los.customer.PersonalInformation;
import com.dit.los.utils.CommonConstants;
import com.dit.los.utils.LoanConstants;
import com.dit.los.utils.StageConstants;
import com.dit.los.utils.Utility;

import static com.dit.los.utils.Utility.scanner;
import static com.dit.los.utils.Utility.serialCounter;

import java.util.ArrayList;

public class LOSProcess implements LoanConstants, StageConstants, CommonConstants{
	
	ArrayList<Customer> customers = new ArrayList<>();
	
	public void approval(Customer customer)
	{
		customer.setStage(APPROVAL);
		
		System.out.println("Id "+customer.getId());
		System.out.println("Name "+customer.getPersonal().getFirstName()+" "
		+customer.getPersonal().getLastName());
		double approvedAmount = customer.getLoanDetails().getAmount();
		System.out.println("Loan Approved Amount "+approvedAmount);
		
		System.out.println("Do you want to bring this loan or not");
		char choice = scanner.next().toUpperCase().charAt(0);
		
		if(choice == NO)
		{
			customer.setStage(REJECT);
			customer.setRemarks("Customer deny the Approved Amount "+approvedAmount);
			return;
		}
		else {
			showEMI(customer);
		}
	}
	
	private void showEMI(Customer customer)
	{
		if(customer.getLoanDetails().getType()==LoanConstants.HOME_LOAN)
		{
			customer.getLoanDetails().setRoi(LoanConstants.HOME_LOAN_ROI);
		}
		if(customer.getLoanDetails().getType()==LoanConstants.AUTO_LOAN)
		{
			customer.getLoanDetails().setRoi(LoanConstants.AUTO_LOAN_ROI);
		}
		if(customer.getLoanDetails().getType()==LoanConstants.PERSONAL_LOAN)
		{
			customer.getLoanDetails().setRoi(LoanConstants.PERSONAL_LOAN_ROI);
		}
		
		double perMonthPrinciple = customer.getLoanDetails().getAmount() / 
								customer.getLoanDetails().getDuration();
		
		double interest = perMonthPrinciple * customer.getLoanDetails().getRoi();
		
		double totalEMI = perMonthPrinciple + interest;
		
		System.out.println("Your per month EMI is "+totalEMI);
		System.exit(0);
	}
	
	
	public void scoring(Customer customer)
	{
		customer.setStage(SCORING);
		
		int score = 0;
		double Totalincome = customer.getIncome() - customer.getLiability();
		
		if(customer.getPersonal().getAge() >= 21 && customer.getPersonal().getAge() <= 35)
		{
			score += 50;
		}
		
		if(Totalincome > 200000)
		{
			score += 50;
		}
		
		customer.getLoanDetails().setScore(score);
		
	}
	
	public void dedupe(Customer customer)
	{
		customer.setStage(DEDUPE);
		
		boolean isNegativeFound = false;
		
		for(Customer negativeCustomer : DB.getNegativeCustomers())
		{
			int negativeScore = isNegative(customer, negativeCustomer);
			
			if(negativeScore > 0)
			{
				System.out.println("Customer Record Fraud in Dedupe and Score is "+negativeScore);
				isNegativeFound = true;
				break;
			}
		}
		
		if(isNegativeFound)
		{
			System.out.println("Do you want to Proceed this Loan "+customer.getId());
			char choice = scanner.next().toUpperCase().charAt(0);
			
			if(choice == NO)
			{
				customer.setRemarks("Loan is Rejected, Due to high score in Dedupe Check");
				customer.setStage(REJECT);
				return;
			}
		}
	}
	
	private int isNegative(Customer customer, Customer negative)
	{
		int percentageMatch = 0;
		
		if(customer.getPersonal().getPhone().equals(negative.getPersonal().getPhone()))
		{
			percentageMatch += 20;
		}
		if(customer.getPersonal().getEmail().equals(negative.getPersonal().getEmail()))
		{
			percentageMatch += 20;
		}
		if(customer.getPersonal().getVoterId().equals(negative.getPersonal().getVoterId()))
		{
			percentageMatch += 20;
		}
		if(customer.getPersonal().getPanCard().equals(negative.getPersonal().getPanCard()))
		{
			percentageMatch += 20;
		}
		if(customer.getPersonal().getAge() == negative.getPersonal().getAge() 
				&& customer.getPersonal().getFirstName().equalsIgnoreCase(negative.getPersonal().getFirstName()))
		{
			percentageMatch += 20;
		}
		
		return percentageMatch;
	}
	
	public void qde(Customer customer)
	{
		customer.setStage(QDE);
		
		System.out.println("Application Number "+customer.getId());
		System.out.println("Name "+customer.getPersonal().getFirstName() 
				+" "+customer.getPersonal().getLastName());
		System.out.println("You applied for a "+customer.getLoanDetails().getType() 
				+" "+customer.getLoanDetails().getAmount()+" "
				+customer.getLoanDetails().getDuration());
		System.out.println("Enter the PanCard Number");
		String panCard = scanner.next();
		System.out.println("Enter the Voter ID");
		String voterId = scanner.next();
		System.out.println("Enter the Income");
		double income = scanner.nextDouble();
		System.out.println("Enter the liability");
		double liability = scanner.nextDouble();
		System.out.println("Enter the Phone");
		String phone = scanner.next();
		System.out.println("Enter the Email");
		String email = scanner.next();
		
		customer.getPersonal().setPanCard(panCard);
		customer.getPersonal().setVoterId(voterId);
		customer.getPersonal().setPhone(phone);
		customer.getPersonal().setEmail(email);
		customer.setIncome(income);
		customer.setLiability(liability);	
	}
	
	public void sourcing()
	{
		Customer customer = new Customer();
		customer.setStage(SOURCING);
		customer.setId(serialCounter);
		
		System.out.println("Enter the First Name");
		String firstName = scanner.next();
		System.out.println("Enter the Last Name");
		String lastName = scanner.next();
		System.out.println("Enter the age");
		int age = scanner.nextInt();
		
		System.out.println("Enter the type of Loan HL, PL, AL");
		String type = scanner.next();
		System.out.println("Enter the Amount");
		double amount = scanner.nextDouble();
		System.out.println("Enter the Duration");
		int duration = scanner.nextInt();
		
		PersonalInformation pd = new PersonalInformation();
		pd.setFirstName(firstName);
		pd.setLastName(lastName);
		pd.setAge(age);
		customer.setPersonal(pd);
		
		LoanDetails loanDetails = new LoanDetails();
		loanDetails.setAmount(amount);
		loanDetails.setDuration(duration);
		loanDetails.setType(type);
		customer.setLoanDetails(loanDetails);
		
		customers.add(customer);
		
		serialCounter++;
		System.out.println("Sourcing Done");
	}
	
	public void moveToNextStage(Customer customer)
	{
		while(true)
		{
			if(customer.getStage() == SOURCING)
			{
				System.out.println("Sourcing, Want to move to the next stage Y/N");
				char choice = scanner.next().toUpperCase().charAt(0);
				
				if(choice == YES)
				{
					qde(customer);
				}
				else {
					return;
				}
			}
			if(customer.getStage() == QDE)
			{
				System.out.println("QDE, Want to move to the next stage Y/N");
				char choice = scanner.next().toUpperCase().charAt(0);
				
				if(choice == YES)
				{
					dedupe(customer);
				}
				else {
					return;
				}
			}
			if(customer.getStage() == DEDUPE)
			{
				System.out.println("Dedupe, Want to move to the next stage Y/N");
				char choice = scanner.next().toUpperCase().charAt(0);
				
				if(choice == YES)
				{
					scoring(customer);
				}
				else {
					return;
				}
			}
			if(customer.getStage() == SCORING)
			{
				System.out.println("Scoring, Want to move to the next stage Y/N");
				char choice = scanner.next().toUpperCase().charAt(0);
				
				if(choice == YES)
				{
					approval(customer);
				}
				else {
					return;
				}
			}
		}
	}
	
	public void checkStage(int applicationNumber)
	{
		boolean isStageFound = false;
		
		if(customers != null && customers.size() > 0) {
			for(Customer customer : customers)
			{
				if(customer.getId() == applicationNumber)
				{
					System.out.println("You are on "+Utility.getStageName(customer.getStage()));
					isStageFound = true;
					moveToNextStage(customer);
					break;
				}
			}
		}	
		
		if(!isStageFound)
		{
			System.out.println("Invalid Application Number");
		}
	}
}
