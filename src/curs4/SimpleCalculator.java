package curs4;

import java.util.Scanner;

public class SimpleCalculator {
	
	/**
	 * Facem un calculator simplu pentru operatiile de baza: + * - /
	 * Intrebam userul care este primul numar
	 * Intrabam userul care este operatia matematica
	 * Intrebam userul care este al doilea numar
	 * Printam rezultatul sub forma  Ex: 2 + 2 = 4
	 */
	
	//1 metoda pt a citi de la tastatura
	
	//2 metoda pentru calcul
	
	int num1;
	int num2;
	char operation;
	int result;
	
	public void askTheUser() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the first number: ");
		num1 = scan.nextInt();
		System.out.println("Please enter the operation: ");
		operation = scan.next().charAt(0);
		System.out.println("Please enter the second number: ");
		num2 = scan.nextInt();
		scan.close();
		
	}
	
	public void calculateValues() {
	
		if(operation == '+') { //pentru String nu folosim '==' .Pentru String folosim metoda equals
			result = num1 + num2;
			printResult();
		} else if (operation == '-') {
			result = num1 - num2;
			printResult();
		} else if (operation == '*' || operation == 'x') {
			result = num1 * num2;
			printResult();
		} else if (operation == '/' || operation == ':') {
			result = num1 / num2;
			printResult();
		} else {
			System.out.println("Wrong operation! Please insert only : '+' '-' '*' '/'");
		}
		
	}
	
	public void printResult() {
		
		System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
		
	}

}
