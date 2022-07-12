package curs13;

public class ExceptionExample {

	public static void main(String[] args) {

		
		String nume = null;
		int[] array = {1, 2, 3, 4};
		
		
		try {
			
			//System.out.println(nume.length());
			System.out.println("Salut "+ nume);
			
			
			try {
				int x = 3;
				System.out.println(array[x]);
				
				System.out.println(nume.length());

				
			}catch(IndexOutOfBoundsException e) {
				System.out.println("Index out of bounds!");
				
				
			}
			
			
		}catch(NullPointerException e) {
			
			System.out.println("Null pointer occured");
			
		}
		
		
		///  button.click()
		///  buton nu este disponibil
		//   wait --> butonul sa fie disponibil
		// 		wait for button to be clickablae  
		// 		button.click() --8 
		//   proprie metoda :
			/*
			 * public void click(){
			 * 		try{
			 * 		
			 * 		wait for button to be clickablae
			 * 		button.click()
			 * 
			 * 		}catch(NoSuchElement..){
			 * }
			 * 		
			 * }
			 * 
			 *  Selenium 3 --> foloseste la wait (Timeunit)
			 *	Selenium 4 --> foloseste la wait (Duration)
			 * 
			 */
		
		//THread.sleep(10 sec)
		//explict wait(10 sec) --> face pooling la 500 ms 
		
		
	}

}
