package curs14;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class TextFileProcessor {

	//write to txt file	
	public void writeFile(String textToWrite) {

		try {
			
			FileWriter myFilewriter = new FileWriter("file.txt");
			myFilewriter.write(textToWrite);
			myFilewriter.close();
			System.out.println("Successfully wrote to file!");
			
		}catch(IOException e) {
			
			System.out.println("Cannot write to file");
			e.printStackTrace();
		}	
	}
	
	//read from txt file
	public void readFile() {
		
		File objFile = new File("file.txt");
		try {
			
			Scanner scan = new Scanner(objFile);
			while(scan.hasNext()) {
				String text = scan.nextLine();
				System.out.println("text file: " + text);
			}
			scan.close();
		
		}catch (Exception e){
			
			System.out.println("Cannot read file");
			e.printStackTrace();
		}
	}
	
	//append
	public void updateFile(String textToAppend) {
		
		try(FileWriter myFileWriter = new FileWriter("file.txt", true)) {
			
			myFileWriter.write(textToAppend);
		
		}catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	//delete line
	public void deleteLineFromFile(String textToBeReplaced, String textToReplace) throws IOException {
		
		String data = "";
		data = new String(Files.readAllBytes(Paths.get("file.txt")));
		
		try(FileWriter myWriter = new FileWriter("file.txt")){
			
			data = data.replaceAll(textToBeReplaced, textToReplace);
			myWriter.write(data);
			
		}catch (Exception e) {
			
			e.printStackTrace();
			
		}
	}
	
	public void deleteFile() {
		
		File file = new File("file.txt");
		file.delete();
		System.out.println("Delete file: " + file.getName());
		
	}

}
