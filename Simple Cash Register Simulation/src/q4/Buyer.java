package q4;

public class Buyer {
	private String name;
	private double amountOfCash;

	public Buyer(String name, double amountOfCash) {
		this.name = name;
		this.amountOfCash = amountOfCash;
	}

	public Boolean paid(double amountToPay) {
		if (amountToPay > amountOfCash) {
			return false;
		}
		amountOfCash -= amountToPay;
		return true;
	}

	@Override
	public String toString() {
		return "Customer name: " + name;
	}
}
