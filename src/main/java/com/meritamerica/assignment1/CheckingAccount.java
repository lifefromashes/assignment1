package com.meritamerica.assignment1;

public class CheckingAccount {
	
	double openingBalance = 0;
	
	public CheckingAccount(double openingbalance) {
		this.openingBalance =  openingBalance;
		
		
	}
	
	public double getBalance() {
		return openingBalance;
		
	}
	
}