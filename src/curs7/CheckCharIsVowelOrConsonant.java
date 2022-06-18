package curs7;

import java.util.Scanner;

public class CheckCharIsVowelOrConsonant {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu o litera: ");
		char ch = scan.next().charAt(0);
		
		switch(ch) {
		
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Is vowel");
			break;
		default:
			System.out.println("Is not vowel");
		}
		
	}

}
