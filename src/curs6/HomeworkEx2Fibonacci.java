package curs6;

public class HomeworkEx2Fibonacci {
	
	int totalNumbers;
	
	public void forFibonacci() {

		int[] currentNumber = new int[totalNumbers];
		
		System.out.print("Seria Fibonacci pentru " + totalNumbers + " numere: ");
		
		for(int i = 0; i < totalNumbers; i++) {
			
			if(i == 0 || i == 1) {
				currentNumber[i] = i;
			} else {
				currentNumber[i] = currentNumber[i-2] + currentNumber[i-1]; 
			}
			System.out.print(currentNumber[i] + " ");
		}
	}
	
	public void forFibonacciNoArray() {

		int number1 = 0;
		int number2 = 0;
		int currentFibonacciNumber;
		
		System.out.print("Seria Fibonacci pentru " + totalNumbers + " numere: ");
		
		for(int i = 0; i < totalNumbers; i++) {
			
			if(i == 0){
				number1 = i;
				System.out.print(number1 + " ");
			} else if(i == 1){
				number2 = i;
				System.out.print(number2 + " ");
			} else {
				currentFibonacciNumber = number1 + number2;
				System.out.print(currentFibonacciNumber + " ");
				number1 = number2;
				number2 = currentFibonacciNumber;
			}
			
		}
	}
	
	public void whileFibonacci() {

		int[] currentNumber = new int[totalNumbers];
		int i = 0;
		
		System.out.print("Seria Fibonacci pentru " + totalNumbers + " numere: ");
		
		while (i < totalNumbers) {
			if(i == 0 || i == 1) {
				currentNumber[i] = i;
			} else {
				currentNumber[i] = currentNumber[i-2] + currentNumber[i-1]; 
			}
			System.out.print(currentNumber[i] + " ");
			i++;
		}
	}
	
	public void whileFibonacciNoArray() {

		int number1 = 0;
		int number2 = 0;
		int currentFibonacciNumber;
		int i = 0;
		
		System.out.print("Seria Fibonacci pentru " + totalNumbers + " numere: ");
		
		while (i < totalNumbers) {
			if(i == 0){
				number1 = i;
				System.out.print(number1 + " ");
			} else if(i == 1){
				number2 = i;
				System.out.print(number2 + " ");
			} else {
				currentFibonacciNumber = number1 + number2;
				System.out.print(currentFibonacciNumber + " ");
				number1 = number2;
				number2 = currentFibonacciNumber;
			}
			i++;
		}
	}

}
