package q4;

import java.util.ArrayList;

public class Receipt {
	private ArrayList<Product> purchasedProducts;
	private double totalPrice;
	private double totalWithTax;
	private Buyer buyer;

	public Receipt(Buyer buyer, ArrayList<Product> purchasedProducts, double totalPrice, double totalWithTax) {
		this.purchasedProducts = purchasedProducts;
		this.totalPrice = totalPrice;
		this.buyer = buyer;
		this.totalWithTax = totalWithTax;
	}

	@Override
	public String toString() {
		String content = "Receipt: \nGuan's Convenience Store\n";
		content += "Balance Summary:\n";
		for (Product product : purchasedProducts) {
			content += String.format("%s\n", product);
		}
		content += String.format("%d Subtotals: $%.2f\nAmount Paid: $%.2f\n", purchasedProducts.size(), totalPrice,
				totalWithTax);
		content += buyer.toString() + "\n";
		content += "Thank you for shopping with us. Have a wonderful day!\n";
		return content;
	}

}
