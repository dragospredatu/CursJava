package curs10;

public class Bicicleta extends Vehicul{

	public Bicicleta(String brand, int nivelPoluare, int vitezaMedie) {
		
		this.setBrand(brand);
		this.setNivelPoluare(nivelPoluare);
		this.setVitezaMedie(vitezaMedie);
		
	}
	
	public String nume() {
		
		return "bicicleta";
	}
	
	public String motorizare() {
		
		return "umana";
	}
	
	public void detaliiVehicul() {
		
		System.out.println("Nivelul de poluare pentru bicicleta Pegas este 0 si viteza medie atinsa este de 30 km/h");
		
	}

}
