package curs12;

public class Customer {
	
	private String name;
	private String address;
	private String email;
	
	public Customer(String inputName, String inputAddress, String inputEmail) {
		
		this.name = inputName;
		this.address = inputAddress;
		this.email = inputEmail;
		
	}

	public String getName() {
		return name;
	}

}
