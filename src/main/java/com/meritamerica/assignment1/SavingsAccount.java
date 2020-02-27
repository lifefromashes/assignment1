package com.meritamerica.assignment1;

public class SavingsAccount extends AccountHolder {
	
	double savingsInterestRate = .01;
	
	public SavingsAccount(String firstName, String middleName, String lastName, String ssn, double checkingAccountOpeningBalance, double savingsAccountOpeningBalance, double openingBalance) {
		super(firstName, middleName, lastName, ssn, savingsAccountOpeningBalance, checkingAccountOpeningBalance);
		
	}
	
	
	public double getBalance() {
		return this.savingsBalance;
	}
	
	public double getSavingsInterestRate() {
		return this.savingsInterestRate;
	}
	
	public void setInterestRate(double interestRate, int years) {
		this.interestRate = interestRate;
		interestRate = 1 + .01;
				//savingsBalance * Math.pow((interestRate + 1), years);
		
	}
	
	public boolean withdraw(double amount) {
		if (savingsBalance <= 0 || amount > savingsBalance) {
			System.out.println("Unable to make withdrawal. Not enough funds.");
			return false;
		}
		else {
			savingsBalance = savingsBalance - amount;
			System.out.println("Withdrawing: " + amount + "." + " Your balance is now: " + savingsBalance);
		}
		return true;
	}
	
	public boolean deposit(double amount) {
		if (amount < 0) {
			System.out.println("You can't deposit an amount of 0 or less.");
			return false;
		}
		else {
			savingsBalance = savingsBalance + amount;
			System.out.println("Depositing: " + amount + "." + " Your balance is now: " + savingsBalance);
		}
		return true;
	}
	
	public double savingsFutureValue(int years) {
		double savingsValue = savingsBalance * (double)(Math.pow((interestRate + 1), years));
		return savingsValue;
	}
	
	public String toString() {
		return (
				"Savings Account Balance: " + savingsBalance + 
				"\nSavings Account Interest Rate: " + savingsInterestRate + 
				"\nSavings Account Balance in 3 years: " 
				);
	}
}