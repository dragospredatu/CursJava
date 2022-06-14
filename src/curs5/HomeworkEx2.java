package curs5;

import java.util.Scanner;

public class HomeworkEx2 {

	public static void main(String[] args) {
		
		System.out.println("Please enter a number: ");
		Scanner scan = new Scanner(System.in);
		String number = scan.next();
		scan.close();
		
		int i = number.length();
		String reversedNumber = "";
		
		while(i > 0) {	
			reversedNumber = reversedNumber + number.charAt(i-1);
			i--;
		}
		
		System.out.println(reversedNumber);

	}

}
