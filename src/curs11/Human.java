package curs11;

public class Human extends Primate implements BasicNeeds{

	@Override
	public String eat() {
		
		return "Omnivore";
	}

	@Override
	public void sleep() {
		
		System.out.println("I need to sleep!");
	}

	@Override
	public void drink() {

		System.out.println("I need to drink!");
	}
	
	public void speak() {
		
		System.out.println("I can speak!");		
	}

}
