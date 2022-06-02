package curs2;

public class Tester {

	//variabile
	String nume;
	int ratePerHour;
	int age;
	
	//constructor default
	//public Tester() {}
	
	public Tester(String nume, int ratePerHour, int age) {
		
		setNume(nume);
		setRatePerHour(ratePerHour);
		setAge(age);
	}
	
	//metode getter & setter
	public String getNume() {
		return nume;
	}
	
	private void setNume(String nume) {
		this.nume = nume;
	}
	
	public int getRatePerHour() {
		return ratePerHour;
	}
	
	private void setRatePerHour(int ratePerHour) {
		this.ratePerHour = ratePerHour;
	}
	
	public int getAge() {
		return age;
	}

	private void setAge(int age) {
		this.age = age;
	}
}
