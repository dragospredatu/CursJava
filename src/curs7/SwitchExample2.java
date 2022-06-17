package curs7;

import java.util.Scanner;

public class SwitchExample2 {

	/*
	 * Facem un program care verifica daca un student are dreptul la bursa de studii
	 * Conditiile sunt:
	 * Sa fie anul 3
	 * Sa aiba un punctaj de 80 pentru bursa 1
	 * Sa aiba un punctaj de 50 pentru bursa 2
	 * 
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu in ce an esti: ");
		int an = scan.nextInt();

		
		switch(an) {
		
		case 1:
		case 2:
			System.out.println("Nu esti eligibil pentru bursa");
			break;
		case 3:
			System.out.println("Introdu punctajul: ");
			int punctaj = scan.nextInt();
			switch(punctaj) {
			case 50:
				System.out.println("Esti eligibil pentru bursa 2");
				break;
			case 80:
				System.out.println("Esti eligibil pentru bursa 1");
				break;
			default:
				System.out.println("Te rog introdu o valoare valida");
			}
			break;
		default:
			System.out.println("Te rog introdu un an valid");
		}

	}

}
