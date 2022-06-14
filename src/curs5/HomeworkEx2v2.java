package curs5;

import java.util.Scanner;

public class HomeworkEx2v2 {

	public static void main(String[] args) {
		
		System.out.println("Please enter a number: ");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		scan.close();
		
		String s = String.valueOf(number);
		int i = s.length();
		String reversedNumber = "";
		
		while(i > 0) {	
			reversedNumber = reversedNumber + s.charAt(i-1);
			i--;
		}
		
		System.out.println(reversedNumber);

	}

}
