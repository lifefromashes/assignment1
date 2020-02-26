package com.meritamerica.assignment1;

import java.util.Scanner;

public class AccountHolder {
	String firstName;
	String middleName;
	String lastName;
	String ssn;
	double checkingAccountOpeningBalance;
	double savingsAccountOpeningBalance;

	// Default Constructor
	public AccountHolder() {

	}

	// Constructor
	public AccountHolder(String firstName, String middleName, String lastName, String ssn,
			double checkingAccountOpeningBalance, double savingsAccountOpeningBalance) {

		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.checkingAccountOpeningBalance = checkingAccountOpeningBalance;
		this.savingsAccountOpeningBalance = savingsAccountOpeningBalance;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {

		Scanner input = new Scanner(System.in);
		System.out.print("What is your first name? ");
		String fName = input.nextLine();
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {

		Scanner input = new Scanner(System.in);
		System.out.print("What is your middle name? ");
		String mName = input.nextLine();
	}

	public String getLastName() {
		return lastName;
	}

	// This gets the last name.
	public void setLastName(String lastName) {
		Scanner input = new Scanner(System.in);
		System.out.print("What is your last name? ");
		String lName = input.nextLine();
	}

	public String getSsn() {
		return ssn;
	}

	public void setSNN(String sNN) {
			 Scanner input = new Scanner(System.in);
			 System.out.print("What is your social");
			 String sNumber = input.nextLine();
			 }

	 getCheckingAccount();

	SavingsAccount getSavingsAccount()
		 
		 
		 
		 
		 
			
	
}