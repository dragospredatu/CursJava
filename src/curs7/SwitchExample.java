package curs7;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {

		/*
		 * Intrebam userul ce calificativ a primit
		 * In functie de calificativ printam un mesaj
		 * 
		 */
		
		System.out.println("Te rog introdu o nota: ");
		Scanner scan = new Scanner(System.in);
		String nota = scan.next();
		
		switch(nota.toUpperCase()) {
		
		case "A":
			System.out.println("Felicitari!");
			break;
		case "B":
			System.out.println("Destul de bine!");
			break;
		case "C":
			System.out.println("Suficient!");
			break;
		case "D":
			System.out.println("Insuficient!");
			break;
		default:
			System.out.println("Nota invalida!");
			break;
		}
		
	}

}
