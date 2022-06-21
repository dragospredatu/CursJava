package curs8;

public class HomeworkEx2 {

	public static void main(String[] args) {

		String[] myStringArray = {"Maria", "Bob", "Ion", "George", "Oana", "Bogdan", "Oana", "Ion"};
		String[] listOfDuplicates = new String[myStringArray.length/2];
		boolean nameAlreadyInDuplicatesArray = false;
		int index = 0;
		
		for(int i = 0; i < myStringArray.length; i++) {
			for(int j = i + 1; j < myStringArray.length; j++) {
				if(myStringArray[i].equals(myStringArray[j])) {
					nameAlreadyInDuplicatesArray = false;
					for(String name : listOfDuplicates) {
						if(myStringArray[i].equals(name)) {
							nameAlreadyInDuplicatesArray = true;
						}
					}
					if(!nameAlreadyInDuplicatesArray) {
						listOfDuplicates[index] = myStringArray[i];
						index++;
					}
				}
			}
		}
		
		for(int i = 0; i < listOfDuplicates.length; i++) {
			if(listOfDuplicates[i] != null) {
				System.out.println("Nume duplicat " + listOfDuplicates[i]);
			}
		}
		
	}

}
