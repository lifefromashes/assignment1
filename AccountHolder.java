package com.meritamerica.assignment1;


public class AccountHolder {

	   String firstName= "";
	   String middleName = "";
	   String lastName = "";
	    String ssn = "";
	  
	   double checkingBalance = 0;
	   double savingsBalance = 0;
	   double balance = 0;
	  double interestRate = 0;
	  CheckingAccount checking;
	  SavingsAccount savings ;
	 
	 public AccountHolder() { //default constructor
		 
	 }
	
	 public AccountHolder(String firstName, String middleName, String lastName, String ssn, double checkingAccountOpeningBalance, double savingsAccountOpeningBalance) {
		
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.checking = new CheckingAccount(checkingAccountOpeningBalance);
		this.savings = new SavingsAccount(savingsAccountOpeningBalance);

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
	 
	 public String  getLastName() {
		 return this.lastName;
	 }
	 
	 public void setLastName(String lstName) {
		 this.lastName = lstName;
	 }
	 
	 public String getSSN() {
		 return ssn;
	 }
	 
	 public void setSSN(String SSN) {
		 this.ssn = SSN;
	 }
	 
	 public  CheckingAccount getCheckingAccount() {
		 return this.checking;
	 }
	 
	 public SavingsAccount getSavingsAccount() {
		 return this.savings;
	 }
	 
	 public String toString() {
		 return (
				 "Name: " + firstName + " " + middleName + " " + lastName + 
				 "\nSSN: " + ssn + 
				 "\n" + checking.toString() + //new changes
				 "\n" + savings.toString()  //new changes
				 );
//				 "\nChecking Account Balance: " + checking.getBalance() +
//				 "\nChecking Account Interest Rate: " + checking.interestRate +
//				 "\nChecking Account Balance in 3 years: " + checking.futureValue(3) +
//				 "\nSavings Account Balance: " + savings.getBalance() +
//				 "\nSavings Account Interest Rate: " + savings.savingsInterestRate +
//				 "\nSavings Account Balance in 3 years: " + savings.savingsFutureValue(3)
//				 );
	 }
	

}
