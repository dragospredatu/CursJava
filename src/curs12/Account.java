package curs12;

public class Account {
	
	private int accountNumber;
	public double balance;
	public Customer accountOwner;
	
	public Account(int inputAccountNumber, double inputBalance, Customer inputAccountOwner) {
		
		this.setAccountNumber(inputAccountNumber);
		this.balance = inputBalance;
		this.accountOwner = inputAccountOwner;
	}
	
	public void withdraw(int amountToWithdraw) throws InsufficientFundsException {
		
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

}
