package curs10;

public class TestHomework {

	public static void main(String[] args) {

		Vehicul bicicleta = new Bicicleta("Pegas", 0, 30);
		Vehicul masina = new Masina("VW", 6, 80);
		
		TestHomework obj = new TestHomework();
		
		obj.verificaMotorizarea(bicicleta);
		bicicleta.detaliiVehicul();
		System.out.println("---------------");
		obj.verificaMotorizarea(masina);
		masina.detaliiVehicul();
		
	}
	
	public void verificaMotorizarea(Vehicul vehicul) {
		
		System.out.println(vehicul.nume());
		System.out.println(vehicul.motorizare());
		
	}

}
