package curs13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class VegetablesProperties {
	
	public void writeVegetablesPropertiesFile() throws IOException {
		
		try(OutputStream outPutStream = new FileOutputStream("vegetables.properties")) {
			
			Properties prop =  new Properties();
			prop.setProperty("rosie", "50");
			prop.setProperty("morcov", "58");
			prop.setProperty("castravete", "30");
			prop.setProperty("ceapa", "40");
			prop.setProperty("telina", "45");
			prop.store(outPutStream, "properties saved");
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}	
	}
	
	public void readVegetablesPropertiesFile(String key) throws FileNotFoundException, IOException {
		
		try(InputStream inputStream = new FileInputStream("vegetables.properties")) {
			
			Properties prop =  new Properties();
			prop.load(inputStream);
			
			String value = prop.getProperty(key);
			
			if (value != null) {
				System.out.println("Leguma aleasa de tine are " + value + " calorii");
			} else {
				System.out.println("Nu vindem aceasta leguma");
			}
			
		
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}	
	}

}
