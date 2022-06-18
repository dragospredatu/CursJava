package curs7;

import java.util.Scanner;

public class HomeworkSwitch {
	
	public static void main(String[] args) {
		
		int vechime;
		int totalVanzari;
		int lunaVanzari;
		int bonus;
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Introdu vechimea in firma: ");
		vechime = userInput.nextInt();
		System.out.println("Introdu valoarea vanzarilor efectuate: ");
		totalVanzari = userInput.nextInt();
		System.out.println("Introdu luna in care s-au efectuat vanzarile: ");
		lunaVanzari = userInput.nextInt();
		userInput.close();
		
		switch(vechime) {
		
		case 1: 
			bonus = 100;
			System.out.println("Bonusul tau este: " + bonus);
			break;
		case 2:
			bonus = 200;
			System.out.println("Bonusul tau este: " + bonus);
			break;
		case 3:
			if(totalVanzari <= 5000) {
				bonus = 600;
				System.out.println("Bonusul tau este: " + bonus);
			} else if(totalVanzari <= 10000) {
				switch(lunaVanzari) {
				
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
				case 6:
					bonus = 800;
					System.out.println("Bonusul tau este: " + bonus);
					break;
				case 7:
				case 8:
				case 9:
				case 10:
				case 11:
					bonus = 1000;
					System.out.println("Bonusul tau este: " + bonus);
					break;
				case 12:
					bonus = 900;
					System.out.println("Bonusul tau este: " + bonus);
					System.out.println("In decembrie se vand singure!");
					break;
				default:
					System.out.println("Luna in care s-au efectuat vanzarile nu este corecta");
				}
			} else {
				bonus = 1200;
				System.out.println("Bonusul tau este: " + bonus);
			}
			break;
		default: 
			System.out.println("Nu se poate calcula bonusul!");
		}
	}	

}
