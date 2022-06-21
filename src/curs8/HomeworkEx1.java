package curs8;

import java.util.Scanner;

public class HomeworkEx1 {
	
	public int sumOfNumbers() {
		
		int[] numbers = new int[10];
		int sum = 0;
		
		System.out.println("Introdu 10 numere: ");
		Scanner userInput = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			numbers[i] = userInput.nextInt();
			sum = sum + numbers[i];
		}
		
		return sum;
	}

	public static void main(String[] args) {
		
		HomeworkEx1 obj = new HomeworkEx1();
		System.out.println("Suma numerelor din array este: " + obj.sumOfNumbers());
	}
}
