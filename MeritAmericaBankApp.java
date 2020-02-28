package com.meritamerica.assignment1;

public class MeritAmericaBankApp {

	public static void main(String[] args) {

		System.out.println("Hello Merit Bank");

		AccountHolder person1 = new AccountHolder("Jill", "W", "Smith", "45698745632", 100, 1000);
		System.out.println(person1.toString());
		
		person1.getCheckingAccount().deposit(500);
		person1.getSavingsAccount().withdraw(800);
		System.out.println(person1.getCheckingAccount().toString());
		System.out.println(person1.getSavingsAccount().toString());
		
		System.out.println("*****************");

		
		AccountHolder person2 = new AccountHolder("Mark", "Jack ", "Williams", " 9854123698", 200, 500);
		System.out.println(person2.toString());
		person2.getCheckingAccount().deposit(-500);
		person2.getSavingsAccount().withdraw(600);
		System.out.println(person2.getSavingsAccount().toString());


	}

}