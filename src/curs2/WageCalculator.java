package curs2;

public class WageCalculator {
	
	int hoursWorked = 40;

	public static void main(String[] args) {
		
		Tester tester1 = new Tester("Ion", 20, 30);
		//tester1.setNume("Ion");
		
		Tester tester2 = new Tester("Maria", 10, 28);
		//tester2.setNume("Maria");
		
		Tester tester3 = new Tester("Oana", 12, 25);
				
		System.out.println(tester1.getNume().length());
		System.out.println(tester2.getNume().length());
		System.out.println(tester3.getNume().length());
		
		WageCalculator calc = new WageCalculator();
		
		System.out.println("Salariul lui "+ tester1.getNume() + " este " + 
		calc.calculateSalary(tester1.getRatePerHour()));
		
		System.out.println(tester1.getNume() + " are: " + tester1.getAge() + " ani!");
		System.out.println(tester2.getNume() + " are: " + tester2.getAge() + " ani!");
		System.out.println(tester3.getNume() + " are: " + tester3.getAge() + " ani!");

	}
	
	public int calculateSalary(int rateHourly) {
		
		return rateHourly * hoursWorked;
		
	}

}
