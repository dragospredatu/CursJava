package curs3;

public class TestCar {

	public static void main(String[] args) {
		
		Car obiect = new Car("Toyota", "Hybrid");
		System.out.println(obiect.carDetails());
		Car obiect2 = new Car("Mazda", "Gasoline");
		Car.type = "Sedan";
		System.out.println(obiect2.carDetails());
		System.out.println(obiect.carDetails());

	}

}
