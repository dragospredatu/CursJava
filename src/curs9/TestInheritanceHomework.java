package curs9;

public class TestInheritanceHomework {

	public static void main(String[] args) {
		
		Qualification teacher1 = new Qualification("Java", 3, "Afternoon");
		teacher1.verify(teacher1);
		Qualification teacher2 = new Qualification("Java", 4, "Afternoon");
		teacher2.verify(teacher2);

	}

}
