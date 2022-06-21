package curs8;

public class ArrayExample {

	public static void main(String[] args) {

		String[] textArray = new String[5];
		String textArray2[] = new String[4];
		//String[] textArray = {null, null, null, null, null, null}
		textArray[0] = "This ";
		//System.out.println(textArray[0]);
		textArray[1] = "is ";
		textArray[2] = "an ";
		textArray[3] = "array ";
		textArray[4] = "!";
		
		for(String element : textArray) {
			System.out.print(element);
		}
	}

}

