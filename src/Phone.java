
public class Phone {
	private String areaCode;
	private String phoneNumber;
	
	public Phone(String code, String number) {
		this.areaCode = code;
		this.phoneNumber = number;
	}
	
	public String toString() {
		return this.areaCode + " " + this.phoneNumber;
	}
}
