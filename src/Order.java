import java.util.Date;


enum OrderStatus {
	New,Hold,Shipped,Delivered,Closed
}

// Order class, attributes and methods for Orders
public class Order {
	private String number;
	static private int numberCount = 0;
	private OrderStatus status;
	private Date ordered;
	private Date shipped;
	private int numItems;
	private double total;
	//order has line items linked to a specific product
	private LineItem[] line_items;
	//orders can have several payments or none
	private Payment[] payments;
	private int numPayments;
	private Address ship_to;

	public Order() {
		this.number = Integer.toString(numberCount++);
		this.status = OrderStatus.New;
		this.numItems = 0;
		this.line_items = new LineItem[999];
		this.payments = new Payment[999];
		this.ordered = new Date();
		
	}
	
	public String getNumber() {
		return this.number;
	}
	
	public OrderStatus getStatus() {
		return this.status;
	}
	
	public void Hold() {
		this.status = OrderStatus.Hold;
	}
	
	public void Shipped() {
		this.status = OrderStatus.Shipped;
		this.shipped = new Date();
	}
	
	public void Delivered() {
		this.status = OrderStatus.Delivered;
	}
	
	public void Closed() {
		this.status = OrderStatus.Closed;
	}
	
	
}
