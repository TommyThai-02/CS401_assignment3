import java.util.Date;

// Account class, with all attributes and methods related to the account class
//such as getters, setters, and constructors

public class Account {
	private String id;
	static private int idCount = 0;
	private Address billing_address;
	private boolean is_closed;
	private Date open;
	private Date closed;
	// shopping cart that belongs to the user/account
	private ShoppingCart cart;
	// Users can have no orders
	private Order[] orders;

	// account constructor
	public Account() {
		this.id = Integer.toString(idCount++);
		this.is_closed = false;
		this.open = new Date();
		this.cart = new ShoppingCart();
		this.orders = new Order[999];
	}
	
	// handle web user account, taking user login name as id
	public Account(String webID) {
		this.id = webID;
		this.is_closed = false;
		this.open = new Date();
		this.cart = new ShoppingCart();
		this.orders = new Order[999];
	}
		
	// get the id of the account
	public String getId() {
		return this.id;
	}
	
	// set the id of the account
	public void setId(String id) {
		this.id = id;
	}
	
	// set the address of the account
	public void setBillingAddress(Address address) {
		this.billing_address = address;
	}
	
	// get the address of the account
	public Address getBillingAddress() {
		return this.billing_address;
	}
	
	//close the account and document the date
	public void closeAccount() {
		this.closed = new Date();
		this.is_closed = true;
	}
	
	
}

