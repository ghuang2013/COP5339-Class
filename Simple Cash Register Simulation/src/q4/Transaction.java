package q4;

import java.util.Scanner;

public class Transaction {
	private CashRegister cashRegister;
	private UPCScanner codeScanner;
	private Buyer buyer;
	private States currentState;

	public Transaction(CashRegister cashRegister, Buyer buyer) {
		this.cashRegister = cashRegister;
		this.codeScanner = new UPCScanner(new Scanner(System.in));
		this.buyer = buyer;
		this.currentState = States.SCAN_ITEMS;
	}

	public void start() {
		while (currentState != States.TRANSACTION_END) {
			processTransaction();
		}
	}

	public void processTransaction() {
		switch (currentState) {
		case SCAN_ITEMS:
			if (codeScanner.lastItemScanned()) {
				currentState = States.PAYMENT;
			} else {
				int UPC = codeScanner.scanUPC();
				cashRegister.addAnItemToPurchasList(UPC);
			}
			break;
		case PAYMENT:
			if (buyer.paid(cashRegister.getTotalPricePlusTax())) {
				currentState = States.PRINT_RECEIPT;
			} else {
				cashRegister.cancelTransaction();
				currentState = States.TRANSACTION_END;
			}
			break;
		case PRINT_RECEIPT:
			cashRegister.printReceipt(buyer);
			currentState = States.TRANSACTION_END;
			break;
		default:
			break;
		}
	}

	private static enum States {
		SCAN_ITEMS, PAYMENT, PRINT_RECEIPT, TRANSACTION_END
	}
}
