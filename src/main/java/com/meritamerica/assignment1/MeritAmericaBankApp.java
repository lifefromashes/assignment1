package com.meritamerica.assignment1;

public class MeritAmericaBankApp {
	
	public static void main(String[] args) {
		
		System.out.println("Hello Merit Bank");
		
		SavingsAccount person2 = new SavingsAccount("George", "R", "Martin", "9631452378", 1000, 1000, 1000);
		System.out.println(person2);
		CheckingAccount person1 = new CheckingAccount("Jill", "W'", "Smith", "7896542587", 785, 1000, 500);
	   System.out.println(person1);
	   System.out.println("**************");
	   
	   System.out.println(person2.withdraw(-500));
//		person1.getCheckingAccountBalance();
//		
//		//System.out.println(person1.getFirstName());
//		
//		System.out.println(person1.getCheckingAccountBalance());
//		
    	System.out.println(person1.withdraw(100));
//		
//		System.out.println(person1.withdraw(100));
//	    System.out.println(person1.deposit(100));
//		
		
		
	}
	
}