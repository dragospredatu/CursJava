package curs6;

import java.util.Scanner;

public class PasswordValidator {
	
	/*
	 * Facem un program care valideaza o parola pe baza unor reguli:
	 * 1. parola trebuie sa fie de minim 10 caractere
	 * 2. parola trebuie sa contina upper case
	 * 3. parola nu trebuie sa fie la fel ca username-ul
	 * 
	 * Intrebam utilizatorul un username si o parola
	 * Il informam care sunt regulile parolei
	 * 
	 * Daca parola e valida atunci printam "Parola valida"
	 * Daca nu, il informam care reguli nu au fost respectate si il punem sa introduca din nou parola
	 *  
	 */
	
	String username;
	Scanner scan = new Scanner(System.in);
	boolean valid;
	
	public void getUsername() {
		System.out.println("Introdu username: ");
		username = scan.nextLine();		
	}
	
	public String getPassword() {
		System.out.println("Introdu parola: ");
		String password = scan.nextLine();
		return password;
	}
	
	public void printPasswordRules() {
		System.out.println("Reguli:");
		System.out.println("1. parola trebuie sa fie de minim 10 caractere");
		System.out.println("2. parola trebuie sa contina upper case");
		System.out.println("3. parola nu trebuie sa fie la fel ca username-ul");
	}
	
	public void checkPasswordRules(String pass) {
		
		valid = true;
		
		if(pass.length() < 10) {
			valid = false;
			System.out.println("Parola trebuie sa fie de minim 10 caractere");
		}
		if(pass.equals(pass.toLowerCase())) {
			valid = false;
			System.out.println("Parola trebuie sa contina upper case");
		}
		if(pass.equals(username)) {
			valid = false;
			System.out.println("Parola nu trebuie sa fie la fel ca username-ul");
		}
	}

	public static void main(String[] args) {

		PasswordValidator validator = new PasswordValidator();
		validator.printPasswordRules();
		validator.getUsername();
		
		do {
			validator.checkPasswordRules(validator.getPassword());
		}
		while (!validator.valid);
				
		System.out.println("Parola valida!");

	}

}
