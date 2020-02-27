package com.meritamerica.assignment1;

import java.text.DecimalFormat;

public class CheckingAccount extends AccountHolder {
	
	double checkingBalanceThreeYears;
	
	double interestRate = .0001;
	//double interestRateFormula = 1 + interestRate;

	double value;
	
	public CheckingAccount(String firstName, String middleName, String lastName, String ssn, double checkingAccountOpeningbalance, double savingsAccountOpeningBalance, double openingbalance) {
		super(firstName, middleName, lastName, ssn, checkingAccountOpeningbalance, savingsAccountOpeningBalance);
			
	}
	
	public double getBalance() {
		return this.checkingBalance;
	}
	
	
	public double getCheckingInterestRate() {
		return this.interestRate;
	}
	
	public void setInterestRate(double interestRate, int years) {
		this.interestRate = interestRate;
		//checkingBalanceThreeYears = checkingBalance * Math.pow((interestRate + 1), years);
		
	}
	
	public boolean withdraw(double amount) {
		if (checkingBalance <= 0 || amount > checkingBalance) {
			System.out.println("Unable to make withdrawal. Not enough funds.");
			return false;
			
		}
		else {
			this.checkingBalance =  checkingBalance - amount;
			System.out.println("Withdrawing: " + amount + "." + "Your balance is now: " + checkingBalance);
			
		}
		return true;
		
		
	}
	
	public boolean deposit(double amount) {
		if (amount <= 0) {
			System.out.println("You have to deposit a positive amount.");
			return false;
		} 
		else {
			this.checkingBalance = checkingBalance +  amount;
			System.out.println("Depositing: " + amount + "." + "Your balance is now: " + checkingBalance);
			
			
		}
			return true;
	}
	
	
	
	public double futureValue(int years) {
		//Formula: FV = PV(1 + interestRate) ^ years;
		//double FV = balance * Math.pow(1.01, 3);
		
		checkingBalanceThreeYears = checkingBalance * Math.pow((interestRate + 1), years);

		return this.checkingBalanceThreeYears;

		
	}
	
	public String toString() {
		return (
					"Checking Account Balance: " + checkingBalance + 
				   "\nChecking Account Interest Rate: " + this.interestRate +
					"\nChecking Account Balance in 3 Years: " + futureValue(3)
				   );
	}
}

	
	
	
