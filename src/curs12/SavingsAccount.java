package curs12;

public class SavingsAccount extends Account{

	public SavingsAccount(int inputAccountNumber, double inputBalance, Customer inputAccountOwner) {
		
		super(inputAccountNumber, inputBalance, inputAccountOwner);
	}
	
	public void withdraw(int amountToWithdraw) throws InsufficientFundsException {
		
		if(amountToWithdraw > balance) { 
			throw new InsufficientFundsException();
		}else {
			balance -= amountToWithdraw;
		}
		
	}
	
	

}
