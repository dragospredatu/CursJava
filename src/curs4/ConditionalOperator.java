package curs4;

import java.util.Scanner;

public class ConditionalOperator {

	/*
	 * Program care citeste 2 numere de la tastatura si verifica urmatoarele
	 * verifica daca fiecare numar este pozitiv
	 * verifica daca ambele numere sunt pozitive
	 * verifica care dintre cele 2 numere este mai mic
	 * 
	 */
	
	
	public static void main(String[] args) {
			
		int num1,num2;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the first number: ");
		num1 = scan.nextInt();
		System.out.println("Please enter the second number: ");
		num2 = scan.nextInt();
		scan.close();
		
		// verificam daca num1 este pozitiv
		// verificam daca num2 este pozitiv
		// verificam daca num1 si num2 sunt pozitive
		// verificam care dintre cele 2 numere este mai mic
		
		if(num1 > 0) {
			System.out.println("num1 is positive");
		} else {
			System.out.println("num1 is negative");
		}
		
		// result = (num1 > 0) ?  
		
		if(num2 > 0) {
			System.out.println("num2 is positive");
		} else {
			System.out.println("num2 is negative");
		}
		
		if(num1 > 0 && num2 > 0) {
			System.out.println("both num1 and num2 are positive");
		} else {
			System.out.println("at least one number is negative");
		}
		
		if(num1 > num2) {
			System.out.println("num2 is the smallest");
		} else if (num1 == num2) {
			System.out.println("numbers are equal");
		} else {
			System.out.println("num1 is the smallest");
		}
		
		System.out.println("---------------TERNARY--------------");
		
		String result;
		result = (num1 > 0) ? "num1 is positive" : "num1 is negative";
		System.out.println(result);
		result = (num2 > 0) ? "num2 is positive" : "num2 is negative";
		System.out.println(result);
		result = (num1 > 0 && num2 > 0) ? "both num1 and num2 are positive" : "at least one number is negative";
		System.out.println(result);
		result = (num1 == num2) ? "numbers are equal": (num1 < num2) ? "num1 is the smallest" : "num2 is the smallest";
		System.out.println(result);
			
	}

}
