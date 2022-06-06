package curs4;

public class BitwiseOperator {

	public static void main(String[] args) {
		
		/*
		 * && --> AND  --> short circuit
		 * 
		 * &  --> AND
		 * 
		 */
		
		int x = 0;
		
		if ((x != 0) && (1 / x > 5)) {
			
			System.out.println("True");
			
		} else {
			
			System.out.println("False");
			
		}

	}

}
