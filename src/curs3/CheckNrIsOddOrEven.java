package curs3;

import java.util.Scanner;

public class CheckNrIsOddOrEven {
	
	int number;
	
	//o metoda care citeste numarul de la tastatura
	//o metoda care verifica daca numarul este par sau impar
	
	public void askTheUserForANumber() {
		
		System.out.println("Please enter a number: ");
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
	}
	
	public void checkNumber() {
		
		//% --> modulus
		if(number % 2 == 0) {
			System.out.println("Number is even!");
		}else {
			System.out.println("Number is odd!");
		}
	}
}
