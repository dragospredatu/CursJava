package curs11;

public class TestHomework {

	public static void main(String[] args) {

		Primate human = new Human();
		Primate monkey = new Monkey();
		
		System.out.println("Primate dataType instance of Human:");
		System.out.println("-----------------------------------");
		human.walk();
		human.run();
		System.out.println(((Human) human).eat());
		human.speak();
		((Human) human).sleep();
		
		System.out.println();
		System.out.println("Primate dataType instance of Monkey:");
		System.out.println("-----------------------------------");
		monkey.walk();
		monkey.run();
		System.out.println(((Monkey) monkey).eat());
		monkey.speak();
		((Monkey) monkey).sleep();
		
	}

}
