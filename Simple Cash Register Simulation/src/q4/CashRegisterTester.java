package q4;

public class CashRegisterTester {
	public static void main(String args[]) {
		CashRegister cashRegister = new CashRegister();
		Buyer buyer = new Buyer("Guan Huang", 20);

		Transaction transaction = new Transaction(cashRegister, buyer);
		transaction.start();
	}
}
