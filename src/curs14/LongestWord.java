package curs14;

import java.io.File;
import java.util.Scanner;

public class LongestWord {
	
	public static void main(String[] args) {
		
		LongestWord word = new LongestWord();
		word.findLongestWord();
		
	}
	
	public void findLongestWord() {
		
		File objFile = new File("file.txt");
		String longestWord = "";
		String currentWord;
		
		try {
			
			Scanner scan = new Scanner(objFile);
			
			while(scan.hasNext()) {
				currentWord = scan.next();
				if (currentWord.length() > longestWord.length()) {
					longestWord = currentWord;
				}
			}
			scan.close();
			System.out.println("The longest word in the file is: " + longestWord);
		
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}
