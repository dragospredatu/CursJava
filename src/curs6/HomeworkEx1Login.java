package curs6;

import java.util.Scanner;

public class HomeworkEx1Login {
	
	String username = "TestUser";
	int password = 1234;

	public String inputUsername() {
		
		System.out.println("Enter a user: ");
		Scanner scanUser = new Scanner(System.in);
		String userInput = scanUser.nextLine();
		return userInput;
	}
	
	public int inputPassword() {
		
		System.out.println("Enter a password: ");
		Scanner scanPassword = new Scanner(System.in);
		int passwordInput = scanPassword.nextInt();
		return passwordInput;
	}
	
	public boolean validateCredentials(String user, int pass) {
		
		boolean validation = true;
		if(!(user.equals(username) && pass == password)) {
			validation = false;
		} 		
		return validation;
	}
	
}
