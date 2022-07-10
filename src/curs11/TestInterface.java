package curs11;

public class TestInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tester tester = new Tester();
		tester.setEmail("oana@oana.com");
		tester.setName("oana");
		tester.printNumeDepartament();
		
		System.out.println("Nume tester: " + tester.getName());
		System.out.println("Email tester: " + tester.getEmail());
		
		Developer dev = new Developer();
		dev.setEmail("ioana@ioana.com");
		dev.setName("ioana");
		dev.printNumeDepartament();
		
		System.out.println("Nume tester: " + dev.getName());
		System.out.println("Email tester: " + dev.getEmail());

	}

}
