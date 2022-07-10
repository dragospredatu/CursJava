package curs10;

public class TestAnimal {

	public static void main(String[] args) {
     
		/*
		Animal animal = new Animal();
		animal.makeSound();
		
		System.out.println("-------------------");
		
		Lion leu = new Lion();
		leu.makeSound();
		leu.eatMeat();
		
		System.out.println("-------------------");
		
		Deer bambi = new Deer();
		bambi.makeSound();
		bambi.eatGrass();
		*/
		
		Animal leu = new Lion();
		leu.makeSound();
		((Lion)leu).eatMeat();
		//leu.eatMeat();
		leu.metodaAnimal();
		feedAnimal(leu);
		
		leu = new Deer();
		leu.makeSound();
		((Deer)leu).eatGrass();
		feedAnimal(leu);

	}
	
	public static void feedAnimal(Animal obiect) {
		
		if(obiect instanceof Lion) {
			System.out.println("you are getting burgers");
		} else if(obiect instanceof Deer) {
			System.out.println("you are getting salad");
		}
	}

}
