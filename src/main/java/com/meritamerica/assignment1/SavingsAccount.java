package com.meritamerica.assignment1;

import java.text.DecimalFormat;


public class SavingsAccount {
	
	private double currentBalance;
	private double savingsValue;
	private double interestRate = .01;
	//double savingsInterestRate = .01;
	//double openingBalance;
	
	//Constructor to initialize the objects
	public SavingsAccount(double openingBalance) {
		this.currentBalance = openingBalance;
	}
	
	public double getBalance() {
		return this.currentBalance;
	}
	
	public double getInterestRate() {
		return this.interestRate; //savingsInterestRate;
	}
	
	public void setInterestRate(double interestRate, int years) {
		this.interestRate = interestRate;
		
	}
	
	//methods for withdrawing and depositing money into savings account
	public boolean withdraw(double amount) {
		if (currentBalance <= 0 || amount > currentBalance) {
			System.out.println("Unable to make withdrawal. Not enough funds.");
			return false;
		}
		else {
			currentBalance = currentBalance - amount;
			System.out.println("Withdrawing: " + amount + " from savings.  Your balance is now: " + currentBalance);
		}
		return true;
	}
	
	public boolean deposit(double amount) {
		if (amount < 0) {
			System.out.println("You can't deposit an amount of 0 or less.");
			return false;
		}
		else {
			currentBalance = currentBalance + amount;
			System.out.println("Depositing: " + amount + " to savings. Your balance is now: " + currentBalance);
		}
		return true;
	}
	
	
	//formula to get the future value of savings with interest accrued
	public double futureValue(int years) {
		savingsValue = currentBalance * Math.pow((interestRate + 1), years);
		return savingsValue;

	}
	
	//method to print savings account information
	public String toString() {
		DecimalFormat df = new DecimalFormat("0.00");
		DecimalFormat iformat = new DecimalFormat(".0000");
		return (
				"Savings Account Balance: " + df.format(currentBalance) + 
				"\nSavings Account Interest Rate: " + iformat.format(interestRate) +//savingsInterestRate) + 
				"\nSavings Account Balance in 3 years: " + df.format(futureValue(3))
				);
	}
}