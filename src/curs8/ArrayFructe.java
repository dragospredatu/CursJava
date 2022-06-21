package curs8;

public class ArrayFructe {

	public static void main(String[] args) {

		Fructe objMar = new Fructe("Mar", 150);
		
		Fructe[] fruct = new Fructe[4];
		fruct[0] = new Fructe("Banana", 250);
		fruct[0].printDetails();
		fruct[1] = objMar;
		
		objMar.printDetails();
		fruct[1].printDetails();
		
		objMar = new Fructe("Ionatan", 150);
		
		System.out.println("--------------------");
		
		objMar.printDetails();
		fruct[1].printDetails();
		fruct[2] = new Fructe("Para", 200);
		fruct[3] = new Fructe("Cireasa", 80);
		
		System.out.println("--------------------");
		
		for(Fructe element : fruct) {
			element.printDetails();
		}
	}
}
