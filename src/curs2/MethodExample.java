package curs2;

public class MethodExample {
	
	/*
	 * numar de camere dinamic
	 * calcul al mp al fiecarei camere
	 * numar total de mp 
	 */

	public static void main(String[] args) {

		//room1
		int length = 4;
		int width = 2;
		int totalMP = length * width;
		System.out.println("Aria camerei 1 este: " + totalMP);
		
		//room2
		int length2 = 3;
		int width2 = 4;
		int totalMP2 = length2 * width2;
		System.out.println("Aria camerei 2 este: " + totalMP2);
		
		MethodExample room = new MethodExample();
		System.out.println(room.calculateArea(4, 2));
		MethodExample room2 = new MethodExample();
		System.out.println(room2.calculateArea(3, 3));
		
		System.out.println("-------------------------");
		MethodExample room3 = new MethodExample();
		System.out.println(room3.calculateArea(4, 4));
		//room3.calculateArea2(4, 4);
		
		int total = room.calculateArea(4, 2) + room2.calculateArea(3, 3) + room3.calculateArea(4, 4);
		System.out.println(total);
		
		System.out.println(calculateTotal(room.calculateArea(4, 2), room2.calculateArea(3, 3), room3.calculateArea(4, 4)));
	}
	
	public int calculateArea(int length, int width) {
	
		System.out.println("Aria camerei 2 este: " + length * width);
		return length * width;
	}
	
	/*
	 * public void calculateArea2(int length, int width) {
	 * System.out.println("Aria camerei 2 este: " + length * width); }
	 */
	
	public static int calculateTotal(int...rooms) { //varargs -> argumente variabile --> int...rooms -->> int[] rooms
		
		int result = 0;
		
		for(int room : rooms) {
			result = result + room;
		}
		
		return result;
	}
}
