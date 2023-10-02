import java.util.Date;

public class Payment {
	private String id;
	static private int idCount = 0;
	private Date paid;
	private double total;
	private String details;
	private Account account;
	
	public Payment(Account account,String details, double total) {
		this.id = Integer.toString(idCount++);
		this.account = account;
		this.details = details;
		this.total = total;
		this.paid = new Date();
		
		
		
	}
}
