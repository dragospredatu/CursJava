package curs5;

import java.util.Scanner;

public class HomeworkEx1 {

	public static void main(String[] args) {
		
		System.out.println("Please enter a text: ");
		Scanner scan = new Scanner(System.in);
		String text = scan.next();
		scan.close();
		boolean isPalindrome = true;
		
		for(int i=0; i<text.length()/2; i++) {
			
			if (text.charAt(i) != text.charAt(text.length()-i-1)) {
				isPalindrome = false;
			}
		}
		
		if(isPalindrome) {
			System.out.println("The text is a palindrome!");
		} else {
			System.out.println("The text is not a palindrome!");
		}
	}

}
