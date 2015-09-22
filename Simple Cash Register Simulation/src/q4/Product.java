package q4;

public class Product {
	private String name;
	private double price;
	private int UPC;

	public Product(String name, double price, int UPC) {
		this.name = name;
		this.price = price;
		this.UPC = UPC;
	}
	
	public Product(Product anotherProduct){
		this.name = anotherProduct.name;
		this.price = anotherProduct.price;
		this.UPC = anotherProduct.UPC;
	}

	int getUPC() {
		return this.UPC;
	}
	
	double getPrice(){
		return this.price;
	}

	@Override
	public String toString() {
		return String.format("%-30s\t$%.2f\t%d", name, price, UPC);
	}
	
}
