package curs13;

import java.io.IOException;

public class TestPropertiesFile {

	public static void main(String[] args) throws IOException {

		PropertiesFileProcessor propFile = new PropertiesFileProcessor();
		
		propFile.writePropertiesFile();
		propFile.readPropertiesFile("user");
		propFile.readPropertiesFile("email");
		propFile.readPropertiesFile("country");
		// String user = propFile.readPropertiesFile("user");
		// String url = propFile.readPropertiesFile("urlprod");
		// driver.get(url)
		System.out.println("-------------------------------");
		propFile.updatePropertiesFile("country", "UK");
		propFile.readPropertiesFile("country");
		System.out.println("-------------------------------");
		propFile.deleteFromPropertiesFile("email");
	}

}
