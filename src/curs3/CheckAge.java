package curs3;

import java.util.Scanner;

public class CheckAge {
	
	int age;
	
	public void askUserToInsertAge() {
		
		System.out.println("Introduceti varsta: ");
		Scanner scan = new Scanner(System.in);
		age = scan.nextInt();
		scan.close();
	}
	
	public void checkAge() {
		
		if (age < 18) {
			System.out.println("Esti minor");
		} else if (age <= 65 ) {
			System.out.println("Esti adult");
		} else {
			System.out.println("Esti batran");
		}
		
	}

}
