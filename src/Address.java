
// class used for address of users and orders.
public class Address {
	private String street;
	private String city;
	private String state;
	private String zipcode;
	private String country;
	
	// Default constructor to create empty address
	public Address() {
		street = ""; 
		city = ""; 
		state = ""; 
		zipcode = ""; 
		country = "";
	}
	
	// Constructor for input values to each part of the address
	public Address(String s1, String s2, String s3, String s4, String s5) {
		street = s1;
		city = s2;
		state = s3; 
		zipcode = s4;
		country = s5;
	}
	
	// concatenate the address together
	public String toString() {
		if(street == "")
			return "Address not found.";
		return street + ", " + city + ", " + state + ", " + zipcode + ", " + country;
	}
}
