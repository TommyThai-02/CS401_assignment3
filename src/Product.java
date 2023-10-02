
public class Product {
	private String id;
	static private int idCount = 0;
	private String name;
	private Supplier supplier;
	
	public Product(String name, Supplier supplier) {
		this.id = Integer.toString(idCount++);
		this.name = name;
		this.supplier = supplier;
	}
}
