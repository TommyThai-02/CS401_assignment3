public class LineItem {
	private int quantity;
	private Price price;
	private Product product;
	
	public LineItem(int quantity, Product product, Price price) {
		this.quantity = quantity;
		this.product = product;
		this.price = price;
	}
	
	public int getQuantity() {
		return this.quantity;
	}

	public Price getPrice() {
		return this.price;
	}

	public double itemTotal() {
		return this.price.getitemPrice() * this.quantity;
	}
}
