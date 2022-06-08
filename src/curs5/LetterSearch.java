package curs5;

import java.util.Scanner;

public class LetterSearch {

	/*
	 * Cerem un string de la tastatura
	 * Cautam in stringul respectiv daca contine litera 'a'
	 * Daca o gasim, printam litera A exista in text
	 * Daca nu o gasim, printam litera A nu exista in text
	 * si printam si de cate ori apare
	 */	
	
	public static void main(String[] args) {

		System.out.println("PLease enter a text: ");
		Scanner scan = new Scanner(System.in);
		String text = scan.next().toUpperCase();
		scan.close();
		char letter = 'A';
		//boolean letterFound = false;
		int counter = 0;
		
		for(int i=0; i<text.length(); i++) {
			
			if (text.charAt(i) == letter) {
				//letterFound = true;
				counter++;				
			}
		}
		
		if(counter > 0) {
			System.out.println("Litera A exista in text de " + counter + " ori");
		} else {
			System.out.println("Litera A nu exista in text");
		}
		
	}

}
