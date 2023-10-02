import java.util.Date;

// Shopping Cart class, for all attributes of the shopping cart class
public class ShoppingCart {
	private Date created;
	private int size;
	private LineItem[] line_items;
	
	public ShoppingCart() {
		created = new Date();
		line_items = new LineItem[999];
		size = 0;
	}
	
	public void addLineItem(LineItem item) {
		line_items[size] = item;
		size++;
	}
	
	public LineItem[] getItems() {
		return line_items;
	}

	public int getSize() {
		return this.size;
	}
	
	public void makeEmpty() {
		size = 0;
		this.line_items = new LineItem[999];
	}
	
}
