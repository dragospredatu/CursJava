package curs4;

import java.util.Scanner;

public class TernaryOperatorEx3Homework {
	
	public static void main(String[] args) {
		
		int points;
		String result, displayMessage;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of points: ");
		points = scan.nextInt();
		scan.close();
				
		result = (points >= 90) ? "FB": (points >= 80) ? "B" : "S";
		displayMessage = result.equals("FB") ? "Ai primit : FoarteBine" : 
						 result.equals("B") ? "Ai primit : Bine" : "Ai primit : Suficient";
		System.out.println(displayMessage);

	}

}
