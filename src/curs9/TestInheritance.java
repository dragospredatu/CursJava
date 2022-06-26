package curs9;

public class TestInheritance {

	public static void main(String[] args) {

		TesterAutomat tester = new TesterAutomat();
		
		tester.setProgrammingLanguage("Java"); //clasa TesterAutomat
		tester.setDepartment("QA"); //clasa Tester
		tester.setSeniority("Junior"); //clasa Tester
		tester.setEmail("matei@matei.com"); //clasa Angajat
		tester.setName("Matei"); //clasa Angajat
		
		System.out.println("Numele angajatului este " + tester.getName() + ", face parte din departamentul "
				+ tester.getDepartment() + ", este de nivel " + tester.getSeniority() + " si foloseste " 
				+ tester.getProgrammingLanguage() + " pentru a scrie teste");
		
	}

}
