package com.meritamerica.assignment1;

import java.text.DecimalFormat;


public class CheckingAccount  {
	
	double checkingBalanceThreeYears;
	double openingBalance;
	double currentBalance;
	double interestRate = .0001;
	double value;
	
	public CheckingAccount( double openingBalance) {
		this.openingBalance = openingBalance;
		this.currentBalance = openingBalance;
		
	}
	
	public double getBalance() {
		return this.currentBalance;
	}
	
	
	public double getInterestRate() {
		return this.interestRate;
	}
	
	public void setInterestRate(double interestRate, int years) {
		this.interestRate = interestRate;
		
	}
	
	public boolean withdraw(double amount) {
		if (currentBalance <= 0) {
			System.out.println("Unable to make withdrawal. Not enough funds.");
			return false;
		}
		if (amount > currentBalance) {
		
			System.out.println("Unable to make withdrawal. Not enough funds.");
			return false;
			
		} 
		 if (amount < 0) {
			System.out.println("Unable to make withdrawal.");
			return false;
		}
		else {
			this.currentBalance =  currentBalance - amount;
			System.out.println("Withdrawing: " + amount + "." + "Your balance is now: " + currentBalance);
			
		}
		return true;
		
		
	}
	
	public boolean deposit(double amount) {
		if (amount <= 0) {
			System.out.println("You have to deposit a positive amount.");
			return false;
		} 
		else {
			this.currentBalance = currentBalance +  amount;
			System.out.println("Depositing: " + amount + "." + "Your balance is now: " + currentBalance);
			
			
		}
			return true;
	}
	
	
	
	public double futureValue(int years) {
		//Formula: FV = PV(1 + interestRate) ^ years;
		//double FV = balance * Math.pow(1.01, 3);
		
		checkingBalanceThreeYears = currentBalance * Math.pow((interestRate + 1), years);

		return checkingBalanceThreeYears;

		
	}
	
	public String toString() {
		DecimalFormat df = new DecimalFormat("0.00");
		DecimalFormat iformat = new DecimalFormat(".0000");
		return (
					"Checking Account Balance: " + df.format(currentBalance) + 
				   "\nChecking Account Interest Rate: " + iformat.format(this.interestRate) +
					"\nChecking Account Balance in 3 Years: " + df.format(futureValue(3))
				   );
	}
}

	
	
	
