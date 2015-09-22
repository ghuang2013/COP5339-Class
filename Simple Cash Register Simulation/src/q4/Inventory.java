package q4;

import java.util.ArrayList;

public class Inventory {
	private ArrayList<Product> productList;

	public Inventory() {
		productList = new ArrayList<>();
		productList.add(new Product("Snickers bar", 1, 101));
		productList.add(new Product("Haagen-Dazs Vanilla Icecream", 3.5, 102));
		productList.add(new Product("Ice Coffee", 2.2, 103));
		productList.add(new Product("Gummy Bear", 4.5, 104));
	}

	public void addProduct(Product newProduct) {
		productList.add(newProduct);
	}

	public Product findItem(int UPC) {
		for (Product product : productList) {
			if (product.getUPC() == UPC) {
				return new Product(product);
			}
		}
		return null;
	}
}
