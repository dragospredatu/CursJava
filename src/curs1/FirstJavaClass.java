package curs1;

public class FirstJavaClass {

	//variabila
	
	String nume = "Johnny";
	
	int age = 23;
	
	public static void main(String[] args) {
		
		FirstJavaClass obiect = new FirstJavaClass();
		obiect.greetings();
	}
	
	//metoda
	public void greetings() {
		
		System.out.println("Hello " + nume);
	}

}
