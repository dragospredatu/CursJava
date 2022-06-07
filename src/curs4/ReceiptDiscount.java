package curs4;

import java.util.Scanner;

public class ReceiptDiscount {
	
	int receiptAmount;
	
	public void inputReceiptAmount() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the receipt amount: ");
		receiptAmount = scan.nextInt();
		scan.close();
		
	}
	
	public void calculateDiscount() {
		
		double calculatedAmountAfterDiscount = (receiptAmount >= 100) ? receiptAmount * 0.9 : receiptAmount * 0.95;
		System.out.println("The amount you have to pay after discount is: " + calculatedAmountAfterDiscount);
		
	}

}
