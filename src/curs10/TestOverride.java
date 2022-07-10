package curs10;

public class TestOverride {

	public static void main(String[] args) {

		Shape shape = new Shape();
		shape.draw();
		shape.printClass();
		System.out.println(shape.name);
		
		System.out.println("-----------------------------");
		
		Patrat patrat = new Patrat();
		patrat.draw();
		patrat.printClass();
		System.out.println(patrat.name);
		
		System.out.println("-----------------------------");

		Cerc cerc = new Cerc();
		cerc.draw();
		cerc.printClass();
		System.out.println(cerc.name);
		
	}

}
