package curs12;

public class InsufficientFundsException extends Exception{
	
	public InsufficientFundsException() {
		
		System.err.println("Insuficient funds for transaction");
		
	}

}
