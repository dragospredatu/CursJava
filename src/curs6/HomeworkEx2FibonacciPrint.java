package curs6;

import java.util.Scanner;

public class HomeworkEx2FibonacciPrint {

	public static void main(String[] args) {

		HomeworkEx2Fibonacci fibonacci = new HomeworkEx2Fibonacci();
		System.out.println("Enter how many numbers to display: ");
		Scanner scan = new Scanner(System.in);
		fibonacci.totalNumbers = scan.nextInt();
		scan.close();
		System.out.println("--------------- FOR ---------------");
		fibonacci.forFibonacci();
		System.out.println();
		System.out.println("--------------- FOR NO ARRAY ---------------");
		fibonacci.forFibonacciNoArray();
		System.out.println();
		System.out.println("--------------- WHILE ---------------");
		fibonacci.whileFibonacci();
		System.out.println();
		System.out.println("--------------- WHILE NO ARRAY --------------");
		fibonacci.whileFibonacciNoArray();
		
	}

}
