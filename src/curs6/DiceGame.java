package curs6;

import java.util.Scanner;

public class DiceGame {
	
	/*
	 * Facem un joc de zaruricare are urmatoarele reguli:
	 * - daca userul da 2, 6, 12 > a pierdut jocul, ne oprim -> break
	 * - daca userul da 7, 11 > castiga jocul, ne oprim -> break
	 * - daca userul da 3, 10 > repeta aruncarea automat -> continue
	 * - daca userul da oricare dintre optiunile lipsa, il intrebam daca vrea sa mai dea inca odata
	 *   raspunsul va fi un boolean 
	 *   daca raspunsul este false, ne oprim
	 */

	public static void main(String[] args) {
		
		boolean condition = true;
		
		while(condition) {
			
			int dice1 = (int) (Math.random()*6 + 1);
			System.out.println("dice1 " + dice1);
			int dice2 = (int) (Math.random()*6 + 1);
			System.out.println("dice2 " + dice2);
			int total = dice1 + dice2;
			System.out.println("Ai dat: " + total);
			
			if(total == 2 || total == 6 || total == 12) {
				System.out.println("Imi pare rau! Ai dat: " + total + ". Ai pierdut jocul!");
				break;
			} else if(total == 7 || total == 11) {
				System.out.println("Felicitari! Ai dat: " + total + ". Ai castigat jocul!");
				break;
			} else if(total == 3 || total == 10) {
				System.out.println("Ai dat: " + total + ". Jocul continua!");
				continue;
			} else {
				System.out.println("Mai dai odata? ");
				Scanner scan = new Scanner(System.in);
				condition = scan.nextBoolean();
				//scan.close();
			}
		}
		
		System.out.println("Game over!");
		
	}

}
