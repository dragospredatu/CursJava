package curs9;

public class TwoDimensionArray {

	public static void main(String[] args) {

		int[][] array = {{1, 2}, {3, 4}};
		
		System.out.println(array[0][1]);
		System.out.println(array[1][1]);
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------");
		
		for(int[] row : array) {
			for(int column : row) {
				System.out.print(column + " ");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------");
		
		String[][] textArray = new String[2][4];
		textArray[0][0] = "Rosu";
		textArray[0][1] = "Verde";
		textArray[0][2] = "Galben";
		textArray[0][3] = "Alb";
		
		textArray[1][0] = "Iasi";
		textArray[1][1] = "Alba";
		textArray[1][2] = "Cluj";
		textArray[1][3] = "Pitesti";
		
		//row
		System.out.println("ROW NR: " + textArray.length);
		//column
		System.out.println("COL NR: " + textArray[0].length);
		
		for(int i = 0; i < textArray.length; i++) {
			for(int j = 0; j < textArray[0].length; j++) {
				System.out.print(textArray[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
