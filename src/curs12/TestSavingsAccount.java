package curs12;

import java.util.Scanner;

public class TestSavingsAccount {

	public static void main(String[] args) {

		Customer customer = new Customer("Ion", "Craiova, Dolj, Romania", "ion@gmail.com");
		SavingsAccount savingsAccount = new SavingsAccount(123, 150, customer);
		System.out.println("Hi " + customer.getName());
		System.out.println("Please enter the amount to withdraw:");
		Scanner scan = new Scanner(System.in);
		int withdrawalAmount = scan.nextInt();
		
		try {
			savingsAccount.withdraw(withdrawalAmount);
			System.out.println("Please pick your money!");
			System.out.println("Your new balance is " + savingsAccount.balance);
			System.out.println("Thank you for using our ATM!");
			
		} catch (InsufficientFundsException e) {
			System.out.println("The amount you entered is greater than the available balance: " + savingsAccount.balance);
			System.out.println("Thank you for using our ATM!");
			e.printStackTrace();
		}
		
	}

}
