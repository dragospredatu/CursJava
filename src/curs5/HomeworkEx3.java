package curs5;

import java.util.Scanner;

public class HomeworkEx3 {

	public static void main(String[] args) {

		System.out.println("Enter the first number: ");
		Scanner scan = new Scanner(System.in);
		int number1 = scan.nextInt();
		System.out.println("Enter the second number: ");
		int number2 = scan.nextInt();
		scan.close();
		
		System.out.println("--------------FOR-----------------");
			
		if(number1 < number2) {
			for(int i = number1 + 1; i < number2; i++) {
				if(i % 2 == 0) {
					System.out.println(i);
				}
			}
		} else if(number2 < number1) {
			for(int i = number2 + 1; i < number1; i++) {
				if(i % 2 == 0) {
					System.out.println(i);
				}
			}
		} else {
			System.out.println("The numbers are equal");
		}
		
		System.out.println("--------------WHILE-----------------");
		
		if(number1 < number2) {
			int x = number1 + 1;
			while(x < number2) {
				if(x % 2 == 0) {
					System.out.println(x);
				}
				x++;
			}
		} else if(number2 < number1) {
			int x = number2 + 1;
			while(x < number1) {
				if(x % 2 == 0) {
					System.out.println(x);
				}
				x++;
			}
		} else {
			System.out.println("The numbers are equal");
		}	
	}
}
