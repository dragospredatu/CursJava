package curs7;

import java.util.Scanner;

public class SwitchExample3 {
	
	/*
	 * Facem un program in care cerem de la tastatura un an si o luna
	 * Si printam cate zile are luna respectiva
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introdu un an: ");
		int an = scan.nextInt();
		System.out.println("Te rog introdu o luna: ");
		int luna = scan.nextInt();
		
		int nrOfDays = 0;
		
		switch(luna) {
		
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			nrOfDays = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			nrOfDays = 30;
			break;
		case 2:
			if(((an % 4 == 0) && (an % 100 != 0)) || (an % 400 == 0)) {
				nrOfDays = 29;
			} else {
				nrOfDays = 28;
			}
			break;
		default:
			System.out.println("Te rog introdu o valoare valida");
		}
		
		System.out.println("Numarul de zile pentru aceasta luna este: " + nrOfDays);
	}

}
