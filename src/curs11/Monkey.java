package curs11;

public class Monkey extends Primate implements BasicNeeds{
	
	@Override
	public String eat() {
		
		return "Mostly erbivore";
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
		
		System.out.println("cannot speak!");		
	}

}
