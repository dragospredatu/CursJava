package curs3;

import java.util.Scanner;

public class GreatestOfThreeNumbers {

	int number1;
	int number2;
	int number3;
	
	//o metoda care citeste 3 numere de la tastatura
	//o metoda care compara cele 3 numere
	
	public void askTheUserForThreeNumbers() {
		
		System.out.println("Please enter number1: ");
		Scanner scan = new Scanner(System.in);
		number1 = scan.nextInt();
		System.out.println("Please enter number2: ");
		number2 = scan.nextInt();
		System.out.println("Please enter number3: ");
		number3 = scan.nextInt();
		scan.close();
	}
	
	public void compareTheNumbers() {
		
		// AND --> &&
		// OR --> ||
		if(number1 > number2 && number1 > number3) {
			
			System.out.println("The first number is the greatest");
			
		}else if (number2 > number1 && number2 > number3) {
			
			System.out.println("The second number is the greatest");
			
		}else if (number3 > number1 && number3 > number2){
			
			System.out.println("The third number is the greatest");
			
		}else {
			
			System.out.println("Some numbers are equal");
		}
	}
	
}
