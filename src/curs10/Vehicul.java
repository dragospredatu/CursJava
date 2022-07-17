package curs10;

public class Vehicul {
	
	private String brand;
	private int nivelPoluare;
	private int vitezaMedie;
	
	public String nume() {
		
		return "vehicul";
	}
	
	public String motorizare() {
		
		return "motorizare";
	}
	
	public void detaliiVehicul() {
		
		System.out.println("Nivelul de poluare pentru vehicul este 3 si viteza medie atinsa este de 50 km/h");
		
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getNivelPoluare() {
		return nivelPoluare;
	}

	public void setNivelPoluare(int nivelPoluare) {
		this.nivelPoluare = nivelPoluare;
	}

	public int getVitezaMedie() {
		return vitezaMedie;
	}

	public void setVitezaMedie(int vitezaMedie) {
		this.vitezaMedie = vitezaMedie;
	}
	
}
