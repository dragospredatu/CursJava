package curs13;

import java.io.IOException;
import java.util.Scanner;

public class TestVegetablesProperties {

	public static void main(String[] args) throws IOException{

		VegetablesProperties prop = new VegetablesProperties();
		prop.writeVegetablesPropertiesFile();
		
		System.out.println("Please enter the vegetable that you want to buy:");
		Scanner scan = new Scanner(System.in);
		String vegetable = scan.next();
		
		prop.readVegetablesPropertiesFile(vegetable);
		
	}

}
