package com.meritamerica.assignment1;

import java.text.DecimalFormat;


public class SavingsAccount {
	
	double savingsInterestRate = .01;
	double openingBalance;
	double currentBalance;
	double savingsValue;
	
	public SavingsAccount(double openingBalance) {
		this.openingBalance = openingBalance;
		this.currentBalance = openingBalance;
		
		
	}
	
	public double getBalance() {
		return this.currentBalance;
	}
	
	public double getInterestRate() {
		return this.savingsInterestRate;
	}
	
	public void setInterestRate(double interestRate, int years) {
		this.savingsInterestRate = interestRate;
		interestRate = 1 + .01;
		
	}
	
	public boolean withdraw(double amount) {
		if (currentBalance <= 0 || amount > currentBalance) {
			System.out.println("Unable to make withdrawal. Not enough funds.");
			return false;
		}
		else {
			currentBalance = currentBalance - amount;
			System.out.println("Withdrawing: " + amount + "." + " Your balance is now: " + currentBalance);
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
			System.out.println("Depositing: " + amount + "." + " Your balance is now: " + currentBalance);
		}
		return true;
	}
	
	public double futureValue(int years) {
		savingsValue = currentBalance * Math.pow(.01 + 1, years);
		return savingsValue;

	}
	
	public String toString() {
		DecimalFormat df = new DecimalFormat("0.00");
		DecimalFormat iformat = new DecimalFormat(".0000");
		return (
				"Savings Account Balance: " + df.format(currentBalance) + 
				"\nSavings Account Interest Rate: " + iformat.format(savingsInterestRate) + 
				"\nSavings Account Balance in 3 years: " + df.format(futureValue(3))
				);
	}
}