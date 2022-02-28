package com.dit.los.customer;

public class LoanDetails {
	
	private String type;
	private int duration;
	private double amount;
	private double roi;
	private double loanPerncentage;
	private int score;
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public double getRoi() {
		return roi;
	}
	public void setRoi(double roi) {
		this.roi = roi;
	}
	public double getLoanPerncentage() {
		return loanPerncentage;
	}
	public void setLoanPerncentage(double loanPerncentage) {
		this.loanPerncentage = loanPerncentage;
	}
	

}
