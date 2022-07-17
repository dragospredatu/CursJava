package curs10;

public class Masina extends Vehicul{
	
	public Masina(String brand, int nivelPoluare, int vitezaMedie) {
		
		this.setBrand(brand);
		this.setNivelPoluare(nivelPoluare);
		this.setVitezaMedie(vitezaMedie);
	
	}
	
	public String nume() {
		
		return "masina";
	}
	
	public String motorizare() {
		
		return "diesel";
	}
	
	public void detaliiVehicul() {
		
		System.out.println("Nivelul de poluare pentru masina VW este 5 si viteza medie atinsa este de 70 km/h");
		
	}
}