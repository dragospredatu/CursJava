package curs6;

public class HomeworkEx1LoginExecution {

	public static void main(String[] args) {

		HomeworkEx1Login loginExec = new HomeworkEx1Login();
		boolean credentialsValid;
		int maxRetry = 3;
		
		do {
			credentialsValid = loginExec.validateCredentials(loginExec.inputUsername(), loginExec.inputPassword());
			if (credentialsValid) {
				System.out.println("Login Sucessful");
				break;
			} else {
				System.out.println("Login Error");
				maxRetry--;
			}
			if (maxRetry == 0) {
				System.out.println("Maximum attempts reached. User blocked");
			}
		} while (!credentialsValid && maxRetry > 0);

	}

}
