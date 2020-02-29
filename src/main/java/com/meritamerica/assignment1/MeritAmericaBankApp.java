package com.meritamerica.assignment1;

public class MeritAmericaBankApp {

	public static void main(String[] args) {
		
		AccountHolder person1 = new AccountHolder("Jim", "M", "Halpert", " 5812578965", 100, 1000);
		System.out.println(person1.toString());
		person1.getCheckingAccount().deposit(500);
		person1.getSavingsAccount().withdraw(800);
		System.out.println(person1.getCheckingAccount().toString());
		System.out.println(person1.getSavingsAccount().toString());
		
		System.out.println("*****************");
		
		AccountHolder person2 = new AccountHolder("Michael", "Gary", "Scott", "9842587512", 200, 500);
		person2.getSavingsAccount().deposit(-500);
		person2.getSavingsAccount().withdraw(600);
		System.out.println(person2.toString());
		
	}

}