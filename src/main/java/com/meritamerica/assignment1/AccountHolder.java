package com.meritamerica.assignment1;


public class AccountHolder {

	  String firstName;
	  String middleName;
	  String lastName;
	  String ssn;
	  double checkingAccountOpeningBalance;
	  double savingsAccountOpeningBalance;
	  double checkingBalance;
	  double savingsBalance;
	  double balance;
	 double interestRate;
	 
	 public AccountHolder() {
		 
	 }
	
	 public AccountHolder(String firstName, String middleName, String lastName, String ssn, double checkingAccountOpeningBalance, double savingsAccountOpeningBalance) {
		
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.checkingBalance = checkingAccountOpeningBalance;
		this.savingsBalance = savingsAccountOpeningBalance;
	}
	 
	 
	 public String getFirstName() {
		 return firstName;
	 }
	 
	 public void setFirstname(String name) {
		 this.firstName = name;
		 
	 }
	 
	 public String getMiddleName() {
		 return middleName;
	 }
		
	 public void setMiddleName(String midName ) {
		 this.middleName = midName;
	 }
	 
	 public String getSSN() {
		 return ssn;
	 }
	 
	 public void setSSN(String SSN) {
		 this.ssn = SSN;
	 }
	 
	 public double getCheckingAccountBalance() {
		 return this.checkingBalance;
	 }
	 
	 public void setCheckingAccountBalance() {
		 this.checkingBalance = checkingAccountOpeningBalance;
		 
	 }
	 
	 public double getSavingsAccount() {
		 return this.savingsBalance;
	 }
	 
	 public void setSavingsAccountBalance() {
		 this.savingsBalance = savingsAccountOpeningBalance;
	 }
	 
//		public double futureValue(int years) {
//			//Formula: FV = PV(1 + interestRate) ^ years;
//			//double FV = balance * Math.pow(1.01, 3);
//			//will this work?
//			double value = balance * Math.pow(interestRate, years);
//			//return NumberFormat.getNumberInstance().getCurrency(value);
//			return value;
//
//			
//		}
	 
	 public String toString() {
		 return (
				 "Name: " + firstName + " " + middleName + " " + lastName + 
				 "\nSSN: " + ssn + 
				 "\nChecking Account Balance: " + checkingBalance +
				 "\nChecking Account Interest Rate: " + interestRate +
				 "\nChecking Account Balance in 3 years: " + 
				 "\nSavings Account Balance: " + savingsBalance +
				 "\nSavings Account Interest Rate: " + 
				 "\nSavings Account Balance in 3 years: " 
				 );
	 }
	

}
