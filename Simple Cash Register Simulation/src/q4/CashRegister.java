package q4;

import java.util.ArrayList;

public class CashRegister {
	private Screen screen;
	private Inventory inventory;
	private ArrayList<Product> purchasedItems;
	private double total;
	private final double saleTax = 0.06;

	public CashRegister() {
		total = 0.0;
		screen = new Screen(System.out);
		inventory = new Inventory();
		purchasedItems = new ArrayList<>();
	}

	public void addAnItemToPurchasList(int UPC) {
		Product newProduct = inventory.findItem(UPC);
		if (newProduct != null) {
			purchasedItems.add(newProduct);
			screen.display(newProduct);
			total += newProduct.getPrice();
			screen.display(String.format("Total: $%.2f", total));
		} else {
			screen.display("Item does not exist in the inventory!");
		}
	}

	public double getTotalPrice() {
		return total;
	}

	public double getTotalPricePlusTax() {
		return total + (total * saleTax);
	}

	public void cancelTransaction() {
		total = 0.0;
		purchasedItems.clear();
		screen.display("There is a prroblem with payment. Transaction cancelled.");
	}

	public void printReceipt(Buyer buyer) {
		screen.display(new Receipt(buyer, purchasedItems, total, getTotalPricePlusTax()));
	}
}
